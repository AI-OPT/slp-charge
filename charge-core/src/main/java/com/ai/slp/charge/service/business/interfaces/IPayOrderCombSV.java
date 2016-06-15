package com.ai.slp.charge.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.charge.api.payment.param.PayOrderParam;
import com.ai.slp.charge.api.payment.param.PaymentParam;

/**
 * 
 * Date: 2016年6月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface IPayOrderCombSV {
    
    
    /**
     * 创建支付订单
     * @param payOrderParam
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod
     */
    String createPayOrder(PayOrderParam payOrderParam) throws BusinessException,SystemException;
    /**
     * 修改缴费订单
     * @param payOrderParam
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod
     */
    String updatePayOrder(PayOrderParam payOrderParam) throws BusinessException,SystemException;
    /**
     * 缴费订单回调
     * @param payOrderParam
     * @param paymentParam
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod
     */
    String callPayOrder(PayOrderParam payOrderParam ,PaymentParam paymentParam) throws BusinessException,SystemException;

    PayOrderParam queryPayOrder(String orderId) throws BusinessException,SystemException;
}
