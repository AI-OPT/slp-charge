package com.ai.runner.center.charge.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.runner.center.charge.dao.mapper.bo.AccInvoiceTax;
import com.ai.runner.center.charge.dao.mapper.bo.AccInvoiceTaxCriteria;
import com.ai.runner.center.charge.dao.mapper.bo.AccInvoiceTaxCriteria.Criteria;
import com.ai.runner.center.charge.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.charge.service.atom.interfaces.IAccInvoiceTaxSV;
import com.ai.runner.utils.util.CollectionUtil;
import com.ai.runner.utils.util.StringUtil;

/**
 * 增值税发票税率基础服务 
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Component
public class AccInvoiceTaxSVImpl implements IAccInvoiceTaxSV {

    @Override
    public AccInvoiceTax getAccInvoiceTax(String tenantId, String provinceCode, String cityCode) {
        AccInvoiceTaxCriteria sql = new AccInvoiceTaxCriteria();
        Criteria criteria = sql.createCriteria();
        criteria.andTenantIdEqualTo(tenantId);
        if(!StringUtil.isBlank(provinceCode)) {
            criteria.andProvCodeEqualTo(provinceCode);
        }
        
        if(!StringUtil.isBlank(cityCode)) {
            criteria.andCityCodeEqualTo(cityCode);
        }
        
        List<AccInvoiceTax> accInvoiceTaxs = MapperFactory.getAccInvoiceTaxMapper().selectByExample(sql);
        if(CollectionUtil.isEmpty(accInvoiceTaxs)) {
            return null;
        }
        
        return accInvoiceTaxs.get(0);
    }

}
