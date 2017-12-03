package com.thzj.webcrawler.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Matthew
 */
@Slf4j
public class FileUtil {

    /**
     *
     */
    public static void saveResultToFile(String fileName, String result) {
        //path表示你所创建文件的路径
        String path = "/Users/liangk/Documents/ex-work/data";
        File f = new File(path);
        if (!f.exists()) {
            f.mkdirs();
        }

        // 创建文件
        File file = new File(f, fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fop = new FileOutputStream(file);
            // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

            writer.append(result);

            // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
            writer.close();
            //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
            fop.close();

        } catch (IOException e) {
            e.printStackTrace();
            log.warn("saveResultTOFile failure! file:[{}], fileName[{}], result[{}]", file, fileName, result, e);
        }



    }
}
