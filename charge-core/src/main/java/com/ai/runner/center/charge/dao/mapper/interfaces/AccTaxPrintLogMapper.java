package com.ai.runner.center.charge.dao.mapper.interfaces;

import com.ai.runner.center.charge.dao.mapper.bo.AccTaxPrintLog;
import com.ai.runner.center.charge.dao.mapper.bo.AccTaxPrintLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccTaxPrintLogMapper {
    int countByExample(AccTaxPrintLogCriteria example);

    int deleteByExample(AccTaxPrintLogCriteria example);

    int insert(AccTaxPrintLog record);

    int insertSelective(AccTaxPrintLog record);

    List<AccTaxPrintLog> selectByExample(AccTaxPrintLogCriteria example);

    int updateByExampleSelective(@Param("record") AccTaxPrintLog record, @Param("example") AccTaxPrintLogCriteria example);

    int updateByExample(@Param("record") AccTaxPrintLog record, @Param("example") AccTaxPrintLogCriteria example);
}