package top.ingxx.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ingxx.feign.api.FeignApi;

@RestController
public class FeignController {

    @Autowired  //因为是由feign自动生成实现所以这里会报错
    private FeignApi feignApi;

    @GetMapping("/FeignSayHello")
    public String FeignSayHello(){
        return feignApi.sayHello();
    } //调用sayhello方法

}
