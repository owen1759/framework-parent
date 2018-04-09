package com.jxy.framework.core.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionHandlerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler
    public String handleException(Exception e) {
        switch (e.getClass().getCanonicalName()) {
        case "java.lang.IllegalStateException":
            logger.debug("{}",
                    "org.springframework.web.method.annotation.AbstractNamedValueMethodArgumentResolver.handleNullValue(String, Object, Class<?>)",
                    e);
            break;
        default:
            logger.debug("捕获到异常[{}]发生", e.getClass(), e);
            break;
        }
        return "exception";
    }

}