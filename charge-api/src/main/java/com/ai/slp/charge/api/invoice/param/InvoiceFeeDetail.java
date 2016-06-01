package com.ai.slp.charge.api.invoice.param;

import java.io.Serializable;

/**
 * 发票费用科目明细.<br>
 *
 * Date: 2015年9月16日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class InvoiceFeeDetail implements Serializable {

    private static final long serialVersionUID = 1975053407048128347L;

    /**
     * 费用科目
     */
    private String feeItemId;
    
    /**
     * 费用名称
     */
    private String feeItemName;
    
    /**
     * 应收金额
     */
    private long amount;

    public String getFeeItemId() {
        return feeItemId;
    }

    public void setFeeItemId(String feeItemId) {
        this.feeItemId = feeItemId;
    }

    public String getFeeItemName() {
        return feeItemName;
    }

    public void setFeeItemName(String feeItemName) {
        this.feeItemName = feeItemName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }    
}
