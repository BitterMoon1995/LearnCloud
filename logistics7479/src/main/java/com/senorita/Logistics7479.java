package com.senorita;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//使本服务启动后自动注册进Eureka服务端
@MapperScan("com.senorita.dao")
@EnableDiscoveryClient   // 服务发现
@SpringBootApplication
@EnableCaching
public class Logistics7479 {

    public static void main(String[] args) {
        SpringApplication.run(Logistics7479.class, args);
    }

}
