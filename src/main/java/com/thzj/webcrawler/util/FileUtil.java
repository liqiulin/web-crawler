package com.thzj.webcrawler.util;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.List;
import java.util.Objects;

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
        String fullFileName = path.concat(fileName);
        FileWriter writer = null;
        // 创建文件
        File file = new File(f, fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            //OutputStreamWriter writer = new OutputStreamWriter(fop, Charsets.UTF_8);
            writer = new FileWriter(fullFileName, true);
            writer.write(content);

        } catch (Exception e) {
            log.error("appendToFile failure! path:[{}], fileName[{}], content[{}]", file, fileName, content, e);
        } finally {
            if (Objects.nonNull(writer)) {
                try {
                    writer.close();
                } catch (Exception e1) {
                    log.error("", e1);
                }
            }
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
            List<String> lines = Files.readLines(file, Charsets.UTF_8);
            return lines;
        } catch (IOException e) {
            log.error("appendToFile failure! path:[{}], fileName[{}]", file, fileName, e);
        }
        return Lists.newArrayList();
    }
}
