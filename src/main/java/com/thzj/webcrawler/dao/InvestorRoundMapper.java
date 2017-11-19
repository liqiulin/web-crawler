package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.InvestorRound;
import com.thzj.webcrawler.entity.InvestorRoundExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

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