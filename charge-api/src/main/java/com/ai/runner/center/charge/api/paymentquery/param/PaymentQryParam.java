package com.ai.runner.center.charge.api.paymentquery.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 收费记录查询入参.<br>
 * 按订单号（业务流水号）查询收费记录<br>
 * 
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class PaymentQryParam extends BaseInfo {

    private static final long serialVersionUID = -669876148351885942L;
    
    /**
     * 订单号\业务流水号：用于记录其它收缴机构产生该交易的流水号，<br>
     * 如订单号，用于唯一标识一笔交易
     */
    private String orderId;
    
    /**
     * 业务类型,按订单号（业务流水号）查询时使用：<br>
     * ﻿1、订单收费类<br>
     * 2、缴费充值类<br>
     */
    private String busiType;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }
    
}
