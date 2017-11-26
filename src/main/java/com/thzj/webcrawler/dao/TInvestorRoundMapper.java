package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TInvestorRound;
import com.thzj.webcrawler.entity.TInvestorRoundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInvestorRoundMapper {
    long countByExample(TInvestorRoundExample example);

    int deleteByExample(TInvestorRoundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TInvestorRound record);

    int insertSelective(TInvestorRound record);

    List<TInvestorRound> selectByExample(TInvestorRoundExample example);

    TInvestorRound selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TInvestorRound record, @Param("example") TInvestorRoundExample example);

    int updateByExample(@Param("record") TInvestorRound record, @Param("example") TInvestorRoundExample example);

    int updateByPrimaryKeySelective(TInvestorRound record);

    int updateByPrimaryKey(TInvestorRound record);
}