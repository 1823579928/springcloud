package com.client.feign.util;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
@Component
@Slf4j
public class ThrowableMessage {
    private static Throwable cause;

    public static Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public static Logger getLog() {
        return log;
    }
}
