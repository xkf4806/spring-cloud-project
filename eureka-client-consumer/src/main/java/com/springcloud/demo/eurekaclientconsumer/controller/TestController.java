package com.springcloud.demo.eurekaclientconsumer.controller;

import com.springcloud.demo.eurekaclientconsumer.feign.RemoteFeignClient;
import com.springcloud.demo.eurekaclientconsumer.vo.Person;
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

    @GetMapping("/test")
    public String invokeMethod() {
        return remoteFeignClient.info();
    }

    @GetMapping("/cons")
    public String consume() {
        Person person = new Person();
        person.setName("刘备");
        person.setAge(27);
        person.setHeight(170);
//        String json = "{\"name\":\"宋江\",\"age\":25,\"height\":170}";
        return remoteFeignClient.consume(person);
    }

    @GetMapping("/deal")
    public String dealParam() {
        Person person = new Person();
        person.setName("王五");
        person.setAge(37);

        String retMsg = remoteFeignClient.info();
        return remoteFeignClient.hello(retMsg,person);
    }
}
