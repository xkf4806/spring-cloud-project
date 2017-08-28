package com.springcloud.demo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinj.xue
 * @description：IndexController
 * @date 2017-08-28 11:59
 **/
@RestController
public class IndexController {
    @Value("${foo}") // 注意$的使用
    private String value;

    @GetMapping("/foo")
    public String index() {
        return "from server:" + value;
    }

    @PostMapping(value = "/consume")
    public void consume(@RequestBody String body) {
        System.out.println("new client:" + body);
    }
}
