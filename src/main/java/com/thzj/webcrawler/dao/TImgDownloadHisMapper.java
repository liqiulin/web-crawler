package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TImgDownloadHis;
import com.thzj.webcrawler.entity.TImgDownloadHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TImgDownloadHisMapper {
    long countByExample(TImgDownloadHisExample example);

    int deleteByExample(TImgDownloadHisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TImgDownloadHis record);

    int insertSelective(TImgDownloadHis record);

    List<TImgDownloadHis> selectByExample(TImgDownloadHisExample example);

    TImgDownloadHis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TImgDownloadHis record, @Param("example") TImgDownloadHisExample example);

    int updateByExample(@Param("record") TImgDownloadHis record, @Param("example") TImgDownloadHisExample example);

    int updateByPrimaryKeySelective(TImgDownloadHis record);

    int updateByPrimaryKey(TImgDownloadHis record);
}