package com.client.feign.api.fallback;

import com.client.feign.api.UserRemoteClient;
import com.client.feign.util.ThrowableMessage;
import org.springframework.stereotype.Component;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
@Component
public class UserRemoteClientFallback extends ThrowableMessage implements UserRemoteClient {
    @Override
    public String hello() {
        return "出现异常："+getCause();
    }
}
