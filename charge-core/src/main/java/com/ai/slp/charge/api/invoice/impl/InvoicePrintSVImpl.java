package com.ai.slp.charge.api.invoice.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.exception.CallerException;
import com.ai.slp.charge.api.invoice.interfaces.IInvoicePrintSV;
import com.ai.slp.charge.api.invoice.param.InvoiceTax;
import com.ai.slp.charge.api.invoice.param.InvoiceTaxQryParam;
import com.ai.slp.charge.api.invoice.param.OrderInvoicePrintDetail;
import com.ai.slp.charge.api.invoice.param.OrderInvoicePrintReq;
import com.ai.slp.charge.api.invoice.param.TaxPrintLog;
import com.ai.slp.charge.constants.ExceptCodeConstants;
import com.ai.slp.charge.service.business.interfaces.IInvoicePrintCombSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 发票凭证打印服务（Dubbo服务实现）
 * 
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Service
@Component
public class InvoicePrintSVImpl implements IInvoicePrintSV {

    private static final Log LOG = LogFactory.getLog(InvoicePrintSVImpl.class);
    
    @Autowired
    private IInvoicePrintCombSV invoicePrintCombSV;
    
    /**
     * 发票税率查询
     */
    @Override
    public InvoiceTax queryInvoiceTax(InvoiceTaxQryParam param) throws CallerException {
        LOG.info("发票税率查询开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:发票税率查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if(StringUtil.isBlank(param.getProvinceCode())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:省份编码不能为空");
        }
        
        if(StringUtil.isBlank(param.getCityCode())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:地市编码不能为空");
        }
        
        return invoicePrintCombSV.queryInvoiceTax(param);
    }

    /**
     * 订单发票打印数据提取
     */
    @Override
    public OrderInvoicePrintDetail queryOrderInvoicePrintDetail(OrderInvoicePrintReq req)
            throws CallerException {
        if (req == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单发票打印请求报文体不能为空");
        }
        
        if (StringUtil.isBlank(req.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (StringUtil.isBlank(req.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号不能为空");
        }
        
        return invoicePrintCombSV.queryOrderInvoicePrintDetail(req);
    }

    /**
     * 记录增值税发票打印日志
     */
    @Override
    public void saveTaxPrintLog(TaxPrintLog log) throws CallerException {
        LOG.info("保存增值税发票打印记录开始");
        if (log == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单发票打印请求报文体不能为空");
        }
        
        if (StringUtil.isBlank(log.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (StringUtil.isBlank(log.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号不能为空");
        }
        
        if(log.getCustId() == null || log.getCustId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:客户标识不能为空");
        }
        
        if(log.getTotalAmount() == null || log.getTotalAmount() <= 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:发票总金额必须大于零");
        }
        
        if (StringUtil.isBlank(log.getPrintDateStr())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:打印日期不能为空");
        }
        
        if(!DateUtil.isValidDate(log.getPrintDateStr(), DateUtil.DATETIME_FORMAT)) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:打印日期传入格式有误");
        }
        invoicePrintCombSV.saveTaxPrintLog(log);
        LOG.info("保存增值税发票打印记录结束");
    }

}
