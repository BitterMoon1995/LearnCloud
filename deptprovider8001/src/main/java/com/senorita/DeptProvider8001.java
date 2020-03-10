package com.senorita;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//使本服务启动后自动注册进Eureka服务端
@MapperScan("com.senorita.dao")
//@EnableDiscoveryClient   包含了@EnableEurekaClient，作用相同。在新版SC，两个都可以不写
@SpringBootApplication
public class DeptProvider8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001.class, args);
    }

}
