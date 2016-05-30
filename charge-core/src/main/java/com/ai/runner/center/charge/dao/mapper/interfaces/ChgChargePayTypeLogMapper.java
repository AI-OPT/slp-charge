package com.ai.runner.center.charge.dao.mapper.interfaces;

import com.ai.runner.center.charge.dao.mapper.bo.ChgChargePayTypeLog;
import com.ai.runner.center.charge.dao.mapper.bo.ChgChargePayTypeLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChgChargePayTypeLogMapper {
    int countByExample(ChgChargePayTypeLogCriteria example);

    int deleteByExample(ChgChargePayTypeLogCriteria example);

    int deleteByPrimaryKey(Long payTypeId);

    int insert(ChgChargePayTypeLog record);

    int insertSelective(ChgChargePayTypeLog record);

    List<ChgChargePayTypeLog> selectByExample(ChgChargePayTypeLogCriteria example);

    ChgChargePayTypeLog selectByPrimaryKey(Long payTypeId);

    int updateByExampleSelective(@Param("record") ChgChargePayTypeLog record, @Param("example") ChgChargePayTypeLogCriteria example);

    int updateByExample(@Param("record") ChgChargePayTypeLog record, @Param("example") ChgChargePayTypeLogCriteria example);

    int updateByPrimaryKeySelective(ChgChargePayTypeLog record);

    int updateByPrimaryKey(ChgChargePayTypeLog record);
}