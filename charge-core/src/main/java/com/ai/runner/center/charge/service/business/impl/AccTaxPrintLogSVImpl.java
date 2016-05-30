package com.ai.runner.center.charge.service.business.impl;

import org.springframework.stereotype.Component;

import com.ai.runner.center.charge.dao.mapper.bo.AccTaxPrintLog;
import com.ai.runner.center.charge.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.charge.service.business.interfaces.IAccTaxPrintLogSV;

/**
 * 增值税发票打印记录基础服务类
 *
 * Date: 2015年9月20日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Component
public class AccTaxPrintLogSVImpl implements IAccTaxPrintLogSV {

    @Override
    public void saveAccTaxPrintLog(AccTaxPrintLog log) {
        MapperFactory.getAccTaxPrintLogMapper().insert(log);
    }

}
