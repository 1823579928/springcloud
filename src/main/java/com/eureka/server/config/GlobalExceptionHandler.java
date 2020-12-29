package com.eureka.server.config;

import com.eureka.server.util.ResponseData;
import com.eureka.server.util.ResultEnums;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 * @author ZouJie
 * @Date 2020/7/30
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ResponseData r = new ResponseData();
        r.setMsg(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            r.setCode(ResultEnums.PAGEANT.getCode());
            r.setData(ResultEnums.PAGEANT.getMsg());
        } else {
            r.setCode(ResultEnums.SYSTEM_ERROR.getCode());
            r.setData(ResultEnums.SYSTEM_ERROR.getMsg());
        }
        return r;
    }
}
