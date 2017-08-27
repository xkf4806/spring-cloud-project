package com.springcloud.demo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @description 注入配置信息
 * @author xinj.xue on 2017/08/27 19:59:14
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${foo}")
    String foo;

    @GetMapping("/profile")
    public String info() {
        return foo;
    }
}
