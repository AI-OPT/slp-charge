package com.ai.slp.charge.service.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.charge.api.receipt.param.ReceiptPrintLog;
import com.ai.slp.charge.dao.mapper.bo.AccReceiptPrintLog;
import com.ai.slp.charge.service.atom.interfaces.IAccReceiptPrintLogSV;
import com.ai.slp.charge.service.business.interfaces.IReceiptPrintCombSV;

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
