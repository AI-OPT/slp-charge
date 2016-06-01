//package com.ai.runner.center.charge.test.uac;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "/context/core-context.xml" })
//public class UserAuthTest {
//
//    private static final Log log = LogFactory.getLog(UserAuthTest.class);
//    
//    @Test
//    public void testTXSAuth() {
//        String serviceId = PaaSServiceTool.getTXSId();
//        String password = PaaSServiceTool.getTXSPwd(serviceId);
//        log.info("txsId: " + serviceId);
//        log.info("txsPwd: " + password);
//    }
//    
//    @Test
//    public void testDBSAuth() {
//        String serviceId = PaaSServiceTool.getDBSId();
//        String password = PaaSServiceTool.getDBSPwd(serviceId);
//        log.info("dbsId: " + serviceId);
//        log.info("dbsPwd: " + password);
//    }
//    
//    @Test
//    public void getSignatureId() {
//        log.info("ATSSignatureId:" + PaaSServiceTool.getATSSignatureId());
//    }
//}
