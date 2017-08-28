package com.springcloud.demo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinj.xue
 * @description：IndexController
 * @date 2017-08-28 11:59
 **/
@RestController
public class IndexController {
    @Value("foo")
    private String key;

    @GetMapping("/info")
    public String index() {
        return "from server:" + key;
    }
}
