package com.ai.slp.charge.api.paymentquery.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeBaseInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfoQueryByAcctIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfoQueryByCustIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargePayTypeDetail;
import com.ai.slp.charge.api.paymentquery.param.PaymentQryParam;

/**
 * 收费流水查询服务.<br>
 * 此服务提供以下几种方式查询收费流水：<br>
 * 通过订单号查询收费流水信息<br>
 * 通过订单号查询支付明细列表<br>
 * 通过收费流水号查询收费流水信息<br>
 * 通过收费流水号查询支付明细列表<br>
 * 按账户标识查询缴费记录<br> 
 * 按客户标识查询缴费记录<br>
 * Date: 2015年8月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IPaymentQuerySV {
    
    /**
     * 通过订单号查询收费流水信息.<br>
     * @param param 收费记录查询入参,其中订单号、业务类型、租户ID为必填项
     * @return 收费流水信息
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0002
     */
    ChargeInfo queryChargeInfoByOrderId(PaymentQryParam param) throws BusinessException,SystemException;
    
    /**
     * 通过订单号查询支付明细列表.<br>
     * @param param 收费记录查询入参,其中订单号、业务类型、租户ID为必填项
     * @return 支付明细列表
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0004
     */
    List<ChargePayTypeDetail> queryChargePayTypeDetailsByOrderId(PaymentQryParam param) throws BusinessException,SystemException;
    
    /**
     * 通过收费流水号查询收费流水信息.<br>
     * @param param 收费流水号
     * @return 收费流水信息
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0003
     */
    ChargeInfo queryChargeInfoByChargeId(ChargeIdParam param) throws BusinessException,SystemException;
    
    /**
     * 通过收费流水号查询支付明细列表.<br>
     * @param param 收费流水号
     * @return 支付明细列表
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0005
     */
    List<ChargePayTypeDetail> queryChargePayTypeDetailsByChargeId(ChargeIdParam param) throws BusinessException,SystemException;
    
    /**
     * 按账户标识查询缴费记录.<br> 
     * @param param 账户ID
     * @return 收费流水信息列表
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0006
     */
    PageInfo<ChargeBaseInfo> queryChargeBaseInfoByAcctId(ChargeInfoQueryByAcctIdParam param) throws BusinessException,SystemException;
    
    /**
     * 按客户标识查询缴费记录.<br>
     * @param param 客户ID
     * @return 收费流水信息列表
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0007
     */
    PageInfo<ChargeBaseInfo> queryChargeBaseInfoByCustId(ChargeInfoQueryByCustIdParam param) throws BusinessException,SystemException;
}
