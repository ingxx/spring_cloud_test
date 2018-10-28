package top.ingxx.provider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHello")
    public String sayHello(String name){
        return "provider sayHello port:" + port + "  hello" + name;
    }
}
