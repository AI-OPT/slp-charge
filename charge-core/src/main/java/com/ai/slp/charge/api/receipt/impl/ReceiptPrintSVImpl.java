package com.ai.slp.charge.api.receipt.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.exception.CallerException;
import com.ai.slp.charge.api.receipt.interfaces.IReceiptPrintSV;
import com.ai.slp.charge.api.receipt.param.ReceiptPrintLog;
import com.ai.slp.charge.constants.ExceptCodeConstants;
import com.ai.slp.charge.service.business.interfaces.IReceiptPrintCombSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 收据打印服务（Dubbo服务实现）
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Service
@Component
public class ReceiptPrintSVImpl implements IReceiptPrintSV {

    private static final Log LOG = LogFactory.getLog(ReceiptPrintSVImpl.class);
    
    @Autowired
    private IReceiptPrintCombSV receiptPrintCombSV;
    
    @Override
    public void saveReceiptPrintLog(ReceiptPrintLog log) throws CallerException {
        LOG.info("保存收据打印记录开始");
        if (log == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:收据打印记录参数不能为空");
        }
        
        if (StringUtil.isBlank(log.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        if (StringUtil.isBlank(log.getSystemId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:系统ID不能为空");
        }
        
        if (StringUtil.isBlank(log.getOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:订单号不能为空");
        }
        
        if(log.getCustId() == null || log.getCustId() == 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:客户标识不能为空");
        }
        
        if(log.getPaidFee() == null || log.getPaidFee() <= 0l) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:打印总金额必须大于零");
        }
        
        if (StringUtil.isBlank(log.getPaystyleName())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:支付方式不能为空");
        }
        
        if (StringUtil.isBlank(log.getPrintDateStr())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:打印日期不能为空");
        }
        
        if(!DateUtil.isValidDate(log.getPrintDateStr(), DateUtil.DATETIME_FORMAT)) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:打印日期传入格式有误");
        }        
                
        this.receiptPrintCombSV.saveReceiptPrintLog(log);
        LOG.info("保存收据打印记录结束");
    }

}
