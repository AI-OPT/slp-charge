package com.ai.slp.charge.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.slp.charge.dao.mapper.interfaces.AccInvoiceTaxMapper;
import com.ai.slp.charge.dao.mapper.interfaces.AccReceiptPrintLogMapper;
import com.ai.slp.charge.dao.mapper.interfaces.AccTaxPrintLogMapper;
import com.ai.slp.charge.dao.mapper.interfaces.ChgChargeDetailLogMapper;
import com.ai.slp.charge.dao.mapper.interfaces.ChgChargeLogMapper;
import com.ai.slp.charge.dao.mapper.interfaces.ChgChargePayTypeLogMapper;
import com.ai.slp.charge.dao.mapper.interfaces.ChgPayOrderLogMapper;

@Component
public class MapperFactory {

    @Autowired
    private SqlSessionTemplate st;

    private static SqlSessionTemplate sqlSessionTemplate;

    @PostConstruct
    void init() {
        setSqlSessionTemplate(st);
    }
    
    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
    }

    /**
     * 收费流水记录表
     * 
     * @return
     * @author LiangMeng
     * @ApiDocMethod
     */
    public static ChgChargeLogMapper getChgChargeLogMapper() {
        return sqlSessionTemplate.getMapper(ChgChargeLogMapper.class);
    }

    /**
     * 收费明细记录表
     * 
     * @return
     * @author LiangMeng
     * @ApiDocMethod
     */
    public static ChgChargeDetailLogMapper getChgChargeDetailLogMapper() {
        return sqlSessionTemplate.getMapper(ChgChargeDetailLogMapper.class);
    }

    /**
     * 收费支付记录表
     * 
     * @return
     * @author LiangMeng
     * @ApiDocMethod
     */
    public static ChgChargePayTypeLogMapper getChgChargePayTypeLogMapper() {
        return sqlSessionTemplate.getMapper(ChgChargePayTypeLogMapper.class);
    }
    
    /**
     * 收据打印记录表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static AccReceiptPrintLogMapper getAccReceiptPrintLogMapper() {
        return sqlSessionTemplate.getMapper(AccReceiptPrintLogMapper.class);
    }
    
    /**
     * 增值税发票税率表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static AccInvoiceTaxMapper getAccInvoiceTaxMapper() {
        return sqlSessionTemplate.getMapper(AccInvoiceTaxMapper.class);
    }
    
    /**
     * 增值税发票打印记录表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static AccTaxPrintLogMapper getAccTaxPrintLogMapper() {
        return sqlSessionTemplate.getMapper(AccTaxPrintLogMapper.class);
    }
    /**
     * 收费订单接口
     * @return
     * @author LiangMeng
     * @ApiDocMethod
     */
    public static ChgPayOrderLogMapper getChgPayOrderLogMapper() {
        return sqlSessionTemplate.getMapper(ChgPayOrderLogMapper.class);
    }
}
