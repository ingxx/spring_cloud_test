package top.ingxx.provider.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "provider sayHello" + port;
    }
}
