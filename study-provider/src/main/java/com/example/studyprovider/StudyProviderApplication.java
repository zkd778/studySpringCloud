package com.example.studyprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient     //表明自己是服务生产者
@RestController        //获取返回值
public class StudyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyProviderApplication.class, args);


    }
    @RequestMapping("/h")
    public String hello(){
        return "lalalalalalal";
    }

}
