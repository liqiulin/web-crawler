package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.Project;
import com.thzj.webcrawler.entity.ProjectExample;
import com.thzj.webcrawler.entity.ProjectWithBLOBs;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface ProjectMapper {
    long countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectWithBLOBs record);

    int insertSelective(ProjectWithBLOBs record);

    List<ProjectWithBLOBs> selectByExampleWithBLOBs(ProjectExample example);

    List<Project> selectByExample(ProjectExample example);

    ProjectWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectWithBLOBs record, @Param("example") ProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectWithBLOBs record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(ProjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProjectWithBLOBs record);

    int updateByPrimaryKey(Project record);
}