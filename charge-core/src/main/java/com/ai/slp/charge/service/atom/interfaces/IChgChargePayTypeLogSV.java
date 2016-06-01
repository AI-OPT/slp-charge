package com.ai.slp.charge.service.atom.interfaces;

import java.util.List;

import com.ai.slp.charge.dao.mapper.bo.ChgChargePayTypeLog;

/**
 * 收费支付明细基本服务定义类
 * Date: 2015年8月12日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IChgChargePayTypeLogSV {

    void saveChgChargePayTypeLog(ChgChargePayTypeLog log);
    
    List<ChgChargePayTypeLog> getChgChargePayTypeLogsByChargeId(long chargeId);
    
    List<ChgChargePayTypeLog> queryChgChargePayTypeLogsByOrderId(String tenantId, String orderId);
}
