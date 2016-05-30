package com.ai.runner.center.charge.api.invoice.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 订单发票打印请求.<br>
 *
 * Date: 2015年9月16日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class OrderInvoicePrintReq extends BaseInfo {

    private static final long serialVersionUID = -4791669022830893160L;

    /**
     * 订单号
     */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }  
}
