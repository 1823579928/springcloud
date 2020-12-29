package com.client.feign.controller;

import com.client.feign.api.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Autowired
    UserRemoteClient remoteClient;

    @GetMapping("hello")
    public String hello(){
        return remoteClient.hello();
    }
}
