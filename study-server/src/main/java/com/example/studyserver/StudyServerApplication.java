package com.example.studyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    //表明自己是服务注册中心
public class StudyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyServerApplication.class, args);
    }

}
