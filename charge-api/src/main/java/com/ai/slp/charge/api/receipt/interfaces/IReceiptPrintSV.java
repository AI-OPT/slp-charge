package com.ai.slp.charge.api.receipt.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.charge.api.receipt.param.ReceiptPrintLog;

/**
 * 收据打印服务.<br>
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IReceiptPrintSV {

    /**
     * 记录收据打印日志<br>
     * @param log 收据打印记录
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0033
     */
    void saveReceiptPrintLog(ReceiptPrintLog log) throws BusinessException,SystemException;
    
}
