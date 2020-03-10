package com.senorita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@SpringBootApplication()
@EnableFeignClients(basePackages = {"com.senorita.api"})
public class DeptConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign.class,args);
    }
}
/*Feign流程：
公共Api：
1.api模块，加feign依赖(注意SB1和2的不同)，主函数，加@EnableFeignClients(basePackages = {"com.senorita.api"})，
最后把目标服务提供者的Controller抽象出来，为公共的Service接口
2.给该接口添加@FeignClient，接口属性value为微服务名！(就这一出)，请求路径为提供者路径，path方便多方法路径简写
消费者：
3.POM文件，增加Feign依赖：spring-cloud-starter-feign(Feign本身包含Ribbon)
调用：
4.编写服务消费者的Controller，先注入Service接口，然后请求映射按照消费者的映射风格写
5.而每个方法的具体实现，却调用Service接口的方法
6.消费者主函数添加@EnableFeignClient注解，basePackages扫描公共Api接口，必须有
 */