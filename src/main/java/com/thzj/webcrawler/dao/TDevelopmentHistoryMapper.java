package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TDevelopmentHistory;
import com.thzj.webcrawler.entity.TDevelopmentHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDevelopmentHistoryMapper {
    long countByExample(TDevelopmentHistoryExample example);

    int deleteByExample(TDevelopmentHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDevelopmentHistory record);

    int insertSelective(TDevelopmentHistory record);

    List<TDevelopmentHistory> selectByExampleWithBLOBs(TDevelopmentHistoryExample example);

    List<TDevelopmentHistory> selectByExample(TDevelopmentHistoryExample example);

    TDevelopmentHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDevelopmentHistory record, @Param("example") TDevelopmentHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") TDevelopmentHistory record, @Param("example") TDevelopmentHistoryExample example);

    int updateByExample(@Param("record") TDevelopmentHistory record, @Param("example") TDevelopmentHistoryExample example);

    int updateByPrimaryKeySelective(TDevelopmentHistory record);

    int updateByPrimaryKeyWithBLOBs(TDevelopmentHistory record);

    int updateByPrimaryKey(TDevelopmentHistory record);
}