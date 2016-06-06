package com.ai.slp.charge.api.payment.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.charge.api.payment.param.PaymentParam;

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
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0001
     */
    long payment(PaymentParam paymentParam) throws BusinessException,SystemException;
}
