package com.senorita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@EnableEurekaClient
@SpringBootApplication()
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class,args);
    }
}
/* Ribbon流程：
1.POM文件，增加Ribbon依赖：spring-cloud-starter-netflix-ribbon
2.RestTemplate的配置类，增加@LoadBalanced注解
3.主启动类增加@EnableEurekaClient注解
4.修改RestTemplate的访问前缀为微服务的服务名1
 */