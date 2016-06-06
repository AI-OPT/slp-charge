package com.ai.slp.charge.api.paymentquery.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 按收费流水号查询收费流水入参.<br>
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class ChargeIdParam extends BaseInfo {

    private static final long serialVersionUID = -5848302932202509164L;

    /**
     * 收费流水号
     */
    private long chargeId;

    public long getChargeId() {
        return chargeId;
    }

    public void setChargeId(long chargeId) {
        this.chargeId = chargeId;
    }

}
