package com.senorita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//使本服务启动后自动注册进Eureka服务端
@EnableDiscoveryClient   // 服务发现
@SpringBootApplication(scanBasePackages = {"com.senorita"})
@EnableCaching
public class Sms7379 {

    public static void main(String[] args) {
        SpringApplication.run(Sms7379.class, args);
    }

}
