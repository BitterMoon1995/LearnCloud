package com.senorita.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {
    /**
     * RestTemplate 提供了多种便捷访问远程http服务的方法
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问REST服务的客户端模板工具集
     * @return
     */
    @Bean
    @LoadBalanced    // Spring cloud Ribbon 是基于Netflix Ribbon 实现的一套客户端， 负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
