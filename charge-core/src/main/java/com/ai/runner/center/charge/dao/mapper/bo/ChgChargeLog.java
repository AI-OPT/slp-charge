package com.ai.runner.center.charge.dao.mapper.bo;

import java.sql.Timestamp;

public class ChgChargeLog {
    private Long chargeId;

    private String tenantId;

    private String orderId;

    private String busiType;

    private String busiOperCode;

    private String payChannel;

    private String batchCode;

    private Long totalFee;

    private Long discountFee;

    private Long operDiscountFee;

    private Long chargeFee;

    private Long paidFee;

    private Long custId;

    private Long acctId;

    private Timestamp createTime;

    private Integer status;

    private Timestamp lastStatusDate;

    private Integer printTimes;

    private String opProvCode;

    private String opCityCode;

    private String chlId;

    private String operId;

    private Integer checkStatus;

    private Timestamp checkTime;

    private Long cancelChargeId;

    private String remark;

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getBusiOperCode() {
        return busiOperCode;
    }

    public void setBusiOperCode(String busiOperCode) {
        this.busiOperCode = busiOperCode == null ? null : busiOperCode.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public Long getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Long discountFee) {
        this.discountFee = discountFee;
    }

    public Long getOperDiscountFee() {
        return operDiscountFee;
    }

    public void setOperDiscountFee(Long operDiscountFee) {
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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getLastStatusDate() {
        return lastStatusDate;
    }

    public void setLastStatusDate(Timestamp lastStatusDate) {
        this.lastStatusDate = lastStatusDate;
    }

    public Integer getPrintTimes() {
        return printTimes;
    }

    public void setPrintTimes(Integer printTimes) {
        this.printTimes = printTimes;
    }

    public String getOpProvCode() {
        return opProvCode;
    }

    public void setOpProvCode(String opProvCode) {
        this.opProvCode = opProvCode == null ? null : opProvCode.trim();
    }

    public String getOpCityCode() {
        return opCityCode;
    }

    public void setOpCityCode(String opCityCode) {
        this.opCityCode = opCityCode == null ? null : opCityCode.trim();
    }

    public String getChlId() {
        return chlId;
    }

    public void setChlId(String chlId) {
        this.chlId = chlId == null ? null : chlId.trim();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public Long getCancelChargeId() {
        return cancelChargeId;
    }

    public void setCancelChargeId(Long cancelChargeId) {
        this.cancelChargeId = cancelChargeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}