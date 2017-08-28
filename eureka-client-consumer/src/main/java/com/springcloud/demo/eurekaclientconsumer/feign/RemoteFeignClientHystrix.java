package com.springcloud.demo.eurekaclientconsumer.feign;

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
    public void consume(String body) {

    }
}
