package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.InvestorProject;
import com.thzj.webcrawler.entity.InvestorProjectExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface InvestorProjectMapper {
    long countByExample(InvestorProjectExample example);

    int deleteByExample(InvestorProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestorProject record);

    int insertSelective(InvestorProject record);

    List<InvestorProject> selectByExample(InvestorProjectExample example);

    InvestorProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestorProject record, @Param("example") InvestorProjectExample example);

    int updateByExample(@Param("record") InvestorProject record, @Param("example") InvestorProjectExample example);

    int updateByPrimaryKeySelective(InvestorProject record);

    int updateByPrimaryKey(InvestorProject record);
}