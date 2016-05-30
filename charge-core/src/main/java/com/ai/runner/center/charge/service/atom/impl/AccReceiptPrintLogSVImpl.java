package com.ai.runner.center.charge.service.atom.impl;

import org.springframework.stereotype.Component;

import com.ai.runner.center.charge.dao.mapper.bo.AccReceiptPrintLog;
import com.ai.runner.center.charge.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.charge.service.atom.interfaces.IAccReceiptPrintLogSV;

/**
 * 收据打印记录基础服务实现类
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Component
public class AccReceiptPrintLogSVImpl implements IAccReceiptPrintLogSV {

    @Override
    public void saveAccReceiptPrintLog(AccReceiptPrintLog log) {
        MapperFactory.getAccReceiptPrintLogMapper().insert(log);
    }

}
