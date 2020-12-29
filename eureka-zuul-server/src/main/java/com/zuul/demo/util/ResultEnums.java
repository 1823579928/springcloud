package com.zuul.demo.util;

/**
 * @author ZouJie
 * @Date 2020/7/30
 */
public enum  ResultEnums {
    SUCCESS("2000", "请求成功"),
    ERROR("1111", "请求失败"),
    PAGEANT("404", "页面找不到"),
    SYSTEM_ERROR("1000", "系统异常"),
    BUSSINESS_ERROR("2001", "业务逻辑错误"),
    VERIFY_CODE_ERROR("2002", "业务参数错误"),
    PARAM_ERROR("2002", "业务参数错误");

    private String code;
    private String msg;

    ResultEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
