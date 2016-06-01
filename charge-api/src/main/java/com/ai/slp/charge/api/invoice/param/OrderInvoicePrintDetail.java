package com.ai.slp.charge.api.invoice.param;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 订单发票打印数据.<br>
 *
 * Date: 2015年9月16日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class OrderInvoicePrintDetail implements Serializable {

    private static final long serialVersionUID = 2917497925318589924L;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 订单号
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
     * 订单总金额
     */
    private long printAmount;
    
    /**
     * 基础通信金额
     */
    private long basicFee;
    
    /**
     * 增值通信金额
     */
    private long addedValueFee;
    
    /**
     * 终端费
     */ 
    private long terminalFee;
    
    /**
     * 费用科目明细列表
     */
    private List<InvoiceFeeDetail> printSummary;

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

    public long getPrintAmount() {
        return printAmount;
    }

    public void setPrintAmount(long printAmount) {
        this.printAmount = printAmount;
    }

    public long getBasicFee() {
        return basicFee;
    }

    public void setBasicFee(long basicFee) {
        this.basicFee = basicFee;
    }

    public long getAddedValueFee() {
        return addedValueFee;
    }

    public void setAddedValueFee(long addedValueFee) {
        this.addedValueFee = addedValueFee;
    }

    public long getTerminalFee() {
        return terminalFee;
    }

    public void setTerminalFee(long terminalFee) {
        this.terminalFee = terminalFee;
    }

    public List<InvoiceFeeDetail> getPrintSummary() {
        return Collections.unmodifiableList(printSummary);
    }

    public void setPrintSummary(List<InvoiceFeeDetail> printSummary) {
        this.printSummary = printSummary;
    }
}
