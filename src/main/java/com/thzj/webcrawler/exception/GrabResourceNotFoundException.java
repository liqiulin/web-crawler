package com.thzj.webcrawler.exception;

/**
 * 抓取资源不存在异常
 */
public class GrabResourceNotFoundException extends RuntimeException {

    public GrabResourceNotFoundException() {
        super();
    }

    public GrabResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
