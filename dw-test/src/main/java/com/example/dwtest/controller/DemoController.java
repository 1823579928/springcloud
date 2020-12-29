package com.example.dwtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CuiYiXiang
 * @Date 2020/5/9
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/dd")
    public String demo(){
        return "demo_dd";
    }
}
