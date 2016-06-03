package com.ai.slp.charge.service.atom.interfaces;

import java.util.List;

import com.ai.slp.charge.dao.mapper.bo.ChgChargeDetailLog;

/**
 * 收费明细基础服务定义类
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IChgChargeDetailLogSV {

    void saveChgChargeDetailLog(ChgChargeDetailLog chargeDetailLog);
    
    List<ChgChargeDetailLog> getChgChargeDetailLogByChargeId(long chargeId); 
    
}
