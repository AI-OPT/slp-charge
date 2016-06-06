package com.ai.slp.charge.service.business.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeBaseInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfoQueryByAcctIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfoQueryByCustIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargePayTypeDetail;
import com.ai.slp.charge.api.paymentquery.param.PaymentQryParam;

/**
 * 收费流水查询服务定义类
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IPaymentQueryCombSV {
    
    ChargeInfo queryChargeInfo(PaymentQryParam param) throws BusinessException;
    
    List<ChargePayTypeDetail> queryChargePayTypeDetails(PaymentQryParam param) throws BusinessException;
    
    ChargeInfo queryChargeInfo(long chargeId, String tenantId) throws BusinessException;
    
    List<ChargePayTypeDetail> queryChargePayTypeDetails(long chargeId, String tenantId) throws BusinessException;
    
    PageInfo<ChargeBaseInfo> queryChargeBaseInfoByAcctId(ChargeInfoQueryByAcctIdParam param) throws BusinessException;
    
    PageInfo<ChargeBaseInfo> queryChargeBaseInfoByCustId(ChargeInfoQueryByCustIdParam param) throws BusinessException;
}
