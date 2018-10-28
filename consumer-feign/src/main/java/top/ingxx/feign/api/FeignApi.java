package top.ingxx.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-provider")  //生产者应用名称
public interface FeignApi {

    @GetMapping("/sayHello?name=feign") //调用的接口
    public String sayHello();

}
