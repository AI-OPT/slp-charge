package com.ai.slp.charge.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.charge.dao.mapper.bo.ChgChargePayTypeLog;
import com.ai.slp.charge.dao.mapper.bo.ChgChargePayTypeLogCriteria;
import com.ai.slp.charge.dao.mapper.bo.ChgChargePayTypeLogCriteria.Criteria;
import com.ai.slp.charge.dao.mapper.factory.MapperFactory;
import com.ai.slp.charge.service.atom.interfaces.IChgChargePayTypeLogSV;


/**
 * 收费支付明细基本服务实现类
 * Date: 2015年8月12日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Component
public class ChgChargePayTypeLogSVImpl implements IChgChargePayTypeLogSV {

    @Override
    public void saveChgChargePayTypeLog(ChgChargePayTypeLog log) {
        MapperFactory.getChgChargePayTypeLogMapper().insert(log);
    }

    @Override
    public List<ChgChargePayTypeLog> getChgChargePayTypeLogsByChargeId(long chargeId) {
        ChgChargePayTypeLogCriteria sql = new ChgChargePayTypeLogCriteria();
        sql.createCriteria().andChargeIdEqualTo(chargeId);
        return MapperFactory.getChgChargePayTypeLogMapper().selectByExample(sql);
    }

    @Override
    public List<ChgChargePayTypeLog> queryChgChargePayTypeLogsByOrderId(String tenantId,
            String orderId) {
        ChgChargePayTypeLogCriteria sql = new ChgChargePayTypeLogCriteria();
        Criteria criteria = sql.createCriteria();
        criteria.andTenantIdEqualTo(tenantId);
        criteria.andOrderIdEqualTo(orderId);
        return MapperFactory.getChgChargePayTypeLogMapper().selectByExample(sql);
    }

}
