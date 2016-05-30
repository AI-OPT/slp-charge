package com.ai.runner.center.charge.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.vo.PageInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfoQueryByAcctIdParam;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeBaseInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeDetailInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargePayTypeDetail;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfoQueryByCustIdParam;
import com.ai.runner.center.charge.api.paymentquery.param.PaymentQryParam;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeDetailLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargePayTypeLog;
import com.ai.runner.center.charge.service.atom.interfaces.IChgChargeDetailLogSV;
import com.ai.runner.center.charge.service.atom.interfaces.IChgChargeLogSV;
import com.ai.runner.center.charge.service.atom.interfaces.IChgChargePayTypeLogSV;
import com.ai.runner.center.charge.service.business.interfaces.IPaymentQueryCombSV;
import com.ai.runner.utils.util.BeanUtils;
import com.ai.runner.utils.util.CollectionUtil;


/**
 * 收费流水查询服务具体实现类
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Service
@Transactional
public class PaymentQueryCombSVImpl implements IPaymentQueryCombSV {
    
    private static final Log LOG = LogFactory.getLog(PaymentQueryCombSVImpl.class);

    @Autowired
    private IChgChargeLogSV chgChargeLogSV; 
    
    @Autowired
    private IChgChargeDetailLogSV chgChargeDetailLogSV;
    
    @Autowired
    private IChgChargePayTypeLogSV chgChargePayTypeLogSV;
    
    /**
     * 按照订单号查询收费记录
     */
    @Override
    public ChargeInfo queryChargeInfo(PaymentQryParam param) throws BusinessException {
        String tenantId = param.getTenantId();
        ChgChargeLog chgChargeLog = chgChargeLogSV.queryChgChargeLogByOrderId(tenantId,
                param.getOrderId());
        if (chgChargeLog == null) {
            return null;
        }

        List<ChgChargeDetailLog> chargeDetailLogs = chgChargeDetailLogSV
                .getChgChargeDetailLogByChargeId(chgChargeLog.getChargeId());
        return this.repackChargeInfo(chgChargeLog, chargeDetailLogs);
    }

    /**
     * 按照订单号查询收费明细
     */
    @Override
    public List<ChargePayTypeDetail> queryChargePayTypeDetails(PaymentQryParam param)
            throws BusinessException {
        List<ChargePayTypeDetail> payTypeDetails = new ArrayList<ChargePayTypeDetail>();
        List<ChgChargePayTypeLog> payTypeLogs = chgChargePayTypeLogSV
                .queryChgChargePayTypeLogsByOrderId(param.getTenantId(), param.getOrderId());
        if (CollectionUtil.isEmpty(payTypeLogs)) {
            return payTypeDetails;
        }

        for (ChgChargePayTypeLog payTypeLog : payTypeLogs) {
            ChargePayTypeDetail payTypeDetail = this.assembleChargePayTypeDetail(payTypeLog);
            payTypeDetails.add(payTypeDetail);
        }
        LOG.info("按订单号查询收费支付明细列表结束");
        return payTypeDetails;
    }
    
    /**
     * 按照收费流水号查询收费记录
     */
    @Override
    public ChargeInfo queryChargeInfo(long chargeId, String tenantId) throws BusinessException {
        ChgChargeLog chgChargeLog = chgChargeLogSV.getChgChargeLogByChargeId(chargeId);
        if(chgChargeLog == null) {
            return null;
        }
        
        //租户ID安全性校验
        if(!tenantId.equals(chgChargeLog.getTenantId())) {
            return null;
        }
        
        List<ChgChargeDetailLog> chargeDetailLogs = chgChargeDetailLogSV.getChgChargeDetailLogByChargeId(chargeId);
        return this.repackChargeInfo(chgChargeLog, chargeDetailLogs);
    }

    /**
     * 按照收费流水号查询收费明细
     */
    @Override
    public List<ChargePayTypeDetail> queryChargePayTypeDetails(long chargeId, String tenantId)
            throws BusinessException {
        List<ChargePayTypeDetail> payTypeDetails = new ArrayList<ChargePayTypeDetail>();
        List<ChgChargePayTypeLog> payTypeLogs = chgChargePayTypeLogSV.getChgChargePayTypeLogsByChargeId(chargeId);     
        if(CollectionUtil.isEmpty(payTypeLogs)) {
            return payTypeDetails;
        }
               
        for(ChgChargePayTypeLog payTypeLog : payTypeLogs) {
            //租户ID安全性校验
            if(!tenantId.equals(payTypeLog.getTenantId())) {
                continue;
            }
            ChargePayTypeDetail payTypeDetail = this.assembleChargePayTypeDetail(payTypeLog);
            payTypeDetails.add(payTypeDetail);
        }
        LOG.info("按收费流水号查询收费支付明细列表结束");
        return payTypeDetails;
    }

    /**
     * 按照账户ID查询收费基本信息
     */
    @Override
    public PageInfo<ChargeBaseInfo> queryChargeBaseInfoByAcctId(ChargeInfoQueryByAcctIdParam param)
            throws BusinessException {
        PageInfo<ChgChargeLog> chargeLogPageInfo = this.chgChargeLogSV.queryChgChargeLogByAcctId(param);
        PageInfo<ChargeBaseInfo> chargePageInfo = new PageInfo<ChargeBaseInfo>();
        List<ChargeBaseInfo> baseInfos = new ArrayList<ChargeBaseInfo>();
        if(!CollectionUtil.isEmpty(chargeLogPageInfo.getResult())) {
            for(ChgChargeLog chgChargeLog : chargeLogPageInfo.getResult()) {
                ChargeBaseInfo baseInfo = this.repackChargeBaseInfo(chgChargeLog);
                baseInfos.add(baseInfo);
            }
        }
        
        chargePageInfo.setCount(chargeLogPageInfo.getCount());
        chargePageInfo.setPageNo(chargeLogPageInfo.getPageNo());
        chargePageInfo.setPageSize(chargeLogPageInfo.getPageSize());
        chargePageInfo.setResult(baseInfos);
        LOG.info("按账户ID查询收费记录结束");
        return chargePageInfo;
    }

    /**
     * 按照客户ID查询收费流水基本信息
     */
    @Override
    public PageInfo<ChargeBaseInfo> queryChargeBaseInfoByCustId(ChargeInfoQueryByCustIdParam param)
            throws BusinessException {
        PageInfo<ChgChargeLog> chargeLogPageInfo = this.chgChargeLogSV.queryChgChargeLogByCustId(param);
        PageInfo<ChargeBaseInfo> chargePageInfo = new PageInfo<ChargeBaseInfo>();
        List<ChargeBaseInfo> baseInfos = new ArrayList<ChargeBaseInfo>();
        if(!CollectionUtil.isEmpty(chargeLogPageInfo.getResult())) {
            for(ChgChargeLog chgChargeLog : chargeLogPageInfo.getResult()) {
                ChargeBaseInfo baseInfo = this.repackChargeBaseInfo(chgChargeLog);
                baseInfos.add(baseInfo);
            }
        }
        
        chargePageInfo.setCount(chargeLogPageInfo.getCount());
        chargePageInfo.setPageNo(chargeLogPageInfo.getPageNo());
        chargePageInfo.setPageSize(chargeLogPageInfo.getPageSize());
        chargePageInfo.setResult(baseInfos);
        LOG.info("按客户ID查询收费记录结束");
        return chargePageInfo;
    }
    
    /**
     * 封装收费信息 
     * @param chgChargeLog
     * @param chargeDetailLogs
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    private ChargeInfo repackChargeInfo(ChgChargeLog chgChargeLog, List<ChgChargeDetailLog> chargeDetailLogs) {
        ChargeBaseInfo baseInfo = this.repackChargeBaseInfo(chgChargeLog);
        ChargeInfo info = new ChargeInfo();
        BeanUtils.copyProperties(info, baseInfo);
        List<ChargeDetailInfo> details = new ArrayList<ChargeDetailInfo>();
        if(!CollectionUtil.isEmpty(chargeDetailLogs)) {
            for(ChgChargeDetailLog chargeDetailLog : chargeDetailLogs) {
                ChargeDetailInfo detailInfo = this.assembleChargeDetailInfo(chargeDetailLog);
                details.add(detailInfo);
            }
        }
            
        info.setDetails(details);
        return info;
    }
    
    /**
     * 
     * @param chgChargePayTypeLog
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    private ChargePayTypeDetail assembleChargePayTypeDetail(ChgChargePayTypeLog chgChargePayTypeLog) {
        ChargePayTypeDetail payTypeDetail = new ChargePayTypeDetail();
        payTypeDetail.setPayTypeId(chgChargePayTypeLog.getPayTypeId());
        payTypeDetail.setPayStyle(chgChargePayTypeLog.getPayStyle());
        payTypeDetail.setPaidFee(chgChargePayTypeLog.getPaidFee().longValue());
        return payTypeDetail;
    }
    
    /**
     * 包装收费明细信息
     * @param chargeDetailLog
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    private ChargeDetailInfo assembleChargeDetailInfo(ChgChargeDetailLog chargeDetailLog) {
        ChargeDetailInfo detailInfo = new ChargeDetailInfo();
        detailInfo.setFeeDetailId(chargeDetailLog.getFeeDetailId());
        detailInfo.setFeeItemId(chargeDetailLog.getFeeItemId());
        detailInfo.setFeeType(chargeDetailLog.getFeeType());
        detailInfo.setTotalFee(chargeDetailLog.getTotalFee() == null ? 0 : chargeDetailLog.getTotalFee().longValue());
        detailInfo.setDiscountFee(chargeDetailLog.getDiscountFee() == null ? 0 : chargeDetailLog.getDiscountFee().longValue());
        detailInfo.setOperDiscountFee(chargeDetailLog.getOperDiscountFee() == null ? 0 : chargeDetailLog.getOperDiscountFee().longValue());       
        detailInfo.setChargeFee(chargeDetailLog.getChargeFee() == null ? 0 : chargeDetailLog.getChargeFee().longValue());
        return detailInfo;
    }
    
    /**
     * 包装收费流水基本信息
     * @param chgChargeLog
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    private ChargeBaseInfo repackChargeBaseInfo(ChgChargeLog chgChargeLog) {
        ChargeBaseInfo info = new ChargeBaseInfo();
        info.setChargeId(chgChargeLog.getChargeId());
        info.setAcctId(chgChargeLog.getAcctId() == null ? 0 : chgChargeLog.getAcctId().longValue());
        info.setCustId(chgChargeLog.getCustId() == null ? 0 : chgChargeLog.getCustId().longValue());
        info.setOrderId(chgChargeLog.getOrderId());
        info.setBusiType(chgChargeLog.getBusiType());
        info.setBusiOperCode(chgChargeLog.getBusiOperCode());
        info.setTenantId(chgChargeLog.getTenantId());
        info.setPayChannel(chgChargeLog.getPayChannel());
        info.setBatchCode(chgChargeLog.getBatchCode());
        info.setTotalFee(chgChargeLog.getTotalFee() == null ? 0 : chgChargeLog.getTotalFee().longValue());
        info.setDiscountFee(chgChargeLog.getDiscountFee() == null ? 0 : chgChargeLog.getDiscountFee().longValue());
        info.setOperDiscountFee(chgChargeLog.getOperDiscountFee() == null ? 0 : chgChargeLog.getOperDiscountFee().longValue());
        info.setChargeFee(chgChargeLog.getChargeFee() == null ? 0 : chgChargeLog.getChargeFee().longValue());
        info.setPaidFee(chgChargeLog.getPaidFee() == null ? 0 : chgChargeLog.getPaidFee().longValue());
        info.setCreateTime(chgChargeLog.getCreateTime());
        info.setStatus(chgChargeLog.getStatus());
        info.setLastStatusDate(chgChargeLog.getLastStatusDate());
        info.setPrintTimes(chgChargeLog.getPrintTimes());
        info.setChlId(chgChargeLog.getChlId());
        info.setOperId(chgChargeLog.getOperId());
        info.setCheckStatus(chgChargeLog.getCheckStatus() == null ? 0 : chgChargeLog.getCheckStatus().intValue());
        info.setCheckTime(chgChargeLog.getCheckTime());
        info.setCancelChargeId(chgChargeLog.getCancelChargeId() == null ? 0 : chgChargeLog.getCancelChargeId().longValue());
        info.setRemark(chgChargeLog.getRemark());
        return info;
    }
    
}
