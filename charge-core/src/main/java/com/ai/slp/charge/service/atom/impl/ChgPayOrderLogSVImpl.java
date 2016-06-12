package com.ai.slp.charge.service.atom.impl;

import org.springframework.stereotype.Component;

import com.ai.slp.charge.dao.mapper.bo.ChgPayOrderLog;
import com.ai.slp.charge.dao.mapper.factory.MapperFactory;
import com.ai.slp.charge.service.atom.interfaces.IChgPayOrderLogSV;

@Component
public class ChgPayOrderLogSVImpl implements IChgPayOrderLogSV {

    @Override
    public void savePayOrderLog(ChgPayOrderLog log) {
        MapperFactory.getChgPayOrderLogMapper().insert(log);
    }

    @Override
    public ChgPayOrderLog queryChgPayOrderLogByOrderId(String orderId) {
        return MapperFactory.getChgPayOrderLogMapper().selectByPrimaryKey(orderId);
    }

    @Override
    public void updatePayOrderLog(ChgPayOrderLog log) {
        MapperFactory.getChgPayOrderLogMapper().updateByPrimaryKey(log);
    }

}
