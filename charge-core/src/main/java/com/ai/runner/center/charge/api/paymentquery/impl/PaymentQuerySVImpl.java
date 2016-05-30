package com.ai.runner.center.charge.api.paymentquery.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.exception.CallerException;
import com.ai.runner.base.vo.PageInfo;
import com.ai.runner.center.charge.api.paymentquery.interfaces.IPaymentQuerySV;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfoQueryByAcctIdParam;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeBaseInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeIdParam;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargePayTypeDetail;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfoQueryByCustIdParam;
import com.ai.runner.center.charge.api.paymentquery.param.PaymentQryParam;
import com.ai.runner.center.charge.constants.ExceptCodeConstants;
import com.ai.runner.center.charge.service.business.interfaces.IPaymentQueryCombSV;
import com.ai.runner.utils.util.StringUtil;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 收费流水查询服务（Dubbo服务实现）
 * 
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Service
@Component
public class PaymentQuerySVImpl implements IPaymentQuerySV {

    private static final Log LOG = LogFactory.getLog(PaymentQuerySVImpl.class);
    
    @Autowired
    private IPaymentQueryCombSV paymentQueryCombSV;
    
    @Override
    public ChargeInfo queryChargeInfoByOrderId(PaymentQryParam param) throws CallerException {
        LOG.info("收费记录查询开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (StringUtil.isBlank(param.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号（业务流水号）不能为空");
        }
        ChargeInfo info = null;
        info = this.paymentQueryCombSV.queryChargeInfo(param);        
        LOG.info("收费记录查询结束");
        return info;
    }

    @Override
    public List<ChargePayTypeDetail> queryChargePayTypeDetailsByOrderId(PaymentQryParam param)
            throws CallerException {
        LOG.info("收费支付明细列表查询开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (StringUtil.isBlank(param.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号（业务流水号）不能为空");
        }
        
        return paymentQueryCombSV.queryChargePayTypeDetails(param);    
    }
    
    @Override
    public ChargeInfo queryChargeInfoByChargeId(ChargeIdParam param) throws CallerException {
        LOG.info("按收费流水号查询收费记录开始");
        ChargeInfo info = null;
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (param.getChargeId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费流水号不能为空");
        }
        
        info = this.paymentQueryCombSV.queryChargeInfo(param.getChargeId(), param.getTenantId()); 
        LOG.info("按收费流水号查询收费记录结束");
        return info;
    }

    @Override
    public List<ChargePayTypeDetail> queryChargePayTypeDetailsByChargeId(ChargeIdParam param)
            throws CallerException {
        LOG.info("按收费流水号查询收费支付明细列表开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (param.getChargeId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费流水号不能为空");
        }
                
        return paymentQueryCombSV.queryChargePayTypeDetails(param.getChargeId(), param.getTenantId()); 
    }

    @Override
    public PageInfo<ChargeBaseInfo> queryChargeBaseInfoByAcctId(ChargeInfoQueryByAcctIdParam param)
            throws CallerException {
        LOG.info("按账户ID查询收费记录开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (param.getAccountId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:账户ID不能为空");
        }
        
        if(param.getPageInfo() == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:分页信息不能为空");
        }
        
        if(param.getPageInfo().getPageNo() == null || param.getPageInfo().getPageNo() == 0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:查询页码不能为空");
        }
        
        if(param.getPageInfo().getPageSize() == null || param.getPageInfo().getPageSize() == 0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:每页条数不能为空");
        }
        
        return paymentQueryCombSV.queryChargeBaseInfoByAcctId(param);
    }

    @Override
    public PageInfo<ChargeBaseInfo> queryChargeBaseInfoByCustId(ChargeInfoQueryByCustIdParam param)
            throws CallerException {
        LOG.info("按客户ID查询收费记录开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收费记录查询入参不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (param.getCustId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:客户ID不能为空");
        }
        
        if(param.getPageInfo() == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:分页信息不能为空");
        }
        
        if(param.getPageInfo().getPageNo() == null || param.getPageInfo().getPageNo() == 0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:查询页码不能为空");
        }
        
        if(param.getPageInfo().getPageSize() == null || param.getPageInfo().getPageSize() == 0) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:每页条数不能为空");
        }
   
        return paymentQueryCombSV.queryChargeBaseInfoByCustId(param);    
    }
    
}
