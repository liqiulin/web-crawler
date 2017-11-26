package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TInvestorIndustry;
import com.thzj.webcrawler.entity.TInvestorIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInvestorIndustryMapper {
    long countByExample(TInvestorIndustryExample example);

    int deleteByExample(TInvestorIndustryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TInvestorIndustry record);

    int insertSelective(TInvestorIndustry record);

    List<TInvestorIndustry> selectByExample(TInvestorIndustryExample example);

    TInvestorIndustry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TInvestorIndustry record, @Param("example") TInvestorIndustryExample example);

    int updateByExample(@Param("record") TInvestorIndustry record, @Param("example") TInvestorIndustryExample example);

    int updateByPrimaryKeySelective(TInvestorIndustry record);

    int updateByPrimaryKey(TInvestorIndustry record);
}