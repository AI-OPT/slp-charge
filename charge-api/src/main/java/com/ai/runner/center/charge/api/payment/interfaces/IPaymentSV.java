package com.ai.runner.center.charge.api.payment.interfaces;

import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.charge.api.payment.param.PaymentParam;

/**
 * 创建收费记录 Date: 2015年8月7日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface IPaymentSV {
    
    /**
     * 创建收费流水记录<br>
     * @param paymentParam 收费记录创建请求参数
     * @return 收费流水号
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0001
     */
    long payment(PaymentParam paymentParam) throws CallerException;
}
