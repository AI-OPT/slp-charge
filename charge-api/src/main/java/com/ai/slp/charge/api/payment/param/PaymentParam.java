package com.ai.slp.charge.api.payment.param;

import java.util.List;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 收费记录创建请求参数  <br>
 * Date: 2015年8月7日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public class PaymentParam extends BaseInfo {

    private static final long serialVersionUID = -4465178284565900928L;

    /**
     * 订单号\业务流水号：必须唯一
     */
    private String orderId;

    /**
     * 业务类型：﻿1、订单收费类；2、缴费充值类;必填项
     */
    private String busiType;

    /**
     * 业务操作类型：内部系统必填
     */
    private String busiOperCode;
    
    /**
     * 收费状态,必填.<br>
     * 0：冲正\订单取消<br>
     * 1：正常交费<br>
     */
    private Integer status;
    
    /**
     * 原订单收费流水号,订单取消或撤单时必填
     */
    private Long cancelChargeId;

    /**
     * 客户ID：必填项
     */
    private long custId;

    /**
     * 账户ID：必填项
     */
    private long acctId;

    /**
     * 总费用：单位是厘，必填项
     */
    private Long totalFee;

    /**
     * 总优惠金额：单位是厘,必填项,缺省为0
     */
    private long discountFee;

    /**
     * 减免费：单位是厘,必填项,缺省为0
     */
    private long operDiscountFee;

    /**
     * 应收金额：单位是厘,必填项
     */
    private Long chargeFee;

    /**
     * 实收金额:单位是厘,必填项
     */
    private Long paidFee;

    /**
     * 费用明细列表
     */
    private List<ChargeDetail> chargeDetail;

    /**
     * 支付明细列表
     */
    private List<PayTypeDetail> payTypeDetail;

    /**
     * 省份代码
     */
    private String provinceCode;

    /**
     * 地市代码
     */
    private String cityCode;

    /**
     * 操作渠道ID：必填
     */
    private String applyChlId;

    /**
     * 操作员ID
     */
    private String operId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getBusiOperCode() {
        return busiOperCode;
    }

    public void setBusiOperCode(String busiOperCode) {
        this.busiOperCode = busiOperCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCancelChargeId() {
        return cancelChargeId;
    }

    public void setCancelChargeId(Long cancelChargeId) {
        this.cancelChargeId = cancelChargeId;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public long getAcctId() {
        return acctId;
    }

    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public long getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(long discountFee) {
        this.discountFee = discountFee;
    }

    public long getOperDiscountFee() {
        return operDiscountFee;
    }

    public void setOperDiscountFee(long operDiscountFee) {
        this.operDiscountFee = operDiscountFee;
    }

    public Long getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(Long chargeFee) {
        this.chargeFee = chargeFee;
    }

    public Long getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(Long paidFee) {
        this.paidFee = paidFee;
    }

    public List<ChargeDetail> getChargeDetail() {
        return chargeDetail;
    }

    public void setChargeDetail(List<ChargeDetail> chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

    public List<PayTypeDetail> getPayTypeDetail() {
        return payTypeDetail;
    }

    public void setPayTypeDetail(List<PayTypeDetail> payTypeDetail) {
        this.payTypeDetail = payTypeDetail;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getApplyChlId() {
        return applyChlId;
    }

    public void setApplyChlId(String applyChlId) {
        this.applyChlId = applyChlId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

}
