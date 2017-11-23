package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.RbEducationMessage;
import com.thzj.webcrawler.entity.RbEducationMessageExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface RbEducationMessageMapper {
    long countByExample(RbEducationMessageExample example);

    int deleteByExample(RbEducationMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RbEducationMessage record);

    int insertSelective(RbEducationMessage record);

    List<RbEducationMessage> selectByExample(RbEducationMessageExample example);

    RbEducationMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RbEducationMessage record, @Param("example") RbEducationMessageExample example);

    int updateByExample(@Param("record") RbEducationMessage record, @Param("example") RbEducationMessageExample example);

    int updateByPrimaryKeySelective(RbEducationMessage record);

    int updateByPrimaryKey(RbEducationMessage record);
}