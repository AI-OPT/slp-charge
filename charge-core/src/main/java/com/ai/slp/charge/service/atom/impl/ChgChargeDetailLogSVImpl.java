package com.ai.slp.charge.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeDetailLog;
import com.ai.slp.charge.dao.mapper.bo.ChgChargeDetailLogCriteria;
import com.ai.slp.charge.dao.mapper.bo.ChgChargeDetailLogCriteria.Criteria;
import com.ai.slp.charge.dao.mapper.factory.MapperFactory;
import com.ai.slp.charge.service.atom.interfaces.IChgChargeDetailLogSV;


/**
 * 收费明细基础服务实现类
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Component
public class ChgChargeDetailLogSVImpl implements IChgChargeDetailLogSV {

    @Override
    public void saveChgChargeDetailLog(ChgChargeDetailLog chargeDetailLog) {
        MapperFactory.getChgChargeDetailLogMapper().insert(chargeDetailLog);
    }

    @Override
    public List<ChgChargeDetailLog> getChgChargeDetailLogByChargeId(long chargeId) {
        ChgChargeDetailLogCriteria sql = new ChgChargeDetailLogCriteria();
        Criteria criteria = sql.createCriteria();        
        criteria.andChargeIdEqualTo(chargeId);
        return MapperFactory.getChgChargeDetailLogMapper().selectByExample(sql);
    }
    
}
