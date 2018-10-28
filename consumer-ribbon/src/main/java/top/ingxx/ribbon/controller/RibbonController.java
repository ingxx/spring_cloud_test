package top.ingxx.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired //注入一个resttemplate
    private RestTemplate restTemplate;

    @GetMapping("/ribbonSayHello")
    public String ribbonSayHello(){
        //这里是生产者的服务名
        return restTemplate.getForObject("http://eureka-provider/sayHello?name=1",String.class);
    }
}
