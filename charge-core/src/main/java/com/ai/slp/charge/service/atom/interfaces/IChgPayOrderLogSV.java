package com.ai.slp.charge.service.atom.interfaces;

import com.ai.slp.charge.dao.mapper.bo.ChgPayOrderLog;

/**
 * 收费订单接口
 * Date: 2016年6月6日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface IChgPayOrderLogSV {

    void savePayOrderLog(ChgPayOrderLog log);   
    
    ChgPayOrderLog queryChgPayOrderLogByOrderId(String orderId);

    void updatePayOrderLog(ChgPayOrderLog log);
}
