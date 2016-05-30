package com.ai.runner.center.charge.dao.mapper.interfaces;

import com.ai.runner.center.charge.dao.mapper.bo.AccReceiptPrintLog;
import com.ai.runner.center.charge.dao.mapper.bo.AccReceiptPrintLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccReceiptPrintLogMapper {
    int countByExample(AccReceiptPrintLogCriteria example);

    int deleteByExample(AccReceiptPrintLogCriteria example);

    int insert(AccReceiptPrintLog record);

    int insertSelective(AccReceiptPrintLog record);

    List<AccReceiptPrintLog> selectByExample(AccReceiptPrintLogCriteria example);

    int updateByExampleSelective(@Param("record") AccReceiptPrintLog record, @Param("example") AccReceiptPrintLogCriteria example);

    int updateByExample(@Param("record") AccReceiptPrintLog record, @Param("example") AccReceiptPrintLogCriteria example);
}