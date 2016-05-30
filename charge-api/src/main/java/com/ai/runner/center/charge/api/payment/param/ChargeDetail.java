package com.ai.runner.center.charge.api.payment.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 費用明细 <br>
 * Date: 2015年8月7日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public class ChargeDetail extends BaseInfo {

    private static final long serialVersionUID = -4465178284565900928L;

    /**
     * 费用科目ID:科目编码,必填项
     */
    private String feeItemId;
    
    /**
     * 原始费用：单位是厘,必填项
     */
    private Long totalFee;

    /**
     * 优惠金额：单位是厘,必填项,缺省为0
     */
    private long discountFee;

    /**
     * 减免费用：单位是厘,必填项,缺省为0
     */
    private long operDiscountFee;    

    /**
     * 应收金额:单位是厘,必填项
     */
    private Long chargeFee;

    /**
     * 费用类型,必填项:<br>
     * 1：营业,一次性费用<br>
     * 2：账务,账务费用<br>
     */
    private String feeType;

    public String getFeeItemId() {
        return feeItemId;
    }

    public void setFeeItemId(String feeItemId) {
        this.feeItemId = feeItemId;
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }   
}
