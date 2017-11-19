package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.Investor;
import com.thzj.webcrawler.entity.InvestorExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface InvestorMapper {
    long countByExample(InvestorExample example);

    int deleteByExample(InvestorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Investor record);

    int insertSelective(Investor record);

    List<Investor> selectByExampleWithBLOBs(InvestorExample example);

    List<Investor> selectByExample(InvestorExample example);

    Investor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Investor record, @Param("example") InvestorExample example);

    int updateByExampleWithBLOBs(@Param("record") Investor record, @Param("example") InvestorExample example);

    int updateByExample(@Param("record") Investor record, @Param("example") InvestorExample example);

    int updateByPrimaryKeySelective(Investor record);

    int updateByPrimaryKeyWithBLOBs(Investor record);

    int updateByPrimaryKey(Investor record);
}