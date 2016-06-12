package com.ai.slp.charge.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

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
    /**
     * 获取缴费订单ID
     * @return
     * @author LiangMeng
     * @ApiDocMethod
     */
    public static String createPayOrderId() {
        String nowTime = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        String seq = SeqUtil.getNewId("PAY_ORDER_LOG$ORDER_ID$SEQ")+"";     
        System.out.println("(15-(seq.length())):"+(15-(seq.length())));
        int lenth = seq.length();
        for(int i=0;i<(10-lenth);i++){
            seq = "0"+seq;
            System.out.println("seq_"+i+":"+seq);
        }
        seq = nowTime + seq;
        return seq;
    }
}
