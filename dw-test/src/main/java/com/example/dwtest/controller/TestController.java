package com.example.dwtest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

/**
 * @author CuiYiXiang
 * @Date 2020/5/8
 */
@RestController
@Controller
@RequestMapping("/user")
public class TestController {
    @GetMapping("/test")
    @PreAuthorize("hasAuthority('SystemContent')")
    public String test(){
        return "接收到请求！";
    }
}
