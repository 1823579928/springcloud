/*
package com.example.dwtest.config;


import com.alibaba.fastjson.JSONObject;
import com.example.dwtest.dto.ResponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

*/
/**
 * @author ZouJie
 * @Date 2020/7/24
 *//*

@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Resource
    private ObjectMapper mapper;

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        AuthenticationException e) throws IOException {
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        ResponseResult restResponse = new ResponseResult();
        if (e instanceof AccessDeniedHandler) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), "登录成功")));
        } else if (e instanceof AuthenticationEntryPoint) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "登录过期或未登录")));
        } else if (e instanceof AccountExpiredException) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "账户已过期")));
        } else if (e instanceof BadCredentialsException) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "用户名或密码错误")));
        } else if (e instanceof DisabledException) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "账户已禁用")));
        } else if (e instanceof CredentialsExpiredException) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "证书已过期")));
        } else if (e instanceof LockedException) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "用户账户已被锁定")));
        } else if (e instanceof InternalAuthenticationServiceException) {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString(), "内部身份验证服务异常")));
        } else {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(new ResponseResult(Integer.valueOf(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.toString())));
        }

    }
}
*/
