package com.zpark.core.dao;

import com.zpark.core.model.Sys;
import com.zpark.core.model.SysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMapper {
    long countByExample(SysExample example);

    int deleteByExample(SysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sys record);

    int insertSelective(Sys record);

    List<Sys> selectByExample(SysExample example);

    Sys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sys record, @Param("example") SysExample example);

    int updateByExample(@Param("record") Sys record, @Param("example") SysExample example);

    int updateByPrimaryKeySelective(Sys record);

    int updateByPrimaryKey(Sys record);
}