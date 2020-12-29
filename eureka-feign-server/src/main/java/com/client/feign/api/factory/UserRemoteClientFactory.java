package com.client.feign.api.factory;

import com.client.feign.api.UserRemoteClient;
import com.client.feign.api.fallback.UserRemoteClientFallback;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
@Component
public class UserRemoteClientFactory implements FallbackFactory<UserRemoteClient> {
    @Override
    public UserRemoteClient create(Throwable throwable) {
        UserRemoteClientFallback fallback = new UserRemoteClientFallback();
        fallback.setCause(throwable);
        return fallback;
    }
}
