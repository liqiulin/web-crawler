package com.thzj.webcrawler.util;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.List;

/**
 * @author Matthew
 */
@Slf4j
public class FileUtil {

    /**
     * 写内容到到文件尾部
     * @param path 写入路径
     * @param fileName 写入文件名
     * @param content 写入内容
     */
    public static void appendToFile(String path, String fileName, String content) {
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
            OutputStreamWriter writer = new OutputStreamWriter(fop, Charsets.UTF_8);

            writer.append(content);

            //刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
            writer.close();
            //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
            fop.close();

        } catch (IOException e) {
            log.error("appendToFile failure! path:[{}], fileName[{}], content[{}]", file, fileName, content, e);
        }
    }

    /**
     * 将文件内容按行读取返回
     * @param path
     * @param fileName
     * @return
     */
    public static List<String> readLines(String path, String fileName) {
        File f = new File(path);

        // 创建文件
        File file = new File(f, fileName);
        try {
            return Files.readLines(file, Charsets.UTF_8);
        } catch (IOException e) {
            log.error("appendToFile failure! file[{}]", file, e);
        }
        return Lists.newArrayList();
    }
}
