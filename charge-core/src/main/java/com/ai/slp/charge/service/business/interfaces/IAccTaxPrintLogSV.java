package com.ai.slp.charge.service.business.interfaces;

import com.ai.slp.charge.dao.mapper.bo.AccTaxPrintLog;

/**
 * 增值税发票打印记录基础服务类
 *
 * Date: 2015年9月20日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IAccTaxPrintLogSV {

    void saveAccTaxPrintLog(AccTaxPrintLog log);
    
}
