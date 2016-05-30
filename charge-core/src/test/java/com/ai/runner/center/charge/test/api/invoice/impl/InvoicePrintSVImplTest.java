package com.ai.runner.center.charge.test.api.invoice.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.runner.center.charge.api.invoice.interfaces.IInvoicePrintSV;
import com.ai.runner.center.charge.api.invoice.param.InvoiceTax;
import com.ai.runner.center.charge.api.invoice.param.InvoiceTaxQryParam;
import com.ai.runner.center.charge.api.invoice.param.OrderInvoicePrintDetail;
import com.ai.runner.center.charge.api.invoice.param.OrderInvoicePrintReq;
import com.ai.runner.center.charge.api.invoice.param.TaxPrintLog;
import com.ai.runner.utils.util.DateUtil;
import com.alibaba.fastjson.JSON;


/**
 * 收据凭证打印服务测试类
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class InvoicePrintSVImplTest {
    
    private static final Log LOG = LogFactory.getLog(InvoicePrintSVImplTest.class);

    @Autowired
    private IInvoicePrintSV invoicePrintSV;
    
    @Test
    public void testQueryInvoiceTax() {
        InvoiceTaxQryParam qryParam = new InvoiceTaxQryParam();
        qryParam.setTenantId("BIS-ST");
        qryParam.setProvinceCode("11");
        qryParam.setCityCode("110");
        LOG.info(JSON.toJSONString(qryParam));
        InvoiceTax invoiceTax = invoicePrintSV.queryInvoiceTax(qryParam);
        LOG.info(JSON.toJSONString(invoiceTax));
    }

    @Test
    public void testQueryOrderInvoicePrintDetail() {
        OrderInvoicePrintReq req = new OrderInvoicePrintReq();
        req.setTenantId("BIS-ST");
        req.setOrderId("T215082700001774");
        LOG.info(JSON.toJSONString(req));
        OrderInvoicePrintDetail info = invoicePrintSV.queryOrderInvoicePrintDetail(req);
        LOG.info(JSON.toJSONString(info));
    }
    
    @Test
    public void testSaveTaxPrintLog() {
        TaxPrintLog log = new TaxPrintLog();
        log.setAccountId(103l);
        log.setCustId(2502l);
        log.setTenantId("BIS-ST");
        log.setSerialCode("201509291940408229");
        log.setOrderId("T215082700001774");
        log.setInvoiceType("2");
        log.setPrintDateStr(DateUtil.getDateString(DateUtil.DATETIME_FORMAT));
        log.setInvoiceTitle("增值税发票凭证（增值税专票）");
        log.setInvAddress("海淀区东北旺西路 010-82088208");
        log.setInvBank("建行 43325343454356345");
        log.setInvCertificateNo("20150910");
        log.setBaseAmount(40950l);
        log.setAddAmount(0l);
        log.setTerminalAmount(40000l);
        log.setTotalAmount(80950l);
        log.setOperatorId("311");
        log.setStatus(1);
        LOG.info(JSON.toJSONString(log));       
        invoicePrintSV.saveTaxPrintLog(log);
    }
}
