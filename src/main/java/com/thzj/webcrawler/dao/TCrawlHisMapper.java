package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.entity.TCrawlHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCrawlHisMapper {
    long countByExample(TCrawlHisExample example);

    int deleteByExample(TCrawlHisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCrawlHis record);

    int insertSelective(TCrawlHis record);

    List<TCrawlHis> selectByExample(TCrawlHisExample example);

    TCrawlHis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCrawlHis record, @Param("example") TCrawlHisExample example);

    int updateByExample(@Param("record") TCrawlHis record, @Param("example") TCrawlHisExample example);

    int updateByPrimaryKeySelective(TCrawlHis record);

    int updateByPrimaryKey(TCrawlHis record);
}