package com.ai.runner.center.charge.test.api.paymentquery.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.charge.api.paymentquery.interfaces.IPaymentQuerySV;
import com.ai.slp.charge.api.paymentquery.param.ChargeBaseInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfo;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfoQueryByAcctIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargeInfoQueryByCustIdParam;
import com.ai.slp.charge.api.paymentquery.param.ChargePayTypeDetail;
import com.ai.slp.charge.api.paymentquery.param.PaymentQryParam;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * 收费流水查询服务测试类
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class PaymentQuerySVImplTest {

    private static final Log LOG = LogFactory.getLog(PaymentQuerySVImplTest.class);
    
    /**
     * 收费流水查询服务
     */
    @Autowired
    private IPaymentQuerySV paymentQuerySV;
    
    /**
     * 按收费流水号查询收费记录信息
     * 测试案例1：
     * 传入正确的收费流水号，验证能够正确完整地返回收费流水信息
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargeInfoByChargeIdCase1() {           
        ChargeIdParam param = new ChargeIdParam();
        param.setChargeId(853);
        param.setTenantId("BIS-ST");   
        LOG.info(JSON.toJSONString(param));
        ChargeInfo info = this.paymentQuerySV.queryChargeInfoByChargeId(param);
        assertNotNull(info);
        LOG.info(JSON.toJSONString(info));
    }
    
    /**
     * 按收费流水号查询收费记录信息
     * 测试案例2：
     * 测试捕获异常切片配置
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test(expected = BusinessException.class)
    public void testQueryChargeInfoByChargeIdCase2() {           
        ChargeIdParam param = new ChargeIdParam();
        param.setTenantId("1");   
        ChargeInfo info = this.paymentQuerySV.queryChargeInfoByChargeId(param);
        assertNull(info);
    }
    
    /**
     * 按收费流水号查询收费记录信息
     * 测试案例3：
     * 传入错误的收费流水号，验证返回对象为null
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargeInfoByChargeIdCase3() {           
        ChargeIdParam param = new ChargeIdParam();
        param.setChargeId(20150812l);
        param.setTenantId("1");   
        
        ChargeInfo info = this.paymentQuerySV.queryChargeInfoByChargeId(param);
        assertNull(info);
    }
    
    /**
     * 按订单号查询收费记录信息
     * 测试案例1：
     * 传入正确的订单号，验证能够正确完整地返回收费流水信息
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargeInfoByOrderIdCase1() {
        PaymentQryParam param = new PaymentQryParam();
        param.setOrderId("T215082700001774");
        param.setBusiType("1");
        param.setTenantId("BIS-ST");  
        LOG.info(JSON.toJSONString(param));
        ChargeInfo info = this.paymentQuerySV.queryChargeInfoByOrderId(param);
        assertNotNull(info);
        LOG.info(JSON.toJSONString(info));
    }
    
    /**
     * 按订单号查询收费记录信息
     * 测试案例2：
     * 传入错误的订单号，验证返回对象为null
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargeInfoByOrderIdCase2() {
        PaymentQryParam param = new PaymentQryParam();
        param.setOrderId("TNAN2015080001");
        param.setBusiType("1");
        param.setTenantId("1");  
        ChargeInfo info = this.paymentQuerySV.queryChargeInfoByOrderId(param);
        assertNull(info);
    }
    
    /**
     * 按订单号查询支付明细信息
     * 测试案例1：
     * 传入正确的订单号，验证能够正确完整地返回支付明细信息
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargePayTypeDetailsCase1() {
        PaymentQryParam param = new PaymentQryParam();
        param.setOrderId("T215082700001774");
        param.setBusiType("1");
        param.setTenantId("BIS-ST");  
        LOG.info(JSON.toJSONString(param));
        List<ChargePayTypeDetail> payTypeDetails = this.paymentQuerySV.queryChargePayTypeDetailsByOrderId(param);
        //assertEquals(1, payTypeDetails.size());
        LOG.info(JSONArray.toJSONString(payTypeDetails));
    }
    
    /**
     * 按订单号查询支付明细信息
     * 测试案例2：
     * 传入错误的订单号，验证返回空集合
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargePayTypeDetailsCase2() {
        PaymentQryParam param = new PaymentQryParam();
        param.setOrderId("TNAN2015080001");
        param.setBusiType("1");
        param.setTenantId("1");  
        List<ChargePayTypeDetail> payTypeDetails = this.paymentQuerySV.queryChargePayTypeDetailsByOrderId(param);
        assertEquals(0, payTypeDetails.size());
    }

    /**
     * 按账户ID查询收费记录信息
     * 测试案例1：
     * 传入正确的账户ID，验证能够正确完整地返回收费流水信息
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargeBaseInfoByAcctIdCase1() {
        ChargeInfoQueryByAcctIdParam param = new ChargeInfoQueryByAcctIdParam();
        param.setTenantId("BIS-ST");
        param.setAccountId(103);
        //param.setStartTime(DateUtil.getTimestamp("2015-12-04", DateUtil.DATE_FORMAT));
        //param.setEndTime(DateUtil.getTimestamp("2015-12-05", DateUtil.DATE_FORMAT));
        PageInfo<ChargeBaseInfo> pageInfo = new PageInfo<ChargeBaseInfo>();
        pageInfo.setPageNo(2);
        pageInfo.setPageSize(3);
        param.setPageInfo(pageInfo);
        LOG.info(JSON.toJSONString(param));
        PageInfo<ChargeBaseInfo> infos = this.paymentQuerySV.queryChargeBaseInfoByAcctId(param);
        LOG.info(JSONArray.toJSONString(infos));
    }

    /**
     * 按客户ID查询收费记录信息
     * 测试案例1：
     * 传入正确的客户ID，验证能够正确完整地返回收费流水信息
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testQueryChargeBaseInfoByCustIdCase1() {
        ChargeInfoQueryByCustIdParam param = new ChargeInfoQueryByCustIdParam();
        param.setTenantId("BIS-ST");
        param.setCustId(2502l);
        param.setStartTime(DateUtil.getTimestamp("2015-12-04", DateUtil.DATE_FORMAT));
        param.setEndTime(DateUtil.getTimestamp("2015-12-05", DateUtil.DATE_FORMAT));
        PageInfo<ChargeBaseInfo> pageInfo = new PageInfo<ChargeBaseInfo>();
        pageInfo.setPageNo(2);
        pageInfo.setPageSize(3);
        param.setPageInfo(pageInfo);
        LOG.info(JSON.toJSONString(param));
        PageInfo<ChargeBaseInfo> infos = this.paymentQuerySV.queryChargeBaseInfoByCustId(param);
        LOG.info(JSONArray.toJSONString(infos));
    }

}
