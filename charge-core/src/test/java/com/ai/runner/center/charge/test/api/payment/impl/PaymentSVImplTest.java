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
import com.ai.slp.charge.api.payment.interfaces.IPaymentSV;
import com.ai.slp.charge.api.payment.param.ChargeDetail;
import com.ai.slp.charge.api.payment.param.PayTypeDetail;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.alibaba.fastjson.JSON;


/**
 * 创建收费流水服务测试类
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class PaymentSVImplTest {

    private static final Log LOG = LogFactory.getLog(PaymentSVImplTest.class);
    
    /**
     * 创建收费流水服务
     */
    @Autowired
    private IPaymentSV paymentSV;
    
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
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setCustId(12);
        paymentParam.setOrderId("T201508110001");
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
        long chargeId = this.paymentSV.payment(paymentParam);
        assertNotEquals(0, chargeId);
        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    /**
     * 创建收费流水测试案例2：
     * 场景：传入正确的收费流水创建入参，其中订单号、业务类型、租户ID与案例1相同，验证幂等性校验：
     * 期待结果：返回之前的收费流水号，防止重复创建
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testPaymentCase2() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setCustId(12);
        paymentParam.setOrderId("T201508110001");
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
        long chargeId = this.paymentSV.payment(paymentParam);
        assertNotEquals(0, chargeId);
        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    /**
     * 创建收费流水测试案例3：
     * 场景：传入错误的业务类型：
     * 期待结果：验证不通过，创建收费流水记录失败
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test(expected = BusinessException.class)
    public void testPaymentCase3() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setCustId(12);
        paymentParam.setOrderId("T201508110001");
        paymentParam.setBusiType("3");
        paymentParam.setBusiOperCode("30000");
        paymentParam.setTotalFee(25000l);
        paymentParam.setDiscountFee(3000l);
        paymentParam.setOperDiscountFee(2000l);
        paymentParam.setChargeFee(20000l);
        paymentParam.setPaidFee(20000l);
        paymentParam.setProvinceCode("11");
        paymentParam.setCityCode("110");
        paymentParam.setApplyChlId("chl-bj");
        paymentParam.setOperId("123456");
        long chargeId = this.paymentSV.payment(paymentParam);
    }
    
    /**
     * 创建收费流水测试案例4：
     * 场景：传入错误的费用明细信息：
     * 期待结果：验证不通过，创建收费流水记录失败
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test(expected = BusinessException.class)
    public void testPaymentCase4() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setCustId(12);
        paymentParam.setOrderId("T201508110001");
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
        //chargeDetail.setChargeFee(-1l);
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
        long chargeId = this.paymentSV.payment(paymentParam);
        assertNotEquals(0, chargeId);
        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    /**
     * 创建收费流水测试案例5：
     * 场景：传入错误的支付明细信息：
     * 期待结果：验证不通过，创建收费流水记录失败
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test(expected = BusinessException.class)
    public void testPaymentCase5() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setCustId(12);
        paymentParam.setOrderId("T201508110001");
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
        payTypeDetail.setPaidFee(20000l);
        List<PayTypeDetail> payTypeDetails = new ArrayList<PayTypeDetail>();
        payTypeDetails.add(payTypeDetail);
        paymentParam.setChargeDetail(chargeDetails);
        paymentParam.setPayTypeDetail(payTypeDetails);
        long chargeId = this.paymentSV.payment(paymentParam);
        assertNotEquals(0, chargeId);
        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    /**
     * 创建收费流水测试案例6：
     * 缴费充值类
     * 传入正确的收费流水创建入参，验证以下几点：
     * 1.验证能够正确的返回收费流水号
     * 2.验证收费流水表，收费明细表，支付明细表数据正常沉淀
     * 3.验证收费记录索引表沉淀相应的索引
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testPaymentCase6() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setOrderId("T201508110002");
        paymentParam.setBusiType("2");
        paymentParam.setBusiOperCode("30000");
        paymentParam.setStatus(1);
        paymentParam.setTotalFee(80000l);
        paymentParam.setChargeFee(80000l);
        paymentParam.setPaidFee(80000l);
        paymentParam.setProvinceCode("11");
        paymentParam.setCityCode("110");
        paymentParam.setApplyChlId("chl-bj");
        paymentParam.setOperId("123456");
        
        ChargeDetail chargeDetail = new ChargeDetail();
        chargeDetail.setFeeItemId("1001");
        chargeDetail.setTotalFee(50000l); 
        chargeDetail.setChargeFee(50000l);
        chargeDetail.setFeeType("2");
        
        ChargeDetail chargeDetail2 = new ChargeDetail();
        chargeDetail2.setFeeItemId("1002");
        chargeDetail2.setTotalFee(30000l); 
        chargeDetail2.setChargeFee(30000l);
        chargeDetail2.setFeeType("2");
        List<ChargeDetail> chargeDetails = new ArrayList<ChargeDetail>();
        chargeDetails.add(chargeDetail);
        chargeDetails.add(chargeDetail2);
        
        PayTypeDetail payTypeDetail1 = new PayTypeDetail();
        payTypeDetail1.setPayStyle(1);
        payTypeDetail1.setPaidFee(50000l);
        
        PayTypeDetail payTypeDetail2 = new PayTypeDetail();
        payTypeDetail2.setPayStyle(21);
        payTypeDetail2.setPaidFee(30000l);
        
        List<PayTypeDetail> payTypeDetails = new ArrayList<PayTypeDetail>();
        payTypeDetails.add(payTypeDetail1);
        payTypeDetails.add(payTypeDetail2);
        paymentParam.setChargeDetail(chargeDetails);
        paymentParam.setPayTypeDetail(payTypeDetails);
        long chargeId = this.paymentSV.payment(paymentParam);
        assertNotEquals(0, chargeId);
        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    /**
     * 创建收费流水测试案例7：
     * 订单撤销传入负金额，验证能够正确的返回收费流水号
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testPaymentCase7() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("1");
        paymentParam.setAcctId(502);
        paymentParam.setCustId(12);
        paymentParam.setOrderId("T201508110012");
        paymentParam.setBusiType("1");
        paymentParam.setBusiOperCode("30000");
        paymentParam.setStatus(0);
        paymentParam.setCancelChargeId(52l);
        paymentParam.setTotalFee(-25000l);
        paymentParam.setDiscountFee(-3000l);
        paymentParam.setOperDiscountFee(-2000l);
        paymentParam.setChargeFee(-20000l);
        paymentParam.setPaidFee(-20000l);
        paymentParam.setProvinceCode("11");
        paymentParam.setCityCode("110");
        paymentParam.setApplyChlId("chl-bj");
        paymentParam.setOperId("123456");
        ChargeDetail chargeDetail = new ChargeDetail();
        chargeDetail.setFeeItemId("1001");
        chargeDetail.setTotalFee(-25000l); 
        chargeDetail.setDiscountFee(-3000l);
        chargeDetail.setOperDiscountFee(-2000l);
        chargeDetail.setChargeFee(-20000l);
        chargeDetail.setFeeType("1");
        List<ChargeDetail> chargeDetails = new ArrayList<ChargeDetail>();
        chargeDetails.add(chargeDetail);
        PayTypeDetail payTypeDetail = new PayTypeDetail();
        payTypeDetail.setPayStyle(1);
        payTypeDetail.setPaidFee(-20000l);
        List<PayTypeDetail> payTypeDetails = new ArrayList<PayTypeDetail>();
        payTypeDetails.add(payTypeDetail);
        paymentParam.setChargeDetail(chargeDetails);
        paymentParam.setPayTypeDetail(payTypeDetails);
        long chargeId = this.paymentSV.payment(paymentParam);
        assertNotEquals(0, chargeId);
        LOG.info("返回的收费流水号：" + chargeId);
    }
    
    @Test
    public void constructPaymentParam() {
        PaymentParam paymentParam = new PaymentParam();
        paymentParam.setTenantId("BIS-ST");
        paymentParam.setAcctId(103);
        paymentParam.setCustId(2502l);
        paymentParam.setOrderId("T215082700001774");
        paymentParam.setBusiType("1");
        paymentParam.setBusiOperCode("30000");
        paymentParam.setStatus(1);
        paymentParam.setTotalFee(108950l);
        paymentParam.setDiscountFee(20000l);
        paymentParam.setOperDiscountFee(8000l);
        paymentParam.setChargeFee(80950l);
        paymentParam.setPaidFee(80950l);
        paymentParam.setProvinceCode("11");
        paymentParam.setCityCode("110");
        paymentParam.setApplyChlId("chl-bj");
        paymentParam.setOperId("123456");
        
        ChargeDetail chargeDetail = new ChargeDetail();
        chargeDetail.setFeeItemId("100000");
        chargeDetail.setTotalFee(68950l); 
        chargeDetail.setDiscountFee(20000l);
        chargeDetail.setOperDiscountFee(8000l);
        chargeDetail.setChargeFee(40950l);
        chargeDetail.setFeeType("1");
        
        ChargeDetail chargeDetail2 = new ChargeDetail();
        chargeDetail2.setFeeItemId("100001");
        chargeDetail2.setTotalFee(40000l); 
        chargeDetail2.setChargeFee(40000l);
        chargeDetail2.setFeeType("1");
        List<ChargeDetail> chargeDetails = new ArrayList<ChargeDetail>();
        chargeDetails.add(chargeDetail);
        chargeDetails.add(chargeDetail2);
        
        PayTypeDetail payTypeDetail1 = new PayTypeDetail();
        payTypeDetail1.setPayStyle(1);
        payTypeDetail1.setPaidFee(50000l);
        
        PayTypeDetail payTypeDetail2 = new PayTypeDetail();
        payTypeDetail2.setPayStyle(10);
        payTypeDetail2.setPaidFee(30950l);
        
        List<PayTypeDetail> payTypeDetails = new ArrayList<PayTypeDetail>();
        payTypeDetails.add(payTypeDetail1);
        payTypeDetails.add(payTypeDetail2);
        paymentParam.setChargeDetail(chargeDetails);
        paymentParam.setPayTypeDetail(payTypeDetails);
        LOG.info(JSON.toJSONString(paymentParam));
    }

}
