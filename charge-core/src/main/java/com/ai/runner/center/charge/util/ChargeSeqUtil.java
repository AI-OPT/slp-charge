package com.ai.runner.center.charge.util;

import com.ai.runner.sdk.sequence.util.SeqUtil;

/**
 * 收费中心序列工具类
 * Date: 2015年8月13日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public final class ChargeSeqUtil {
    
    private ChargeSeqUtil() {
        
    }

    /**
     * 获取收费流水号
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static Long createChargeId() {
        return SeqUtil.getNewId("CHARGE_LOG$CHARGE_ID$SEQ");
    }
    
    /**
     * 获取收费费用明细ID
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static Long createChargeFeeDetailId() {
        return SeqUtil.getNewId("CHARGE_DETAIL_LOG$DETAIL_ID$SEQ");
    }
    
    /**
     * 获取支付明细ID
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static Long createChargePayTypeId() {
        return SeqUtil.getNewId("CHARGE_PAY_TYPE_LOG$TYPE_ID$SEQ");
    }
    
}
