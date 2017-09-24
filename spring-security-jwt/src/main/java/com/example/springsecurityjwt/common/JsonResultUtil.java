package com.example.springsecurityjwt.common;

import org.json.JSONObject;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-09-23 17:59
 **/
public class JsonResultUtil {
    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }
}
