package com.springcloud.demo.eurekaclientconsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "eureka-client",fallback = RemoteFeignClientHystrix.class)
public interface RemoteFeignClient {
    @GetMapping(value = "/foo")
    String info();
    
    @PostMapping(value = "/consume")
    void consume(String body);
}
