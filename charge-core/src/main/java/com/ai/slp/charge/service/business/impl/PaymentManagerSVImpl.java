package com.ai.slp.charge.service.business.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.slp.charge.api.payment.param.ChargeDetail;
import com.ai.slp.charge.api.payment.param.PayTypeDetail;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.ai.slp.charge.constants.ChargeCostants;
import com.ai.slp.charge.constants.ExceptCodeConstants;
import com.ai.slp.charge.dao.mapper.bo.ChgChargeDetailLog;
import com.ai.slp.charge.dao.mapper.bo.ChgChargeLog;
import com.ai.slp.charge.dao.mapper.bo.ChgChargePayTypeLog;
import com.ai.slp.charge.service.atom.interfaces.IChgChargeDetailLogSV;
import com.ai.slp.charge.service.atom.interfaces.IChgChargeLogSV;
import com.ai.slp.charge.service.atom.interfaces.IChgChargePayTypeLogSV;
import com.ai.slp.charge.service.business.interfaces.IPaymentManagerSV;
import com.ai.slp.charge.util.ChargeSeqUtil;

/**
 * 收费流水记录管理
 * Date: 2015年8月7日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
@Service
@Transactional
public class PaymentManagerSVImpl implements IPaymentManagerSV {
    
    private static final Log LOG = LogFactory.getLog(PaymentManagerSVImpl.class);
    
    @Autowired
    private IChgChargeLogSV chgChargeLogSV;
    
    @Autowired
    private IChgChargeDetailLogSV chgChargeDetailLogSV;
    
    @Autowired
    private IChgChargePayTypeLogSV chgChargePayTypeLogSV;
    
    @Override
    public long payment(PaymentParam paymentParam) throws BusinessException {
        /*1. 参数验证*/
        this.validate(paymentParam);
        /*2. 幂等性验证*/
        long originalChargeId = this.validateDuplication(paymentParam);
        if(originalChargeId > 0) {
            return originalChargeId;
        }
        /*3. 保存收费流水、收费明细、支付详情信息*/
        Long chargeId = ChargeSeqUtil.createChargeId();
        this.saveChargeInfo(chargeId, paymentParam);
        this.saveChargeDetails(chargeId, paymentParam);
        this.saveChargePayTypeDetail(chargeId, paymentParam);
        return chargeId;
    }
    
    /**
     * 保存收费流水
     * @param chargeId
     * @param paymentParam
     * @author fanpw
     * @ApiDocMethod
     */
    private void saveChargeInfo(Long chargeId, PaymentParam paymentParam) {      
        ChgChargeLog chgChargeLog = new ChgChargeLog();
        chgChargeLog.setChargeId(chargeId);
        chgChargeLog.setTenantId(paymentParam.getTenantId());
        chgChargeLog.setOrderId(paymentParam.getOrderId());
        chgChargeLog.setBusiType(paymentParam.getBusiType());
        chgChargeLog.setBusiOperCode(paymentParam.getBusiOperCode());
        chgChargeLog.setPayChannel(ChargeCostants.ChgChargeLog.PayChannel.BUSINESS_HALL);
        if(paymentParam.getCustId() != 0l) {
            chgChargeLog.setCustId(paymentParam.getCustId());
        }        
        if(paymentParam.getAcctId() != 0l) {
            chgChargeLog.setAcctId(paymentParam.getAcctId());
        }
        chgChargeLog.setTotalFee(paymentParam.getTotalFee());
        chgChargeLog.setDiscountFee(paymentParam.getDiscountFee());
        chgChargeLog.setOperDiscountFee(paymentParam.getOperDiscountFee());
        chgChargeLog.setChargeFee(paymentParam.getChargeFee());
        chgChargeLog.setPaidFee(paymentParam.getPaidFee());
        chgChargeLog.setCreateTime(DateUtil.getSysDate());
        chgChargeLog.setStatus(paymentParam.getStatus());
        chgChargeLog.setCancelChargeId(paymentParam.getCancelChargeId());
        chgChargeLog.setLastStatusDate(DateUtil.getSysDate());
        chgChargeLog.setPrintTimes(ChargeCostants.ChgChargeLog.PrintTimes.NEVER);
        chgChargeLog.setOpProvCode(paymentParam.getProvinceCode());
        chgChargeLog.setOpCityCode(paymentParam.getCityCode());        
        chgChargeLog.setChlId(paymentParam.getApplyChlId());
        chgChargeLog.setOperId(paymentParam.getOperId());
        chgChargeLog.setCheckStatus(ChargeCostants.ChgChargeLog.CheckStatus.UNCHECK);

        this.chgChargeLogSV.saveChgChargeLog(chgChargeLog);
    }
    
    /**
     * 保存对应的费用明细信息
     * @param chargeId
     * @param paymentParam
     * @author fanpw
     * @ApiDocMethod
     */
    public void saveChargeDetails(Long chargeId, PaymentParam paymentParam) {
        List<ChargeDetail> chargeDetails = paymentParam.getChargeDetail();
        if(CollectionUtil.isEmpty(chargeDetails)) {
            return;   
        }
        
        ChgChargeDetailLog chargeDetailLog = null;        
        for(ChargeDetail chargeDetail : chargeDetails) {
            chargeDetailLog = new ChgChargeDetailLog();
            chargeDetailLog.setFeeDetailId(ChargeSeqUtil.createChargeFeeDetailId());
            chargeDetailLog.setTenantId(paymentParam.getTenantId());
            chargeDetailLog.setChargeId(chargeId);
            chargeDetailLog.setOrderId(paymentParam.getOrderId());
            chargeDetailLog.setFeeItemId(chargeDetail.getFeeItemId());
            chargeDetailLog.setTotalFee(chargeDetail.getTotalFee());
            chargeDetailLog.setDiscountFee(chargeDetail.getDiscountFee());
            chargeDetailLog.setOperDiscountFee(chargeDetail.getOperDiscountFee());
            chargeDetailLog.setChargeFee(chargeDetail.getChargeFee());
            chargeDetailLog.setFeeType(chargeDetail.getFeeType());
            this.chgChargeDetailLogSV.saveChgChargeDetailLog(chargeDetailLog);
        }        
    }
    
    /**
     * 保存对应的支付明细信息
     * @param chargeId
     * @param paymentParam
     * @author fanpw
     * @ApiDocMethod
     */
    public void saveChargePayTypeDetail(Long chargeId, PaymentParam paymentParam) {
        List<PayTypeDetail> payTypeDetails = paymentParam.getPayTypeDetail();
        if(CollectionUtil.isEmpty(payTypeDetails)) {
            return;
        }
        
        ChgChargePayTypeLog payTypeLog = null;
        for(PayTypeDetail payTypeDetail : payTypeDetails) {
            payTypeLog = new ChgChargePayTypeLog();
            payTypeLog.setPayTypeId(ChargeSeqUtil.createChargePayTypeId());
            payTypeLog.setChargeId(chargeId);
            payTypeLog.setTenantId(paymentParam.getTenantId());
            payTypeLog.setOrderId(paymentParam.getOrderId());
            payTypeLog.setPayStyle(payTypeDetail.getPayStyle());
            payTypeLog.setPaidFee(payTypeDetail.getPaidFee());
            this.chgChargePayTypeLogSV.saveChgChargePayTypeLog(payTypeLog);
        }
        
    }
        
    /**
     * 幂等性验证
     * @param paymentParam
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     */
    private long validateDuplication(PaymentParam paymentParam) throws BusinessException {
        ChgChargeLog chgChargeLog = this.chgChargeLogSV.queryChgChargeLogByOrderId(
                paymentParam.getTenantId(), paymentParam.getOrderId());
        if (chgChargeLog != null) {
            LOG.info("收费流水记录已创建!");
            return chgChargeLog.getChargeId();
        }

        return -1;
    }
    
    /**
     * 参数验证
     * @param param
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     */
    private void validate(PaymentParam param) throws BusinessException {
        if(StringUtil.isBlank(param.getBusiType())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:业务类型不能为空");
        }
        
        if(StringUtil.isBlank(param.getBusiOperCode())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:业务操作类型不能为空");
        }
        
        if (param.getStatus() == null
                || (ChargeCostants.ChgChargeLog.Status.PAYMENT != param.getStatus().intValue() && ChargeCostants.ChgChargeLog.Status.PAYMENT_REVERSAL != param
                        .getStatus().intValue())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "传入的收费状态有误");
        }
        
        if(param.getCancelChargeId() == null && ChargeCostants.ChgChargeLog.Status.PAYMENT_REVERSAL == param.getStatus().intValue()) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "订单取消或撤单时需传入原订单对应的收费流水号");
        }
         
        String busiType = param.getBusiType();
        if (!ChargeCostants.ChgChargeLog.BusiType.ORDER_CHARGE.equals(busiType)
                && !ChargeCostants.ChgChargeLog.BusiType.ACCOUNT_CHARGE.equals(busiType)) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_WRONG, "传入的业务操作类型有误");
        }        
        
        if(ChargeCostants.ChgChargeLog.BusiType.ORDER_CHARGE.equals(busiType) && param.getCustId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "订单收费类客户ID不能为空");
        } 
        
        if(param.getAcctId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "账户ID不能为空");
        } 
        
        /*1. 检验费用明细入参*/
        List<ChargeDetail> chargeDetails = param.getChargeDetail();
        if(!CollectionUtil.isEmpty(chargeDetails)) {
            for(ChargeDetail chargeDetail : chargeDetails) {
                if(StringUtil.isBlank(chargeDetail.getFeeItemId())) {
                    throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "费用科目ID不能为空");
                }
                
                if(chargeDetail.getTotalFee() == null) {
                    throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "原始费用不能为空");
                }
                
                if(chargeDetail.getChargeFee() == null) {
                    throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "应收金额不能为空");
                }
                
                if(StringUtil.isBlank(chargeDetail.getFeeType())) {
                    throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "费用类型不能为空");
                }  
            }
        }

        /*2. 检验支付明细入参*/
        List<PayTypeDetail> payTypeDetails = param.getPayTypeDetail();
        if(CollectionUtil.isEmpty(payTypeDetails)) {
            return;
        }
        
        for(PayTypeDetail payTypeDetail : payTypeDetails) {
            if(payTypeDetail.getPayStyle() == 0) {
                throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "支付方式不能为空");
            }
            
            if(payTypeDetail.getPaidFee() == null) {
                throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "支付金额不能为空");
            }
        }
    }

}
