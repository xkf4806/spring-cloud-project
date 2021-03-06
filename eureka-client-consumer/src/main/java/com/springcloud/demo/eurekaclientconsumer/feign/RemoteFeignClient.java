package com.springcloud.demo.eurekaclientconsumer.feign;

import com.springcloud.demo.eurekaclientconsumer.vo.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "eureka-client",fallback = RemoteFeignClientHystrix.class)
public interface RemoteFeignClient {
    @GetMapping(value = "/foo")
    String info();

//    这里是个坑
//    @PostMapping(value = "/consume",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/consume",method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String consume(Person person);

    @PostMapping(value = "/dealParam")
    String hello(@RequestParam("param") String param, Person person);
}
