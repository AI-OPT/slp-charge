package com.ai.runner.center.charge.service.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.charge.api.receipt.param.ReceiptPrintLog;
import com.ai.runner.center.charge.dao.mapper.bo.AccReceiptPrintLog;
import com.ai.runner.center.charge.service.atom.interfaces.IAccReceiptPrintLogSV;
import com.ai.runner.center.charge.service.business.interfaces.IReceiptPrintCombSV;
import com.ai.runner.utils.util.BeanUtils;
import com.ai.runner.utils.util.DateUtil;

/**
 * 收据打印服务业务实现类<br>
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Service
@Transactional
public class ReceiptPrintCombSVImpl implements IReceiptPrintCombSV {
    
    @Autowired
    private IAccReceiptPrintLogSV accReceiptPrintLogSV;

    /**
     * 保存收据打印记录
     */
    @Override
    public void saveReceiptPrintLog(ReceiptPrintLog log) throws BusinessException {
        AccReceiptPrintLog accReceiptPrintLog = new AccReceiptPrintLog();
        BeanUtils.copyProperties(accReceiptPrintLog, log);
        accReceiptPrintLog.setValueDate(DateUtil.getTimestamp(log.getPrintDateStr(), DateUtil.DATETIME_FORMAT));
        this.accReceiptPrintLogSV.saveAccReceiptPrintLog(accReceiptPrintLog);
    }

}
