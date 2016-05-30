package com.ai.runner.center.charge.test.seq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.runner.sdk.sequence.util.SeqUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class SeqTest {

    @Test
    public void testdbsseq() {
        System.out.println("start seq test...");
        System.out.println("seq1:" + SeqUtil.getNewId("CHG_CHARGE_LOG$CHARGE_ID$SEQ"));
        System.out.println("seq2:" + SeqUtil.getNewId("CHG_CHARGE_LOG$CHARGE_ID$SEQ"));
        System.out.println("seq3:" + SeqUtil.getNewId("CHG_CHARGE_LOG$CHARGE_ID$SEQ", 10));
        System.out.println("end seq test...");
    }
    
}
