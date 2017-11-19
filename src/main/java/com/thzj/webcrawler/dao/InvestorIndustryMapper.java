package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.InvestorIndustry;
import com.thzj.webcrawler.entity.InvestorIndustryExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface InvestorIndustryMapper {
    long countByExample(InvestorIndustryExample example);

    int deleteByExample(InvestorIndustryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestorIndustry record);

    int insertSelective(InvestorIndustry record);

    List<InvestorIndustry> selectByExample(InvestorIndustryExample example);

    InvestorIndustry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestorIndustry record, @Param("example") InvestorIndustryExample example);

    int updateByExample(@Param("record") InvestorIndustry record, @Param("example") InvestorIndustryExample example);

    int updateByPrimaryKeySelective(InvestorIndustry record);

    int updateByPrimaryKey(InvestorIndustry record);
}