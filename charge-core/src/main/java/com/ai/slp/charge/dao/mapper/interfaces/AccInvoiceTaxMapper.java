package com.ai.slp.charge.dao.mapper.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.slp.charge.dao.mapper.bo.AccInvoiceTax;
import com.ai.slp.charge.dao.mapper.bo.AccInvoiceTaxCriteria;

public interface AccInvoiceTaxMapper {
    int countByExample(AccInvoiceTaxCriteria example);

    int deleteByExample(AccInvoiceTaxCriteria example);

    int insert(AccInvoiceTax record);

    int insertSelective(AccInvoiceTax record);

    List<AccInvoiceTax> selectByExample(AccInvoiceTaxCriteria example);

    int updateByExampleSelective(@Param("record") AccInvoiceTax record, @Param("example") AccInvoiceTaxCriteria example);

    int updateByExample(@Param("record") AccInvoiceTax record, @Param("example") AccInvoiceTaxCriteria example);
}