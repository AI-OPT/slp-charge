package com.ai.runner.center.charge.api.invoice.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 增值税发票打印日志.<br>
 *
 * Date: 2015年9月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class TaxPrintLog extends BaseInfo {

    private static final long serialVersionUID = 1607259130256631472L;

    /**
     * 发票流水号
     */
    private String serialCode;

    /**
     * 订单号，必填
     */
    private String orderId;

    /**
     * 业务编码
     */
    private String businessCode;

    /**
     * 帐户标识
     */
    private Long accountId;

    /**
     * 客户标识,必填
     */
    private Long custId;
    
    /**
     * 发票类型.<br>
     * 1、增值税普票<br>
     * 2、增值税专票<br>
     * 3、电子发票<br>
     */
    private String invoiceType;

    /**
     * 打印日期，必填<br>
     * 格式：yyyy-MM-dd HH:mm:ss<br>
     */
    private String printDateStr;

    /**
     * 帐单月
     */
    private String cycleMonth;

    /**
     * 发票抬头，必填
     */
    private String invoiceTitle;

    /**
     * 纳税人识别号
     */
    private String invCertificateNo;

    /**
     * 购方地址电话
     */
    private String invAddress;

    /**
     * 购方开户行信息
     */
    private String invBank;

    /**
     * 发票总额，必填
     */
    private Long totalAmount;

    /**
     * 折扣总额
     */
    private Long giftAmount;

    /**
     * 基础业务比例
     */
    private Double baseRate;

    /**
     * 增值业务比例
     */
    private Double addRate;

    /**
     * 基础业务总额
     */
    private Long baseAmount;

    /**
     * 增值业务总额
     */
    private Long addAmount;

    /**
     * 终端总额
     */
    private Long terminalAmount;

    /**
     * 打印状态.<br>
     * 1：打印成功<br>
     * 2：打印失败<br>
     * 3：打印作废<br>
     */
    private Integer status;

    /**
     * 操作员工号
     */
    private String operatorId;

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
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

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getPrintDateStr() {
        return printDateStr;
    }

    public void setPrintDateStr(String printDateStr) {
        this.printDateStr = printDateStr;
    }

    public String getCycleMonth() {
        return cycleMonth;
    }

    public void setCycleMonth(String cycleMonth) {
        this.cycleMonth = cycleMonth;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvCertificateNo() {
        return invCertificateNo;
    }

    public void setInvCertificateNo(String invCertificateNo) {
        this.invCertificateNo = invCertificateNo;
    }

    public String getInvAddress() {
        return invAddress;
    }

    public void setInvAddress(String invAddress) {
        this.invAddress = invAddress;
    }

    public String getInvBank() {
        return invBank;
    }

    public void setInvBank(String invBank) {
        this.invBank = invBank;
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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
}
