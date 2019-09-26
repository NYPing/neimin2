package com.zpark.core.dao;

import com.zpark.core.model.Res;
import com.zpark.core.model.ResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResMapper {
    long countByExample(ResExample example);

    int deleteByExample(ResExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Res record);

    int insertSelective(Res record);

    List<Res> selectByExample(ResExample example);

    Res selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Res record, @Param("example") ResExample example);

    int updateByExample(@Param("record") Res record, @Param("example") ResExample example);

    int updateByPrimaryKeySelective(Res record);

    int updateByPrimaryKey(Res record);
}