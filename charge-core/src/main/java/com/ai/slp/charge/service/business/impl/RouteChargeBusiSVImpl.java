package com.ai.slp.charge.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.components.mds.MDSClientFactory;
import com.ai.paas.ipaas.mds.IMessageConsumer;
import com.ai.paas.ipaas.mds.IMessageProcessor;
import com.ai.paas.ipaas.mds.IMsgProcessorHandler;
import com.ai.slp.charge.constants.ChargeCostants;
import com.ai.slp.charge.service.business.interfaces.IPaymentManagerSV;
import com.ai.slp.charge.service.business.interfaces.RouteChargeBusiSV;
/**
 * 订单支付消息处理
 *
 * Date: 2016年6月21日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */
@Service
@Transactional
public class RouteChargeBusiSVImpl implements RouteChargeBusiSV {
	@Autowired
	private IPaymentManagerSV paymentManagerSV; 
	
	@PostConstruct
    public void RouteChargeMdsProcess() {
        IMsgProcessorHandler msgProcessorHandler = new IMsgProcessorHandler() {
            @Override
            public IMessageProcessor[] createInstances(int paramInt) {
                List<IMessageProcessor> processors = new ArrayList<>();
                IMessageProcessor processor = null;
                for (int i = 0; i < paramInt; i++) {
                    processor = new RouteChargeMessProcessorImpl(paymentManagerSV);
                    processors.add(processor);
                }
                return processors.toArray(new IMessageProcessor[processors.size()]);
            }
        };
        IMessageConsumer msgConsumer = MDSClientFactory.getConsumerClient(
                ChargeCostants.OrdOrder.SLP_CHARGE_TOPIC, msgProcessorHandler);
        msgConsumer.start();
    }
}
