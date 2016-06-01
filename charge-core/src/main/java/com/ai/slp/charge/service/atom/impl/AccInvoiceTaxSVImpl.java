package com.ai.slp.charge.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.charge.dao.mapper.bo.AccInvoiceTax;
import com.ai.slp.charge.dao.mapper.bo.AccInvoiceTaxCriteria;
import com.ai.slp.charge.dao.mapper.bo.AccInvoiceTaxCriteria.Criteria;
import com.ai.slp.charge.dao.mapper.factory.MapperFactory;
import com.ai.slp.charge.service.atom.interfaces.IAccInvoiceTaxSV;

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
