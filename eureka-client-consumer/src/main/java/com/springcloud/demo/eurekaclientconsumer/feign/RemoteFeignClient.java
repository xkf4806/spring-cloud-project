package com.springcloud.demo.eurekaclientconsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client")
public interface RemoteFeignClient {
    @GetMapping(value = "/info")
    String info();
}
