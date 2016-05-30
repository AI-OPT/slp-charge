package com.ai.runner.center.charge.api.paymentquery.param;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 收费流水基本信息.<br>
 * Date: 2015年8月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class ChargeBaseInfo implements Serializable {

    private static final long serialVersionUID = -2195465007030102222L;

    /**
     * 收费流水号
     */
    private long chargeId;

    /**
     * 租户ID:以租户的网站域名为编码
     */
    private String tenantId;

    /**
     * 订单号\业务流水号：用于记录其它收缴机构产生该交易的流水号，<br>
     * 如订单号，用于唯一标识一笔交易
     */
    private String orderId;
    
    /**
     * 客户标识
     */
    private long custId;

    /**
     * 帐户标识
     */
    private long acctId;

    /**
     * 业务类型：<br>
     * ﻿1、订单收费类<br>
     * 2、缴费充值类<br>
     */
    private String busiType;

    /**
     * 业务操作类型
     */
    private String busiOperCode;

    /**
     * 收费渠道
     */
    private String payChannel;

    /**
     * 批次号：用于批量缴费
     */
    private String batchCode;

    /**
     * 总费用：单位是厘
     */
    private long totalFee;

    /**
     * 总优惠金额：单位是厘
     */
    private long discountFee;

    /**
     * 减免费：单位是厘
     */
    private long operDiscountFee;

    /**
     * 应收金额：单位是厘
     */
    private long chargeFee;

    /**
     * 实收金额:单位是厘
     */
    private long paidFee;

    /**
     * 收费时间
     */
    private Timestamp createTime;

    /**
     * 收费状态：<br>
     * 0：冲正<br>
     * 1：正常交费/退费<br>
     */
    private int status;

    /**
     * 最后状态变更的日期
     */
    private Timestamp lastStatusDate;

    /**
     * 打印次数
     */
    private int printTimes;

    /**
     * 办理渠道
     */
    private String chlId;

    /**
     * 操作员ID
     */
    private String operId;

    /**
     * 对帐/轧帐状态:<br>
     * 0：未对帐/轧帐<br>
     * 1：已对帐/轧帐<br>
     */
    private int checkStatus;

    /**
     * 对帐/轧帐时间
     */
    private Timestamp checkTime;

    /**
     * 冲正收费流水号
     */
    private long cancelChargeId;

    /**
     * 备注信息
     */
    private String remark;

    public long getChargeId() {
        return chargeId;
    }

    public void setChargeId(long chargeId) {
        this.chargeId = chargeId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(long totalFee) {
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

    public long getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(long chargeFee) {
        this.chargeFee = chargeFee;
    }

    public long getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(long paidFee) {
        this.paidFee = paidFee;
    }

    public Timestamp getCreateTime() {
        if(createTime == null) {
            return null;
        }
        
        return new Timestamp(createTime.getTime());
    }

    public void setCreateTime(Timestamp createTime) {
        if(createTime != null) {
            this.createTime = new Timestamp(createTime.getTime());
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getLastStatusDate() {
        if(lastStatusDate == null) {
            return null;
        }
        
        return new Timestamp(lastStatusDate.getTime());
    }

    public void setLastStatusDate(Timestamp lastStatusDate) {
        if(lastStatusDate != null) {            
            this.lastStatusDate = new Timestamp(lastStatusDate.getTime());
        }
    }

    public int getPrintTimes() {
        return printTimes;
    }

    public void setPrintTimes(int printTimes) {
        this.printTimes = printTimes;
    }

    public String getChlId() {
        return chlId;
    }

    public void setChlId(String chlId) {
        this.chlId = chlId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public int getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(int checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Timestamp getCheckTime() {
        if(checkTime == null) {
            return null;
        }
        
        return new Timestamp(checkTime.getTime());
    }

    public void setCheckTime(Timestamp checkTime) {
        if(checkTime != null) {
            this.checkTime = new Timestamp(checkTime.getTime());
        }
    }

    public long getCancelChargeId() {
        return cancelChargeId;
    }

    public void setCancelChargeId(long cancelChargeId) {
        this.cancelChargeId = cancelChargeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}
