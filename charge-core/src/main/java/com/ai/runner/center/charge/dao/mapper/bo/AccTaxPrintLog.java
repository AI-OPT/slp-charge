package com.ai.runner.center.charge.dao.mapper.bo;

import java.sql.Timestamp;

public class AccTaxPrintLog {
    private String tenantId;

    private String serialCode;

    private String orderId;

    private String businessCode;

    private Long accountId;

    private Long custId;

    private Timestamp printDate;

    private String cycleMonth;

    private String invoiceTitle;

    private String invCertificateNo;

    private String invAddress;

    private String invBank;

    private Long totalAmount;

    private Long giftAmount;

    private Double baseRate;

    private Double addRate;

    private Long baseAmount;

    private Long addAmount;

    private Long terminalAmount;

    private Integer status;

    private Timestamp lastStatusDate;

    private String operatorId;

    private Timestamp createTime;

    private String invoiceType;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode == null ? null : serialCode.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Timestamp getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Timestamp printDate) {
        this.printDate = printDate;
    }

    public String getCycleMonth() {
        return cycleMonth;
    }

    public void setCycleMonth(String cycleMonth) {
        this.cycleMonth = cycleMonth == null ? null : cycleMonth.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvCertificateNo() {
        return invCertificateNo;
    }

    public void setInvCertificateNo(String invCertificateNo) {
        this.invCertificateNo = invCertificateNo == null ? null : invCertificateNo.trim();
    }

    public String getInvAddress() {
        return invAddress;
    }

    public void setInvAddress(String invAddress) {
        this.invAddress = invAddress == null ? null : invAddress.trim();
    }

    public String getInvBank() {
        return invBank;
    }

    public void setInvBank(String invBank) {
        this.invBank = invBank == null ? null : invBank.trim();
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Long giftAmount) {
        this.giftAmount = giftAmount;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Double getAddRate() {
        return addRate;
    }

    public void setAddRate(Double addRate) {
        this.addRate = addRate;
    }

    public Long getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Long baseAmount) {
        this.baseAmount = baseAmount;
    }

    public Long getAddAmount() {
        return addAmount;
    }

    public void setAddAmount(Long addAmount) {
        this.addAmount = addAmount;
    }

    public Long getTerminalAmount() {
        return terminalAmount;
    }

    public void setTerminalAmount(Long terminalAmount) {
        this.terminalAmount = terminalAmount;
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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }
}