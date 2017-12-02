package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.RbUnitMessage;
import com.thzj.webcrawler.entity.RbUnitMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RbUnitMessageMapper {
    long countByExample(RbUnitMessageExample example);

    int deleteByExample(RbUnitMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RbUnitMessage record);

    int insertSelective(RbUnitMessage record);

    List<RbUnitMessage> selectByExample(RbUnitMessageExample example);

    RbUnitMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RbUnitMessage record, @Param("example") RbUnitMessageExample example);

    int updateByExample(@Param("record") RbUnitMessage record, @Param("example") RbUnitMessageExample example);

    int updateByPrimaryKeySelective(RbUnitMessage record);

    int updateByPrimaryKey(RbUnitMessage record);
}