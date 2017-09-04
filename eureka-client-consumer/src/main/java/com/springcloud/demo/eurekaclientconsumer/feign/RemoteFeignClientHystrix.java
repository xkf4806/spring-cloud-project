package com.springcloud.demo.eurekaclientconsumer.feign;

import com.springcloud.demo.eurekaclientconsumer.vo.Person;
import org.springframework.stereotype.Component;

/**
 * @author xinj.xue
 * @description：熔断器处理类
 * @date 2017-08-28 15:57
 **/
@Component
public class RemoteFeignClientHystrix implements RemoteFeignClient {
    @Override
    public String info() {
        return "info方法调用失败";
    }

    @Override
    public String consume(Person person) {
        return "服务调用异常！";
    }

    @Override
    public String hello(String param, Person person) {
        return "参数请求异常！";
    }
}
