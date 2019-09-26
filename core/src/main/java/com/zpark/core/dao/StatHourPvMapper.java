package com.zpark.core.dao;

import com.zpark.core.model.StatHourPv;
import com.zpark.core.model.StatHourPvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatHourPvMapper {
    long countByExample(StatHourPvExample example);

    int deleteByExample(StatHourPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatHourPv record);

    int insertSelective(StatHourPv record);

    List<StatHourPv> selectByExample(StatHourPvExample example);

    StatHourPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatHourPv record, @Param("example") StatHourPvExample example);

    int updateByExample(@Param("record") StatHourPv record, @Param("example") StatHourPvExample example);

    int updateByPrimaryKeySelective(StatHourPv record);

    int updateByPrimaryKey(StatHourPv record);
}