package com.ai.slp.charge.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.mds.IMessageProcessor;
import com.ai.paas.ipaas.mds.vo.MessageAndMetadata;
import com.ai.slp.charge.api.payment.param.ChargeDetail;
import com.ai.slp.charge.api.payment.param.PayTypeDetail;
import com.ai.slp.charge.api.payment.param.PaymentParam;
import com.ai.slp.charge.constants.ChargeCostants;
import com.ai.slp.charge.service.business.interfaces.IPaymentManagerSV;
import com.ai.slp.charge.vo.DeductVo;
import com.ai.slp.charge.vo.DeductVo.TransSummaryVo;
import com.alibaba.fastjson.JSON;

/**
 * 订单支付消息处理
 *
 * Date: 2016年6月21日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */
public class RouteChargeMessProcessorImpl implements IMessageProcessor {
    private static Logger logger = LoggerFactory.getLogger(RouteChargeMessProcessorImpl.class);

    private IPaymentManagerSV paymentManagerSV;

    public RouteChargeMessProcessorImpl(IPaymentManagerSV paymentManagerSV) {
        this.paymentManagerSV = paymentManagerSV;
    }
    @Override
    public void process(MessageAndMetadata message) throws Exception {
        logger.info("开始处理(支付/充值)消息  busiType 1:支付;2:充值.........");
        if (null == message)
            return;
        String content = new String(message.getMessage(), "UTF-8");
        logger.info("--Topic:{}\r\n----key:{}\r\n----content:{}", message.getTopic(), new String(
                message.getKey(), "UTF-8"), content);

        //
        DeductVo deductVo = JSON.parseObject(content, DeductVo.class);
        String tenantId = deductVo.getTenantId();
        long acctId = deductVo.getAccountId();
        String orderId = deductVo.getExternalId();
        String busiType = deductVo.getBusiType();//ChargeCostants.ChgChargeLog.BusiType.ORDER_CHARGE;
        //输出当前业务类型信息
        logger.info("busiType--->:"+busiType);
        long totalFee = deductVo.getTotalAmount();
        List<TransSummaryVo> transSummaryVoList = deductVo.getTransSummary();
        String feeItemId = null;
        if(CollectionUtil.isEmpty(transSummaryVoList)){
        	feeItemId = "1001";
        }else{
        	feeItemId = String.valueOf(transSummaryVoList.get(0).getFeeSubjectId());
        }
        //
        PaymentParam paymentParam = new PaymentParam();
        //
        paymentParam.setTenantId(tenantId);
        paymentParam.setAcctId(acctId);
        //paymentParam.setCustId();
        paymentParam.setOrderId(orderId);
        paymentParam.setBusiType(busiType);
        paymentParam.setBusiOperCode(ChargeCostants.BUSI_OPER_CODE);
        paymentParam.setStatus(1);//0：冲正\订单取消 1：正常交费<br>
        paymentParam.setTotalFee(totalFee);
        paymentParam.setDiscountFee(0);//折扣费
        paymentParam.setOperDiscountFee(0);//减免费
        paymentParam.setChargeFee(totalFee);//应收金额
        paymentParam.setPaidFee(totalFee);//实收金额
        paymentParam.setProvinceCode(ChargeCostants.CityCode.ALL);
        paymentParam.setCityCode(ChargeCostants.CityCode.ALL);
        paymentParam.setApplyChlId(ChargeCostants.CityCode.ALL);
        paymentParam.setOperId(ChargeCostants.OPER_ID);
        ChargeDetail chargeDetail = new ChargeDetail();
        chargeDetail.setFeeItemId(feeItemId);//transSummary get 0
        chargeDetail.setTotalFee(totalFee); 
        chargeDetail.setDiscountFee(0);
        chargeDetail.setOperDiscountFee(0);
        chargeDetail.setChargeFee(totalFee);
        chargeDetail.setFeeType(ChargeCostants.ChargeDetail.FEE_TYPE_BUSI); //费用类型 1：营业,一次性费用 2：账务,账务费用
        List<ChargeDetail> chargeDetails = new ArrayList<ChargeDetail>();
        chargeDetails.add(chargeDetail);
        PayTypeDetail payTypeDetail = new PayTypeDetail();
        payTypeDetail.setPayStyle(ChargeCostants.PayTypeDetail.PAY_STYLE_DEFAULT); //支付方式
        payTypeDetail.setPaidFee(totalFee);//支付金额
        List<PayTypeDetail> payTypeDetails = new ArrayList<PayTypeDetail>();
        payTypeDetails.add(payTypeDetail);
        paymentParam.setChargeDetail(chargeDetails);
        paymentParam.setPayTypeDetail(payTypeDetails);
        //
        paymentManagerSV.payment(paymentParam);
        
    }

}
