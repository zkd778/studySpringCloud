package com.example.studyconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient  //指明是服务消费者
//相同点:@EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务。
//不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
@RestController
public class StudyConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyConsumerApplication.class, args);
    }

    @RequestMapping("/o")
    public String hello(){
        return "xiaofeizhe";
    }

}
