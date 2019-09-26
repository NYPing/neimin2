package com.zpark.core.dao;

import com.zpark.core.model.StatYearPv;
import com.zpark.core.model.StatYearPvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatYearPvMapper {
    long countByExample(StatYearPvExample example);

    int deleteByExample(StatYearPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatYearPv record);

    int insertSelective(StatYearPv record);

    List<StatYearPv> selectByExample(StatYearPvExample example);

    StatYearPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatYearPv record, @Param("example") StatYearPvExample example);

    int updateByExample(@Param("record") StatYearPv record, @Param("example") StatYearPvExample example);

    int updateByPrimaryKeySelective(StatYearPv record);

    int updateByPrimaryKey(StatYearPv record);
}