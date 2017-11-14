package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.InvestorRound;
import com.thzj.webcrawler.entity.InvestorRoundExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface InvestorRoundMapper {
    long countByExample(InvestorRoundExample example);

    int deleteByExample(InvestorRoundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestorRound record);

    int insertSelective(InvestorRound record);

    List<InvestorRound> selectByExample(InvestorRoundExample example);

    InvestorRound selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestorRound record, @Param("example") InvestorRoundExample example);

    int updateByExample(@Param("record") InvestorRound record, @Param("example") InvestorRoundExample example);

    int updateByPrimaryKeySelective(InvestorRound record);

    int updateByPrimaryKey(InvestorRound record);
}