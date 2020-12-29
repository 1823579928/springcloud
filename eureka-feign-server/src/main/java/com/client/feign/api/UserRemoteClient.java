package com.client.feign.api;


import com.client.feign.api.factory.UserRemoteClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
@FeignClient(value = "eureka-client-user",fallbackFactory = UserRemoteClientFactory.class)
public interface UserRemoteClient {

    @GetMapping("/user/hello")
    String hello();
}
