package com.ai.runner.center.charge.service.business.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.charge.api.invoice.param.InvoiceFeeDetail;
import com.ai.runner.center.charge.api.invoice.param.InvoiceTax;
import com.ai.runner.center.charge.api.invoice.param.InvoiceTaxQryParam;
import com.ai.runner.center.charge.api.invoice.param.OrderInvoicePrintDetail;
import com.ai.runner.center.charge.api.invoice.param.OrderInvoicePrintReq;
import com.ai.runner.center.charge.api.invoice.param.TaxPrintLog;
import com.ai.runner.center.charge.constants.ChargeCostants;
import com.ai.runner.center.charge.constants.ExceptCodeConstants;
import com.ai.runner.center.charge.dao.mapper.bo.AccInvoiceTax;
import com.ai.runner.center.charge.dao.mapper.bo.AccTaxPrintLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeDetailLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLog;
import com.ai.runner.center.charge.service.atom.interfaces.IAccInvoiceTaxSV;
import com.ai.runner.center.charge.service.atom.interfaces.IChgChargeDetailLogSV;
import com.ai.runner.center.charge.service.atom.interfaces.IChgChargeLogSV;
import com.ai.runner.center.charge.service.business.interfaces.IAccTaxPrintLogSV;
import com.ai.runner.center.charge.service.business.interfaces.IInvoicePrintCombSV;
import com.ai.runner.center.charge.util.FunSubjectUtil;
import com.ai.runner.center.charge.vo.SubjectVo;
import com.ai.runner.utils.util.BeanUtils;
import com.ai.runner.utils.util.CollectionUtil;
import com.ai.runner.utils.util.DateUtil;

/**
 * 发票凭证打印业务实现类
 * 
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Service
@Transactional
public class InvoicePrintCombSVImpl implements IInvoicePrintCombSV {
    
    private static final Log LOG = LogFactory.getLog(InvoicePrintCombSVImpl.class);

    @Autowired
    private IAccInvoiceTaxSV accInvoiceTaxSV;
    
    @Autowired
    private IChgChargeLogSV chgChargeLogSV; 
    
    @Autowired
    private IChgChargeDetailLogSV chgChargeDetailLogSV;
        
    @Autowired
    private IAccTaxPrintLogSV accTaxPrintLogSV;

    @Override
    public InvoiceTax queryInvoiceTax(InvoiceTaxQryParam param) throws BusinessException {
        AccInvoiceTax accInvoiceTax = this.accInvoiceTaxSV.getAccInvoiceTax(param.getTenantId(),
                param.getProvinceCode(), param.getCityCode());
        if (accInvoiceTax == null) {
            accInvoiceTax = this.accInvoiceTaxSV.getAccInvoiceTax(ChargeCostants.TenantCode.ALL,
                    ChargeCostants.ProvinceCode.ALL, ChargeCostants.CityCode.ALL);
        }

        if(accInvoiceTax == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "查询不到对应的发票税率信息， 请配置一套全国统一发票税率");
        }
        
        InvoiceTax invoiceTax = new InvoiceTax();
        BeanUtils.copyProperties(invoiceTax, accInvoiceTax);
        return invoiceTax;
    }

    @Override
    public OrderInvoicePrintDetail queryOrderInvoicePrintDetail(OrderInvoicePrintReq req)
            throws BusinessException {
        LOG.info("订单发票打印数据提取开始");
        ChgChargeLog chgChargeLog = chgChargeLogSV.queryChgChargeLogByOrderId(req.getTenantId(), req.getOrderId());
        if(chgChargeLog == null) {
            return null;
        }
        OrderInvoicePrintDetail orderInvoicePrintDetail = new OrderInvoicePrintDetail();
        orderInvoicePrintDetail.setTenantId(chgChargeLog.getTenantId());
        orderInvoicePrintDetail.setOrderId(chgChargeLog.getOrderId());
        orderInvoicePrintDetail.setCustId(chgChargeLog.getCustId());
        orderInvoicePrintDetail.setAcctId(chgChargeLog.getAcctId());
       
        List<ChgChargeDetailLog> chargeDetailLogs = chgChargeDetailLogSV
                .getChgChargeDetailLogByChargeId(chgChargeLog.getChargeId());
        List<InvoiceFeeDetail> printSummary = new ArrayList<InvoiceFeeDetail>();
        long basicFee = 0l;
        long addedValueFee = 0l;
        long terminalFee = 0l;
        String tenantId = req.getTenantId();
        if(!CollectionUtil.isEmpty(chargeDetailLogs)) {
            InvoiceFeeDetail invoiceFeeDetail = null;
            for(ChgChargeDetailLog chargeDetailLog : chargeDetailLogs) {
                String feeItemId = chargeDetailLog.getFeeItemId();
                SubjectVo subjectVo = FunSubjectUtil.getSubject(tenantId, Long.parseLong(feeItemId));
                if(subjectVo == null) {
                    throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "在缓存中查询不到科目ID[" + feeItemId + "]的科目信息");
                }
                Integer taxType = subjectVo.getTaxType();
                if(taxType == null) {
                    continue;
                }
                
                invoiceFeeDetail = new InvoiceFeeDetail();
                invoiceFeeDetail.setFeeItemId(feeItemId);
                invoiceFeeDetail.setFeeItemName(subjectVo.getSubjectName());
                invoiceFeeDetail.setAmount(chargeDetailLog.getChargeFee());
                printSummary.add(invoiceFeeDetail);
                if(ChargeCostants.TaxType.BASIC_FEE == taxType.intValue()) {
                    basicFee += chargeDetailLog.getChargeFee();
                } else if(ChargeCostants.TaxType.ADDED_VALUE_FEE == taxType.intValue()) {
                    addedValueFee += chargeDetailLog.getChargeFee();
                } else if(ChargeCostants.TaxType.TERMINAL_FEE == taxType.intValue()) {
                    terminalFee += chargeDetailLog.getChargeFee();
                }

            }
        }
        long totalAmount = basicFee + addedValueFee + terminalFee;
        orderInvoicePrintDetail.setPrintAmount(totalAmount);
        orderInvoicePrintDetail.setPrintSummary(printSummary);
        orderInvoicePrintDetail.setBasicFee(basicFee);
        orderInvoicePrintDetail.setAddedValueFee(addedValueFee);
        orderInvoicePrintDetail.setTerminalFee(terminalFee);
        LOG.info("订单发票打印数据提取成功");
        return orderInvoicePrintDetail;
    }

    @Override
    public void saveTaxPrintLog(TaxPrintLog log) throws BusinessException {
        AccTaxPrintLog accTaxPrintLog = new AccTaxPrintLog(); 
        BeanUtils.copyProperties(accTaxPrintLog, log);
        Timestamp sysDate = DateUtil.getSysDate();
        accTaxPrintLog.setPrintDate(DateUtil.getTimestamp(log.getPrintDateStr(), DateUtil.DATETIME_FORMAT));
        accTaxPrintLog.setCreateTime(sysDate);
        accTaxPrintLog.setLastStatusDate(sysDate);
        this.accTaxPrintLogSV.saveAccTaxPrintLog(accTaxPrintLog);
    }

}
