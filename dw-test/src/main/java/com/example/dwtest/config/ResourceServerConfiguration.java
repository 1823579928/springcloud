package com.example.dwtest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import java.util.HashMap;

//配置资源服务器
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().httpBasic().disable().exceptionHandling().authenticationEntryPoint((req, resp, exception) -> {
            resp.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            resp.getWriter().write(new ObjectMapper().writeValueAsString(new HashMap() {{
                put("status", 11111);
                put("error", "请携带资源标识符");
            }}));
        })
                .and().authorizeRequests().antMatchers("/oauth").permitAll()
                .and().authorizeRequests().anyRequest().authenticated();
    }
}