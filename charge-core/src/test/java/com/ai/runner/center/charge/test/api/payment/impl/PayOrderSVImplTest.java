package com.ai.runner.center.charge.test.api.payment.impl;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.exception.BusinessException;
import com.ai.slp.charge.api.payment.interfaces.IPayOrderSV;
import com.ai.slp.charge.api.payment.interfaces.IPaymentSV;
import com.ai.slp.charge.api.payment.param.ChargeDetail;
import com.ai.slp.charge.api.payment.param.PayOrderParam;
import com.ai.slp.charge.api.payment.param.PayTypeDetail;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.alibaba.fastjson.JSON;


/**
 * 缴费订单测试类
 * Date: 2016年6月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class PayOrderSVImplTest {

    private static final Log LOG = LogFactory.getLog(PayOrderSVImplTest.class);
    
    /**
     * 创建收费流水服务
     */
    @Autowired
    private IPayOrderSV payOrderSV;
    
    /**
     * 创建收费流水测试案例1：
     * 传入正确的收费流水创建入参，验证以下几点：
     * 1.验证能够正确的返回收费流水号
     * 2.验证收费流水表，收费明细表，支付明细表数据正常沉淀
     * 3.验证收费记录索引表沉淀相应的索引
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testPaymentCase1() {
       
//        long chargeId = this.paymentSV.payment(paymentParam);
//        assertNotEquals(0, chargeId);
//        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    /**
     * 创建缴费订单
     * 
     * @author LiangMeng
     * @ApiDocMethod
     */
    @Test
    public void testPayOrderCreateCase1() {
       PayOrderParam param = new PayOrderParam();
       param.setAcctId("100001");
       param.setCustId("100001");
       param.setOrdDes("测试订单");
       param.setPayAmount(100l);
       param.setPayChannel(4);
       param.setTenantId("BLB");
       String orderId = payOrderSV.createPayOrder(param);
       assertNotEquals(0, orderId);
       LOG.info("返回的收费流水号：" + orderId);
    }
    
    /**
     * 修改缴费订单
     * 
     * @author LiangMeng
     * @ApiDocMethod
     */
    @Test
    public void testPayOrderUpdateCase1() {
       PayOrderParam param = new PayOrderParam();
       param.setOrderId("201");
       param.setOrdDes("测试订单");
       param.setPayOrgId("ZFB");
       param.setPayOrgSerial("10101010");
       param.setStatus(4);
       String orderId = payOrderSV.updatePayOrder(param);
       assertNotEquals(0, orderId);
       LOG.info("返回的收费流水号：" + orderId);
    }

    @Test
    public void testPayOrderCallCase1() {
       PayOrderParam param = new PayOrderParam();
       param.setOrderId(201l+"");
       param.setPayOrgId("weixin");
       param.setPayOrgSerial("10101010");
       param.setStatus(2);
       
       
       PaymentParam paymentParam = new PaymentParam();
       paymentParam.setTenantId("1");
       paymentParam.setAcctId(100001);
       paymentParam.setCustId(100001);
       paymentParam.setOrderId("201");
       paymentParam.setBusiType("1");
       paymentParam.setBusiOperCode("30000");
       paymentParam.setStatus(1);
       paymentParam.setTotalFee(25000l);
       paymentParam.setDiscountFee(3000l);
       paymentParam.setOperDiscountFee(2000l);
       paymentParam.setChargeFee(20000l);
       paymentParam.setPaidFee(20000l);
       paymentParam.setProvinceCode("11");
       paymentParam.setCityCode("110");
       paymentParam.setApplyChlId("chl-bj");
       paymentParam.setOperId("123456");
       ChargeDetail chargeDetail = new ChargeDetail();
       chargeDetail.setFeeItemId("1001");
       chargeDetail.setTotalFee(25000l); 
       chargeDetail.setDiscountFee(3000l);
       chargeDetail.setOperDiscountFee(2000l);
       chargeDetail.setChargeFee(20000l);
       chargeDetail.setFeeType("1");
       List<ChargeDetail> chargeDetails = new ArrayList<ChargeDetail>();
       chargeDetails.add(chargeDetail);
       PayTypeDetail payTypeDetail = new PayTypeDetail();
       payTypeDetail.setPayStyle(1);
       payTypeDetail.setPaidFee(20000l);
       List<PayTypeDetail> payTypeDetails = new ArrayList<PayTypeDetail>();
       payTypeDetails.add(payTypeDetail);
       paymentParam.setChargeDetail(chargeDetails);
       paymentParam.setPayTypeDetail(payTypeDetails);
       
       String orderId = payOrderSV.callPayOrder(param, paymentParam);
       LOG.info("返回的收费流水号：" + orderId);
    }
}
