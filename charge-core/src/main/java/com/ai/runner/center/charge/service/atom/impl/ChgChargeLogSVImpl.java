package com.ai.runner.center.charge.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.runner.base.vo.PageInfo;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfoQueryByAcctIdParam;
import com.ai.runner.center.charge.api.paymentquery.param.ChargeInfoQueryByCustIdParam;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLogCriteria;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLogCriteria.Criteria;
import com.ai.runner.center.charge.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.charge.dao.mapper.interfaces.ChgChargeLogMapper;
import com.ai.runner.center.charge.service.atom.interfaces.IChgChargeLogSV;
import com.ai.runner.utils.util.CollectionUtil;

/**
 * 收费流水基础服务实现类
 * Date: 2015年8月12日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Component
public class ChgChargeLogSVImpl implements IChgChargeLogSV {

    @Override
    public void saveChgChargeLog(ChgChargeLog log) {
        MapperFactory.getChgChargeLogMapper().insert(log);
    }

    @Override
    public ChgChargeLog getChgChargeLogByChargeId(long chargeId) {
        return MapperFactory.getChgChargeLogMapper().selectByPrimaryKey(chargeId);
    }

    @Override
    public PageInfo<ChgChargeLog> queryChgChargeLogByCustId(ChargeInfoQueryByCustIdParam param) {
        ChgChargeLogCriteria sql = new ChgChargeLogCriteria();
        Criteria criteria = sql.createCriteria();
        criteria.andTenantIdEqualTo(param.getTenantId());
        criteria.andCustIdEqualTo(param.getCustId());
        if(param.getStartTime() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(param.getStartTime());
        }
        
        if(param.getEndTime() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(param.getEndTime());
        }
        
        PageInfo<ChgChargeLog> pageInfo = new PageInfo<ChgChargeLog>();
        ChgChargeLogMapper chgChargeLogMapper = MapperFactory.getChgChargeLogMapper();
        pageInfo.setCount(chgChargeLogMapper.countByExample(sql));
        sql.setLimitStart(param.getPageInfo().getStartRowIndex() - 1);
        sql.setLimitEnd(param.getPageInfo().getPageSize());
        pageInfo.setResult(chgChargeLogMapper.selectByExample(sql));
        pageInfo.setPageNo(param.getPageInfo().getPageNo());
        pageInfo.setPageSize(param.getPageInfo().getPageSize());
        return pageInfo;
    }

    @Override
    public PageInfo<ChgChargeLog> queryChgChargeLogByAcctId(ChargeInfoQueryByAcctIdParam param) {
        ChgChargeLogCriteria sql = new ChgChargeLogCriteria();
        Criteria criteria = sql.createCriteria();
        criteria.andTenantIdEqualTo(param.getTenantId());
        criteria.andAcctIdEqualTo(param.getAccountId());
        if(param.getStartTime() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(param.getStartTime());
        }
        
        if(param.getEndTime() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(param.getEndTime());
        }
        
        PageInfo<ChgChargeLog> pageInfo = new PageInfo<ChgChargeLog>();
        ChgChargeLogMapper chgChargeLogMapper = MapperFactory.getChgChargeLogMapper();
        pageInfo.setCount(chgChargeLogMapper.countByExample(sql));
        sql.setLimitStart(param.getPageInfo().getStartRowIndex() - 1);
        sql.setLimitEnd(param.getPageInfo().getPageSize());
        pageInfo.setResult(chgChargeLogMapper.selectByExample(sql));
        pageInfo.setPageNo(param.getPageInfo().getPageNo());
        pageInfo.setPageSize(param.getPageInfo().getPageSize());
        return pageInfo;
    }

    @Override
    public ChgChargeLog queryChgChargeLogByOrderId(String tenantId, String orderId) {
        ChgChargeLogCriteria sql = new ChgChargeLogCriteria();
        Criteria criteria = sql.createCriteria();
        criteria.andTenantIdEqualTo(tenantId);
        criteria.andOrderIdEqualTo(orderId);
        List<ChgChargeLog> list = MapperFactory.getChgChargeLogMapper().selectByExample(sql);
        if(CollectionUtil.isEmpty(list)) {
            return null;
        }
        
        return list.get(0);
    }

}
