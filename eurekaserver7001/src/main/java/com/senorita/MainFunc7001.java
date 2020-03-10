package com.senorita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//标记为eureka服务端启动类，使其他微服务可以注册进来
//和@EnableEurekaClient为一对多的对应关系
public class MainFunc7001 {
    public static void main(String[] args) {
        SpringApplication.run(MainFunc7001.class,args);
    }
}
