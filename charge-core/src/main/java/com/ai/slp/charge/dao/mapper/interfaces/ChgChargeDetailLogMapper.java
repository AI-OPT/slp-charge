package com.ai.slp.charge.dao.mapper.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.slp.charge.dao.mapper.bo.ChgChargeDetailLog;
import com.ai.slp.charge.dao.mapper.bo.ChgChargeDetailLogCriteria;

public interface ChgChargeDetailLogMapper {
    int countByExample(ChgChargeDetailLogCriteria example);

    int deleteByExample(ChgChargeDetailLogCriteria example);

    int deleteByPrimaryKey(Long feeDetailId);

    int insert(ChgChargeDetailLog record);

    int insertSelective(ChgChargeDetailLog record);

    List<ChgChargeDetailLog> selectByExample(ChgChargeDetailLogCriteria example);

    ChgChargeDetailLog selectByPrimaryKey(Long feeDetailId);

    int updateByExampleSelective(@Param("record") ChgChargeDetailLog record, @Param("example") ChgChargeDetailLogCriteria example);

    int updateByExample(@Param("record") ChgChargeDetailLog record, @Param("example") ChgChargeDetailLogCriteria example);

    int updateByPrimaryKeySelective(ChgChargeDetailLog record);

    int updateByPrimaryKey(ChgChargeDetailLog record);
}