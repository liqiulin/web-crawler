package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TImgDownloadHisMapper;
import com.thzj.webcrawler.entity.TImgDownloadHis;
import com.thzj.webcrawler.entity.TImgDownloadHisExample;
import com.thzj.webcrawler.manager.ImgManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@Slf4j
public class ImgManagerImpl implements ImgManager {
    @Resource
    private TImgDownloadHisMapper imgDownloadHisMapper;

    @Value("${img.save.base.path}")
    private String imgSaveBasePath;

    @Value("${img.save.path}")
    private String imgSavePath;

    @Value(("${img.save.switch}"))
    private String imgSaveSwitch;

    /**
     * 图片下载，如果已经下载过则不重复下载，直接返回图片的保存地址
     * @param imgUrl 图片地址
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
        } else {
            return this.downloadAndSaveImg(imgUrl);
        }
    }

    @Override
    public String downloadAndSaveImg(String imgUrl) {
        String suffix = imgUrl.substring(imgUrl.lastIndexOf("."));
        int i = suffix.lastIndexOf('?');
        if (i > -1) {
            suffix = suffix.substring(0, i);
        }
        String fileName = UUID.randomUUID().toString() + suffix;
        String nowDateStr = LocalDate.now().toString();
        String savePath = String.format(imgSavePath, nowDateStr);
        String fullSavePath = this.imgSaveBasePath + savePath;

        if (Objects.equals("1", imgSaveSwitch)) {
            if (downloadImg(fullSavePath, fileName, imgUrl)) {
                // 保存下载记录
                TImgDownloadHis imgDownloadHis = new TImgDownloadHis();
                imgDownloadHis.setCreateTime(new Date());
                imgDownloadHis.setImgUrl(imgUrl);
                imgDownloadHis.setSavePath(savePath + fileName);
                imgDownloadHisMapper.insertSelective(imgDownloadHis);
            }
        }

        return savePath + fileName;
    }

    public static boolean downloadImg(String path, String imgName, String imgUrl) {
        InputStream is = null;
        FileOutputStream out = null;
        try {
            //创建文件目录
            File files = new File(path);
            if (!files.exists()) {
                files.mkdirs();
            }
            URL url = new URL(imgUrl);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            is = connection.getInputStream();
            File file = new File(path  + imgName);
            out = new FileOutputStream(file);
            int i = 0;
            while((i = is.read()) != -1){
                out.write(i);
            }
            out.close();
            is.close();
            return true;
        } catch (Exception e) {
            log.error("downImages error, path[{}], imgName[{}], imgUrl[{}]", path, imgName, imgUrl, e);
            if (Objects.nonNull(is)) {
                try {
                    is.close();
                } catch (IOException e1) {
                    log.warn("close is error", e1);
                }
            }

            if (Objects.nonNull(out)) {
                try {
                    out.close();
                } catch (IOException e1) {
                    log.warn("close out error", e1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());

        String imgUrl = "asdfsdf.asdf.33.png";
        String suffix = imgUrl.substring(imgUrl.lastIndexOf("."));
        String fileName = UUID.randomUUID().toString() + suffix;
        String nowDateStr = LocalDate.now().toString();
        String savePath = new StringBuilder(File.separator)
                .append(nowDateStr)
                .append(File.separator)
                .append(fileName)
                .toString();
        System.out.println(savePath);
    }

}
