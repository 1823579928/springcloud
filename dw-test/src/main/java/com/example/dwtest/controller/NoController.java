package com.example.dwtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CuiYiXiang
 * @Date 2020/5/9
 */
@RestController
@RequestMapping("/no")
public class NoController {
    @GetMapping("/no")
    public String noAccess(){
        return "不该访问到";
    }
}
