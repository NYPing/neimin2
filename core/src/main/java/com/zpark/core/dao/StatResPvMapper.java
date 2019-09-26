package com.zpark.core.dao;

import com.zpark.core.model.StatResPv;
import com.zpark.core.model.StatResPvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatResPvMapper {
    long countByExample(StatResPvExample example);

    int deleteByExample(StatResPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatResPv record);

    int insertSelective(StatResPv record);

    List<StatResPv> selectByExample(StatResPvExample example);

    StatResPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatResPv record, @Param("example") StatResPvExample example);

    int updateByExample(@Param("record") StatResPv record, @Param("example") StatResPvExample example);

    int updateByPrimaryKeySelective(StatResPv record);

    int updateByPrimaryKey(StatResPv record);
}