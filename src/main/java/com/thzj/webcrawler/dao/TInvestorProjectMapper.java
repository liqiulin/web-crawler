package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TInvestorProject;
import com.thzj.webcrawler.entity.TInvestorProjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TInvestorProjectMapper {
    long countByExample(TInvestorProjectExample example);

    int deleteByExample(TInvestorProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TInvestorProject record);

    int insertSelective(TInvestorProject record);

    List<TInvestorProject> selectByExample(TInvestorProjectExample example);

    TInvestorProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TInvestorProject record, @Param("example") TInvestorProjectExample example);

    int updateByExample(@Param("record") TInvestorProject record, @Param("example") TInvestorProjectExample example);

    int updateByPrimaryKeySelective(TInvestorProject record);

    int updateByPrimaryKey(TInvestorProject record);
}