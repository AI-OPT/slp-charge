package com.ai.slp.charge.dao.mapper.bo;

public class ChgChargeDetailLog {
    private Long feeDetailId;

    private Long chargeId;

    private String orderId;

    private String feeItemId;

    private Long totalFee;

    private Long discountFee;

    private Long operDiscountFee;

    private Long chargeFee;

    private String feeType;

    private String tenantId;

    public Long getFeeDetailId() {
        return feeDetailId;
    }

    public void setFeeDetailId(Long feeDetailId) {
        this.feeDetailId = feeDetailId;
    }

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getFeeItemId() {
        return feeItemId;
    }

    public void setFeeItemId(String feeItemId) {
        this.feeItemId = feeItemId == null ? null : feeItemId.trim();
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }
}