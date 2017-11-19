package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TeamMembers;
import com.thzj.webcrawler.entity.TeamMembersExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface TeamMembersMapper {
    long countByExample(TeamMembersExample example);

    int deleteByExample(TeamMembersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeamMembers record);

    int insertSelective(TeamMembers record);

    List<TeamMembers> selectByExampleWithBLOBs(TeamMembersExample example);

    List<TeamMembers> selectByExample(TeamMembersExample example);

    TeamMembers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeamMembers record, @Param("example") TeamMembersExample example);

    int updateByExampleWithBLOBs(@Param("record") TeamMembers record, @Param("example") TeamMembersExample example);

    int updateByExample(@Param("record") TeamMembers record, @Param("example") TeamMembersExample example);

    int updateByPrimaryKeySelective(TeamMembers record);

    int updateByPrimaryKeyWithBLOBs(TeamMembers record);

    int updateByPrimaryKey(TeamMembers record);
}