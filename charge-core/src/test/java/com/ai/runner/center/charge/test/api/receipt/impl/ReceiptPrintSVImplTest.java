package com.ai.runner.center.charge.test.api.receipt.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.charge.api.receipt.interfaces.IReceiptPrintSV;
import com.ai.slp.charge.api.receipt.param.ReceiptPrintLog;
import com.alibaba.fastjson.JSON;


/**
 * 收据打印测试类
 *
 * Date: 2015年9月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class ReceiptPrintSVImplTest {
    
    private static final Log LOG = LogFactory.getLog(ReceiptPrintSVImplTest.class);

    @Autowired
    private IReceiptPrintSV receiptPrintSV;
    
    @Test
    public void testSaveReceiptPrintLog() {
        ReceiptPrintLog log = new ReceiptPrintLog();
        log.setTenantId("BIS-ST");
        log.setSystemId("runner-bis-office");
        log.setOrderId("T215082700001774");
        log.setCustId(2502l);
        log.setCustName("华翔");
        log.setPaidFee(80950l);
        log.setPaystyleName("现金、转账汇款");
        log.setPrintDateStr(DateUtil.getDateString(DateUtil.DATETIME_FORMAT));
        log.setChlId("100001");
        log.setOperatorId("311");
        LOG.info(JSON.toJSONString(log));
        this.receiptPrintSV.saveReceiptPrintLog(log);
    }

}
