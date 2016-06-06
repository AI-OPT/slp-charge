package com.ai.slp.charge.api.payment.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.charge.api.payment.interfaces.IPaymentSV;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.ai.slp.charge.constants.ExceptCodeConstants;
import com.ai.slp.charge.service.business.interfaces.IPaymentManagerSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 创建收费记录 （Dubbo服务实现）
 * 
 * Date: 2015年8月13日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Service
@Component
public class PaymentSVImpl implements IPaymentSV {
    
    private static final Log LOG = LogFactory.getLog(PaymentSVImpl.class);
    
    @Autowired
    private IPaymentManagerSV paymentManagerSV;

    @Override
    public long payment(PaymentParam paymentParam) throws BusinessException,SystemException {
        LOG.info("开始创建收费记录");
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
        
        long chargeId = this.paymentManagerSV.payment(paymentParam);        
        LOG.info("创建收费记录成功");
        return chargeId;
    }

}
