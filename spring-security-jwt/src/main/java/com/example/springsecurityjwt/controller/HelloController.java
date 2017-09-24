package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.common.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-09-23 16:39
 **/
@RestController
public class HelloController {
    @GetMapping(value = "/index")
    public ResponseEntity index() {
        return new ResponseEntity(ResponseEntity.SUCCESS, "返回成功", "hello,springboot");
    }
    @GetMapping(value = "/hello")
    public ResponseEntity hello() {
        return new ResponseEntity(ResponseEntity.SUCCESS, "返回成功", "hello");
    }

    @GetMapping(value = "/world")
    public ResponseEntity world() {
        return new ResponseEntity(ResponseEntity.SUCCESS, "返回成功", "world");
    }
}
