package com.ai.slp.charge.dao.mapper.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.slp.charge.dao.mapper.bo.AccReceiptPrintLog;
import com.ai.slp.charge.dao.mapper.bo.AccReceiptPrintLogCriteria;

public interface AccReceiptPrintLogMapper {
    int countByExample(AccReceiptPrintLogCriteria example);

    int deleteByExample(AccReceiptPrintLogCriteria example);

    int insert(AccReceiptPrintLog record);

    int insertSelective(AccReceiptPrintLog record);

    List<AccReceiptPrintLog> selectByExample(AccReceiptPrintLogCriteria example);

    int updateByExampleSelective(@Param("record") AccReceiptPrintLog record, @Param("example") AccReceiptPrintLogCriteria example);

    int updateByExample(@Param("record") AccReceiptPrintLog record, @Param("example") AccReceiptPrintLogCriteria example);
}