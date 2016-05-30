package com.ai.runner.center.charge.api.paymentquery.param;

import java.io.Serializable;

/**
 * 支付明细.<br>
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class ChargePayTypeDetail implements Serializable {

    private static final long serialVersionUID = 5563792111535332058L;

    /**
     * 支付明细ID
     */
    private long payTypeId;

    /**
     * 支付方式（必填项）：<br>
     * 1、现金<br>
     * 3、充值卡<br>
     * 4、赠送预存<br>
     * 5、积分<br>
     * 6、银行卡(POS)<br>
     * 7、货到付款<br>
     * 8、优惠券<br>
     * 9、支票支付<br>
     * 10、转账汇款<br>
     * 11、银行卡代扣<br>
     * 12、银行卡托收 <br>
     * 21、支付宝<br>
     * 22、银联<br>
     * 24、微信<br>
     */
    private int payStyle;

    /**
     * 支付金额：单位是厘
     */
    private long paidFee;

    public long getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(long payTypeId) {
        this.payTypeId = payTypeId;
    }

    public int getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(int payStyle) {
        this.payStyle = payStyle;
    }

    public long getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(long paidFee) {
        this.paidFee = paidFee;
    }
}
