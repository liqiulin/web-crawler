package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.UnitMessage;
import com.thzj.webcrawler.entity.UnitMessageExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface UnitMessageMapper {
    long countByExample(UnitMessageExample example);

    int deleteByExample(UnitMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UnitMessage record);

    int insertSelective(UnitMessage record);

    List<UnitMessage> selectByExample(UnitMessageExample example);

    UnitMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UnitMessage record, @Param("example") UnitMessageExample example);

    int updateByExample(@Param("record") UnitMessage record, @Param("example") UnitMessageExample example);

    int updateByPrimaryKeySelective(UnitMessage record);

    int updateByPrimaryKey(UnitMessage record);
}