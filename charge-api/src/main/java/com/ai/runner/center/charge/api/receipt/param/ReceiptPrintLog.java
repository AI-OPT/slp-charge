package com.ai.runner.center.charge.api.receipt.param;


import com.ai.runner.base.vo.BaseInfo;

/**
 * 收据打印记录.<br>
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class ReceiptPrintLog extends BaseInfo {

    private static final long serialVersionUID = 9063649806065897152L;

    /**
     * 系统ID,必填
     */
    private String systemId;

    /**
     * 订单号\业务流水号，必填
     */
    private String orderId;

    /**
     * 客户ID，必填
     */
    private Long custId;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 打印总金额，必填
     */
    private Long paidFee;

    /**
     * 支付方式,必填
     */
    private String paystyleName;

    /**
     * 打印日期，必填<br>
     * 格式：yyyy-MM-dd HH:mm:ss<br>
     */
    private String printDateStr;

    /**
     * 办理渠道
     */
    private String chlId;

    /**
     * 操作员工号
     */
    private String operatorId;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(Long paidFee) {
        this.paidFee = paidFee;
    }

    public String getPaystyleName() {
        return paystyleName;
    }

    public void setPaystyleName(String paystyleName) {
        this.paystyleName = paystyleName;
    }

    public String getPrintDateStr() {
        return printDateStr;
    }

    public void setPrintDateStr(String printDateStr) {
        this.printDateStr = printDateStr;
    }

    public String getChlId() {
        return chlId;
    }

    public void setChlId(String chlId) {
        this.chlId = chlId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

}
