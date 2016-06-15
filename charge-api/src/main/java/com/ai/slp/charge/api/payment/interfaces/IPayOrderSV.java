package com.ai.slp.charge.api.payment.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.charge.api.payment.param.PayOrderParam;
import com.ai.slp.charge.api.payment.param.PaymentParam;

/**
 * 缴费订单处理接口
 * Date: 2015年8月7日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface IPayOrderSV {
    /**
     * 创建支付订单
     * @param payOrderParam
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod CHG_0021
     */
    String createPayOrder(PayOrderParam payOrderParam) throws BusinessException,SystemException;
    /**
     * 修改支付订单
     * @param payOrderParam
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod CHG_0022
     */
    String updatePayOrder(PayOrderParam payOrderParam) throws BusinessException,SystemException;
    /**
     * 支付回调
     * @param payOrderParam
     * @param paymentParam
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod  CHG_0023
     */
    String callPayOrder(PayOrderParam payOrderParam ,PaymentParam paymentParam) throws BusinessException,SystemException;

    /**
     * 
     * @param orderId
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author LiangMeng
     * @ApiDocMethod
     */
    PayOrderParam queryPayOrder(String orderId) throws BusinessException,SystemException;
}

