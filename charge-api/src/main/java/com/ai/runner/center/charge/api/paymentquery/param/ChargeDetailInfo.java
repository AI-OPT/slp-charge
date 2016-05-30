package com.ai.runner.center.charge.api.paymentquery.param;

import java.io.Serializable;

/**
 * 费用明细 <br>
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class ChargeDetailInfo implements Serializable {

    private static final long serialVersionUID = -6796282257997208793L;

    /**
     * 费用明细ID
     */
    private long feeDetailId;

    /**
     * 费用科目ID：科目编码
     */
    private String feeItemId;

    /**
     * 原始费用：单位是厘
     */
    private long totalFee;

    /**
     * 优惠金额：单位是厘
     */
    private long discountFee;

    /**
     * 减免费用：单位是厘
     */
    private long operDiscountFee;

    /**
     * 应收金额：单位是厘
     */
    private long chargeFee;

    /**
     * 费用类型:<br>
     * 1：营业,一次性费用<br>
     * 2：账务,账务费用<br>
     */
    private String feeType;

    public long getFeeDetailId() {
        return feeDetailId;
    }

    public void setFeeDetailId(long feeDetailId) {
        this.feeDetailId = feeDetailId;
    }

    public String getFeeItemId() {
        return feeItemId;
    }

    public void setFeeItemId(String feeItemId) {
        this.feeItemId = feeItemId;
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

}
