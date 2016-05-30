package com.ai.runner.center.charge.service.atom.interfaces;

import com.ai.runner.center.charge.dao.mapper.bo.AccReceiptPrintLog;

/**
 * 收据打印记录基础服务接口定义
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IAccReceiptPrintLogSV {

    void saveAccReceiptPrintLog(AccReceiptPrintLog log);
    
}
