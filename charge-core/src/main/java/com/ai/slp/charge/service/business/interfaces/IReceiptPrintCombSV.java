package com.ai.slp.charge.service.business.interfaces;

import com.ai.runner.base.exception.BusinessException;
import com.ai.slp.charge.api.receipt.param.ReceiptPrintLog;

/**
 * 收据打印<br>
 * 
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IReceiptPrintCombSV {

    /**
     * 保存收据打印记录
     * @param log
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    void saveReceiptPrintLog(ReceiptPrintLog log) throws BusinessException;
    
}
