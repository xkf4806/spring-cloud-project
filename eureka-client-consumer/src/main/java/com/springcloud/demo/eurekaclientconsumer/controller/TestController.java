package com.springcloud.demo.eurekaclientconsumer.controller;

import com.springcloud.demo.eurekaclientconsumer.feign.RemoteFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinj.xue
 * @description：测试controller
 * @date 2017-08-28 11:52
 **/
@RestController
public class TestController {
    @Autowired
    public RemoteFeignClient remoteFeignClient;

    @GetMapping("/info")
    public String invokeMethod() {
        remoteFeignClient.info("foo");
        return null;
    }
}
