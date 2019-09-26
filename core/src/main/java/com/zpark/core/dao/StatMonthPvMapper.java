package com.zpark.core.dao;

import com.zpark.core.model.StatMonthPv;
import com.zpark.core.model.StatMonthPvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatMonthPvMapper {
    long countByExample(StatMonthPvExample example);

    int deleteByExample(StatMonthPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatMonthPv record);

    int insertSelective(StatMonthPv record);

    List<StatMonthPv> selectByExample(StatMonthPvExample example);

    StatMonthPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatMonthPv record, @Param("example") StatMonthPvExample example);

    int updateByExample(@Param("record") StatMonthPv record, @Param("example") StatMonthPvExample example);

    int updateByPrimaryKeySelective(StatMonthPv record);

    int updateByPrimaryKey(StatMonthPv record);
}