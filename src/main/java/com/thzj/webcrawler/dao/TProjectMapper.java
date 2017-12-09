package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TProject;
import com.thzj.webcrawler.entity.TProjectExample;
import com.thzj.webcrawler.entity.TProjectWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TProjectMapper {
    long countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProjectWithBLOBs record);

    int insertSelective(TProjectWithBLOBs record);

    List<TProjectWithBLOBs> selectByExampleWithBLOBs(TProjectExample example);

    List<TProject> selectByExample(TProjectExample example);

    TProjectWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProjectWithBLOBs record, @Param("example") TProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") TProjectWithBLOBs record, @Param("example") TProjectExample example);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByPrimaryKeySelective(TProjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TProjectWithBLOBs record);

    int updateByPrimaryKey(TProject record);
}