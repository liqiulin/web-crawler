package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TInvestor;
import com.thzj.webcrawler.entity.TInvestorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInvestorMapper {
    long countByExample(TInvestorExample example);

    int deleteByExample(TInvestorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TInvestor record);

    int insertSelective(TInvestor record);

    List<TInvestor> selectByExampleWithBLOBs(TInvestorExample example);

    List<TInvestor> selectByExample(TInvestorExample example);

    TInvestor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TInvestor record, @Param("example") TInvestorExample example);

    int updateByExampleWithBLOBs(@Param("record") TInvestor record, @Param("example") TInvestorExample example);

    int updateByExample(@Param("record") TInvestor record, @Param("example") TInvestorExample example);

    int updateByPrimaryKeySelective(TInvestor record);

    int updateByPrimaryKeyWithBLOBs(TInvestor record);

    int updateByPrimaryKey(TInvestor record);
}