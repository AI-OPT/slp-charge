package com.ai.slp.charge.api.payment.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.charge.api.payment.interfaces.IPayOrderSV;
import com.ai.slp.charge.api.payment.param.PayOrderParam;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.ai.slp.charge.constants.ExceptCodeConstants;
import com.ai.slp.charge.service.business.interfaces.IPayOrderCombSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class PayOrderSVImpl implements IPayOrderSV {
    private static final Log LOG = LogFactory.getLog(PayOrderSVImpl.class);
    
    @Autowired
    private IPayOrderCombSV payOrderCombSV;
    
    @Override
    public String createPayOrder(PayOrderParam payOrderParam) throws BusinessException,
            SystemException {
        LOG.info("创建缴费订单开始"); 
        if (payOrderParam == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:缴费订单记录创建入参不能为空");
        }
        
        if (StringUtil.isBlank(payOrderParam.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (StringUtil.isBlank(payOrderParam.getAcctId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:账户ID不能为空");
        }
        if (payOrderParam.getPayChannel()==0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:支付渠道不能为空");
        }

        if (payOrderParam.getPayAmount()==0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:交易金额不能为空");
        }
        return payOrderCombSV.createPayOrder(payOrderParam);
    }

    @Override
    public String updatePayOrder(PayOrderParam payOrderParam) throws BusinessException,
            SystemException {
        LOG.info("修改缴费订单状态");
        if (payOrderParam == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:缴费订单记录创建入参不能为空");
        }

        if (StringUtil.isBlank(payOrderParam.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号（业务流水号）不能为空");
        }
        
        if (payOrderParam.getStatus()==0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:支付状态不能为空");
        }
        return payOrderCombSV.updatePayOrder(payOrderParam);
    }

    @Override
    public String callPayOrder(PayOrderParam payOrderParam, PaymentParam paymentParam)
            throws BusinessException, SystemException {
        LOG.info("缴费订单回调");
        if (payOrderParam == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:缴费订单记录创建入参不能为空");
        }

        if (StringUtil.isBlank(payOrderParam.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号不能为空");
        }
        if (payOrderParam.getStatus()==0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单状态不能为空");
        }
        if (StringUtil.isBlank(payOrderParam.getPayOrgId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:第三方支付机构名称不能为空");
        }
        if (StringUtil.isBlank(payOrderParam.getPayOrgSerial())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:第三方支付机构流水不能为空");
        }
        
        
        if (paymentParam == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录创建入参不能为空");
        }
        
        if (StringUtil.isBlank(paymentParam.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (StringUtil.isBlank(paymentParam.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号（业务流水号）不能为空");
        }
        
        if(paymentParam.getTotalFee() == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "总费用不能为空");
        }
        
        if(paymentParam.getChargeFee() == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "应收金额不能为空");
        }
        
        if(paymentParam.getPaidFee() == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "实收金额不能为空");
        }
         
        if(StringUtil.isBlank(paymentParam.getApplyChlId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:操作渠道ID不能为空");
        }
        
        return payOrderCombSV.callPayOrder(payOrderParam, paymentParam);
    }

}
