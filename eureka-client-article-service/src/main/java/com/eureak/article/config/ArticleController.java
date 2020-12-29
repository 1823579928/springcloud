package com.eureak.article.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("callHello")
    public String callHello(){
        return restTemplate.getForObject("http://localhost:8081/user/hello",String.class);
    }
}
