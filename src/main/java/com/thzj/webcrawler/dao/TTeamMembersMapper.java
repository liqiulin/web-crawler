package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TTeamMembers;
import com.thzj.webcrawler.entity.TTeamMembersExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface TTeamMembersMapper {
    long countByExample(TTeamMembersExample example);

    int deleteByExample(TTeamMembersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeamMembers record);

    int insertSelective(TTeamMembers record);

    List<TTeamMembers> selectByExampleWithBLOBs(TTeamMembersExample example);

    List<TTeamMembers> selectByExample(TTeamMembersExample example);

    TTeamMembers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeamMembers record, @Param("example") TTeamMembersExample example);

    int updateByExampleWithBLOBs(@Param("record") TTeamMembers record, @Param("example") TTeamMembersExample example);

    int updateByExample(@Param("record") TTeamMembers record, @Param("example") TTeamMembersExample example);

    int updateByPrimaryKeySelective(TTeamMembers record);

    int updateByPrimaryKeyWithBLOBs(TTeamMembers record);

    int updateByPrimaryKey(TTeamMembers record);
}