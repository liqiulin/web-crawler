package com.thzj.webcrawler.manager;

public interface ImgManager {

    /**
     * 图片下载，如果已经下载过则不重复下载，直接返回图片的保存地址
     * @param imgUrl 图片URL
     * @return 图片下载后的保存地址
     */
    String getSavePathByImgPath(String imgUrl);

    String downloadAndSaveImg(String imgUrl);
}
