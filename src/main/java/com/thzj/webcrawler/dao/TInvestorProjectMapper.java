package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TInvestorProject;
import com.thzj.webcrawler.entity.TInvestorProjectExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

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