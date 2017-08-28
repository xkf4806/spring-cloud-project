package com.springcloud.demo.eurekaclientconsumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

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
    public String consume(String body) {
        return "服务调用异常！";
    }
}
