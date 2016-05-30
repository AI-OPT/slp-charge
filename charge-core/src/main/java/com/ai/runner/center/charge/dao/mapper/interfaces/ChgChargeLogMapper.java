package com.ai.runner.center.charge.dao.mapper.interfaces;

import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargeLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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