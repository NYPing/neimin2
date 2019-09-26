package com.zpark.core.dao;

import com.zpark.core.model.StatChannelPv;
import com.zpark.core.model.StatChannelPvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatChannelPvMapper {
    long countByExample(StatChannelPvExample example);

    int deleteByExample(StatChannelPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatChannelPv record);

    int insertSelective(StatChannelPv record);

    List<StatChannelPv> selectByExample(StatChannelPvExample example);

    StatChannelPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatChannelPv record, @Param("example") StatChannelPvExample example);

    int updateByExample(@Param("record") StatChannelPv record, @Param("example") StatChannelPvExample example);

    int updateByPrimaryKeySelective(StatChannelPv record);

    int updateByPrimaryKey(StatChannelPv record);
}