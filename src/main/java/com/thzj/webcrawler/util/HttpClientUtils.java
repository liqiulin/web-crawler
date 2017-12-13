package com.thzj.webcrawler.util;

import com.google.common.collect.Maps;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.thzj.webcrawler.exception.GrabResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Map;

import static com.thzj.webcrawler.util.BaseUtil.sleep;


@Slf4j
public class HttpClientUtils {

    public static String OkHttpClient(String url) throws IOException{
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .header("host", "www.vc.cn")
                .addHeader("Connection", "close")
                .addHeader("Pragma", "no-cache")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")
                .addHeader("Accept", "*/*;q=0.5, text/javascript, application/javascript, application/ecmascript, application/x-ecmascript")
                .build();
        Response response = null;
        String result = "";
        try {
            response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                if (response.code() == 429) {
                    log.warn("OkHttpClient failed! url[{}], response[{}]", url , response);
                    int sleepTime = 10000;
                    log.info("retry after[{}]ms", sleepTime);
                    sleep(sleepTime);
                    return OkHttpClient(url);
                }
                if (response.code() == 404) {
                    throw new GrabResourceNotFoundException("404 error. ", new IOException());
                }
            }
            result = response.body().string();
            result = BaseUtil.splitter(result, '\n').get(0).substring(15);
            result = result.replaceAll("\\\\", "");
            return result;
        } catch (Exception e) {
            log.warn("OkHttpClient failed with Exception!", e);
            e.printStackTrace();
        } finally {
            if (response != null) {
                try{
                    response.body().close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            }
        }
     return result;
    }

    public static final void main(String[] args) {
        String url = "https://www.vc.cn/institutions/1656/invest_cases";
        Map<String, Object> headers = Maps.newConcurrentMap();


        headers.put("host", "www.vc.cn");
        headers.put("Connection", "keep-alive");
        headers.put("Pragma", "no-cache");
        headers.put("Cache-Control", "no-cache");
        headers.put("Accept", "*/*;q=0.5, text/javascript, application/javascript, application/ecmascript, application/x-ecmascript");
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36");

        try {
            char pattern = '\n';
            String result = BaseUtil.splitter(OkHttpClient(url), pattern).get(0).substring(15);
            if (result.equals("Retry later")) {
                Thread.sleep(500000);
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
