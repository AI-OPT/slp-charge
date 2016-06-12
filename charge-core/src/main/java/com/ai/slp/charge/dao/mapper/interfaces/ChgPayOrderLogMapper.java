package com.ai.slp.charge.dao.mapper.interfaces;

import com.ai.slp.charge.dao.mapper.bo.ChgPayOrderLog;
import com.ai.slp.charge.dao.mapper.bo.ChgPayOrderLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChgPayOrderLogMapper {
    int countByExample(ChgPayOrderLogCriteria example);

    int deleteByExample(ChgPayOrderLogCriteria example);

    int deleteByPrimaryKey(String orderId);

    int insert(ChgPayOrderLog record);

    int insertSelective(ChgPayOrderLog record);

    List<ChgPayOrderLog> selectByExample(ChgPayOrderLogCriteria example);

    ChgPayOrderLog selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ChgPayOrderLog record, @Param("example") ChgPayOrderLogCriteria example);

    int updateByExample(@Param("record") ChgPayOrderLog record, @Param("example") ChgPayOrderLogCriteria example);

    int updateByPrimaryKeySelective(ChgPayOrderLog record);

    int updateByPrimaryKey(ChgPayOrderLog record);
}