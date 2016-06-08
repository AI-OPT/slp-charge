package com.ai.slp.charge.service.business.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.charge.api.payment.param.PayOrderParam;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.ai.slp.charge.constants.ChargeCostants;
import com.ai.slp.charge.dao.mapper.bo.ChgPayOrderLog;
import com.ai.slp.charge.service.atom.interfaces.IChgPayOrderLogSV;
import com.ai.slp.charge.service.business.interfaces.IPayOrderCombSV;
import com.ai.slp.charge.service.business.interfaces.IPaymentManagerSV;
import com.ai.slp.charge.util.ChargeSeqUtil;
/**
 * 缴费订单处理接口
 * Date: 2016年6月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
@Service
@Transactional
public class PayOrderCombSVImpl implements IPayOrderCombSV {
    
    @Autowired
    private IPaymentManagerSV paymentManagerSV;

    @Autowired
    private IChgPayOrderLogSV chgPayOrderSV; 
    
    @Override
    public long createPayOrder(PayOrderParam payOrderParam) throws BusinessException,
            SystemException {
        ChgPayOrderLog payOrderLog = new ChgPayOrderLog();
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Long orderId = ChargeSeqUtil.createPayOrderId();
        payOrderLog.setOrderId(orderId);
        payOrderLog.setAcctId(payOrderParam.getAcctId());
        payOrderLog.setCheckStatus(ChargeCostants.PayOrderLog.CheckStatus.INIT);
        payOrderLog.setOrdDes(payOrderParam.getOrdDes());
        payOrderLog.setCreateTime(now);
        payOrderLog.setLastStatusDate(now);
        payOrderLog.setPayAmount(payOrderParam.getPayAmount());
        payOrderLog.setPayChannel(payOrderParam.getPayChannel());
        if(payOrderParam.getStatus()==null){
            payOrderLog.setStatus(payOrderParam.getStatus());
        }else{
            payOrderLog.setStatus(ChargeCostants.PayOrderLog.Status.INIT);
        }
        chgPayOrderSV.savePayOrderLog(payOrderLog);
        return orderId;
    }

    @Override
    public long updatePayOrder(PayOrderParam payOrderParam) throws BusinessException,
            SystemException {
        ChgPayOrderLog payOrderLog = chgPayOrderSV.queryChgPayOrderLogByOrderId(payOrderParam.getOrderId());
        Timestamp now = new Timestamp(System.currentTimeMillis());
        payOrderLog.setLastStatusDate(now);
        payOrderLog.setPayOrgId(payOrderParam.getPayOrgId());
        payOrderLog.setPayOrgSerial(payOrderParam.getPayOrgSerial());
        payOrderLog.setStatus(payOrderParam.getStatus());
        chgPayOrderSV.updatePayOrderLog(payOrderLog);
        return payOrderParam.getOrderId();
    }

    @Override
    public long callPayOrder(PayOrderParam payOrderParam, PaymentParam paymentParam)
            throws BusinessException, SystemException {
        ChgPayOrderLog payOrderLog =  chgPayOrderSV.queryChgPayOrderLogByOrderId(payOrderParam.getOrderId());
        Timestamp now = new Timestamp(System.currentTimeMillis());
        payOrderLog.setLastStatusDate(now);
        payOrderLog.setPayOrgId(payOrderParam.getPayOrgId());
        payOrderLog.setPayOrgSerial(payOrderParam.getPayOrgSerial());
        payOrderLog.setStatus(payOrderParam.getStatus());
        chgPayOrderSV.updatePayOrderLog(payOrderLog);
        
        paymentManagerSV.payment(paymentParam);
        return 0;
    }

    

}
