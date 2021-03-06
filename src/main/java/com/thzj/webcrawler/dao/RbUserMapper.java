package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.RbUser;
import com.thzj.webcrawler.entity.RbUserExample;
import com.thzj.webcrawler.entity.RbUserWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RbUserMapper {
    long countByExample(RbUserExample example);

    int deleteByExample(RbUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RbUserWithBLOBs record);

    int insertSelective(RbUserWithBLOBs record);

    List<RbUserWithBLOBs> selectByExampleWithBLOBs(RbUserExample example);

    List<RbUser> selectByExample(RbUserExample example);

    RbUserWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RbUserWithBLOBs record, @Param("example") RbUserExample example);

    int updateByExampleWithBLOBs(@Param("record") RbUserWithBLOBs record, @Param("example") RbUserExample example);

    int updateByExample(@Param("record") RbUser record, @Param("example") RbUserExample example);

    int updateByPrimaryKeySelective(RbUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RbUserWithBLOBs record);

    int updateByPrimaryKey(RbUser record);
}