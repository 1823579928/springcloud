package com.eureka.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author ZouJie
 * @Date 2020/7/31
 */
@RestController
public class ResourceWeb {

    @GetMapping("/user")
    public Principal user(Principal user) {
        //获取当前用户信息
        return user;
    }
}