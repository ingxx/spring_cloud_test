package top.ingxx.ribbon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient //开启eureka
public class ConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonApplication.class,args);
    }

    @Bean //注册一个resttemplate用于调用
    @LoadBalanced //开启客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
