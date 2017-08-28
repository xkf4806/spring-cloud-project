- 这是eureka客户端
- 支持feign+hystrix熔断支持，需要在application.yml中添加
-
feign:
  hystrix:
    enabled: true
    
- 实现feignClient接口的实现类需要添加@Component注解
- 使用方法：在controller层直接@Autowired注入feignClient即可
