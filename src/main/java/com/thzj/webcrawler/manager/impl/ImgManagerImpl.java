package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TImgDownloadHisMapper;
import com.thzj.webcrawler.entity.TImgDownloadHis;
import com.thzj.webcrawler.entity.TImgDownloadHisExample;
import com.thzj.webcrawler.manager.ImgManager;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImgManagerImpl implements ImgManager {
    @Resource
    private TImgDownloadHisMapper imgDownloadHisMapper;


    /**
     * 图片下载，如果已经下载过则不重复下载，直接返回图片的保存地址
     * @param imgPath 图片地址
     * @return 图片下载后的保存地址
     */
    @Override
    public String getSavePathByImgPath(String imgUrl) {
        if (StringUtils.isBlank(imgUrl)) {
            return null;
        }

        TImgDownloadHisExample imgDownloadHisExample = new TImgDownloadHisExample();
        imgDownloadHisExample.createCriteria().andImgUrlEqualTo(imgUrl);
        List<TImgDownloadHis> imgDownloadHisList = imgDownloadHisMapper.selectByExample(imgDownloadHisExample);
        if (!CollectionUtils.isEmpty(imgDownloadHisList)) {
            return imgDownloadHisList.get(0).getSavePath();
        }

        return downloadImg(imgUrl);
    }

    @Override
    public String downloadImg(String imgUrl) {
        // todo
        return imgUrl;
    }
}
