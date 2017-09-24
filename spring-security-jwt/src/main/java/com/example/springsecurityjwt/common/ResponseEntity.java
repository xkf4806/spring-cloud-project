package com.example.springsecurityjwt.common;

import java.io.Serializable;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-09-23 16:53
 **/
public class ResponseEntity<T> implements Serializable {
    public static final String SUCCESS = "000";
    public static final String FAIL = "001";
    public static final String NOT_LOGIN = "002";
    public static final String UNAUTHORIZED = "003";

    private String code;
    private String msg;
    private T data;

    public ResponseEntity() {
    }

    public ResponseEntity(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
