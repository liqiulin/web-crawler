package com.thzj.webcrawler.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@Aspect
public class LogAspect {
    public void init() {
    }

    @Around("execution(* com.thzj.webcrawler.manager.ImgManager.getSavePathByImgPath(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        String className = point.getTarget().getClass().getSimpleName();
        String methodName = point.getSignature().getName();
        log.debug("==== Received start [methodName:{}]. params: {}.", className + "." + methodName,
                Arrays.toString(point.getArgs()));
        Object result = null;
        long startTime = System.currentTimeMillis();

        try {
            return result = point.proceed();
        } finally {
            log.debug("==== Received end [methodName:{}]. params: {}. result: {}. time: {}.",
                    className + "." + methodName,
                    Arrays.toString(point.getArgs()),
                    result,
                    (System.currentTimeMillis() - startTime));
        }
    }

}
