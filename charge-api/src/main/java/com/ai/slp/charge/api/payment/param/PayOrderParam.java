package com.ai.slp.charge.api.payment.param;

import com.ai.opt.base.vo.BaseInfo;
/**
 * 缴费订单参数
 * Date: 2016年6月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public class PayOrderParam  extends BaseInfo {
    private static final long serialVersionUID = -6717627733377889320L;

    
    private String orderId;

    private Integer payChannel;

    private Long payAmount;

    private String ordDes;

    private Integer status;

    private String payOrgId;

    private String payOrgSerial;

    private String acctId;

    private String custId;

    

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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