package com.ai.runner.center.charge.service.business.interfaces;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.charge.api.payment.param.PaymentParam;

/**
 * 收费管理事务处理服务<br>
 * Date: 2015年8月7日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface IPaymentManagerSV {
    
    long payment(PaymentParam paymentParam) throws BusinessException;
    
}
