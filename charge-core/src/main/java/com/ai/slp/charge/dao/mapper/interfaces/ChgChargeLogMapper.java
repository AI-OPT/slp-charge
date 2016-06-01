package com.ai.slp.charge.dao.mapper.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.slp.charge.dao.mapper.bo.ChgChargeLog;
import com.ai.slp.charge.dao.mapper.bo.ChgChargeLogCriteria;

public interface ChgChargeLogMapper {
    int countByExample(ChgChargeLogCriteria example);

    int deleteByExample(ChgChargeLogCriteria example);

    int deleteByPrimaryKey(Long chargeId);

    int insert(ChgChargeLog record);

    int insertSelective(ChgChargeLog record);

    List<ChgChargeLog> selectByExample(ChgChargeLogCriteria example);

    ChgChargeLog selectByPrimaryKey(Long chargeId);

    int updateByExampleSelective(@Param("record") ChgChargeLog record, @Param("example") ChgChargeLogCriteria example);

    int updateByExample(@Param("record") ChgChargeLog record, @Param("example") ChgChargeLogCriteria example);

    int updateByPrimaryKeySelective(ChgChargeLog record);

    int updateByPrimaryKey(ChgChargeLog record);
}