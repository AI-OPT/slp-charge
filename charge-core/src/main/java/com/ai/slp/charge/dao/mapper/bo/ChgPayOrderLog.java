package com.ai.slp.charge.dao.mapper.bo;

import java.sql.Timestamp;

public class ChgPayOrderLog {
    private Long orderId;

    private Integer payChannel;

    private Long payAmount;

    private String ordDes;

    private Timestamp createTime;

    private Integer status;

    private Timestamp lastStatusDate;

    private String payOrgId;

    private String payOrgSerial;

    private Integer checkStatus;

    private Timestamp checkTime;

    private String acctId;

    private String custId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public String getOrdDes() {
        return ordDes;
    }

    public void setOrdDes(String ordDes) {
        this.ordDes = ordDes == null ? null : ordDes.trim();
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

    public String getPayOrgId() {
        return payOrgId;
    }

    public void setPayOrgId(String payOrgId) {
        this.payOrgId = payOrgId == null ? null : payOrgId.trim();
    }

    public String getPayOrgSerial() {
        return payOrgSerial;
    }

    public void setPayOrgSerial(String payOrgSerial) {
        this.payOrgSerial = payOrgSerial == null ? null : payOrgSerial.trim();
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

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId == null ? null : acctId.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }
}