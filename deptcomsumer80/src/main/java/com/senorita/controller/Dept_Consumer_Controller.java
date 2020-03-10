package com.senorita.controller;

import com.senorita.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Dept_Consumer_Controller {
    //    把服务提供者提供的HTTP接口，硬编码进来。
    //    如果提供者的端口信息发生改变，这边也要改，耦合度很大。
    //    而且如果要用到多个提供者，就要维护多个提供者的完整端口信息
    //    最后，这种硬编码很明显不能实现负载均衡
    //    ☟
    //    private static final String REST_URL_PREFIX = "http://localhost:8001";

    private static final String REST_URL_PREFIX = "http://DEPT-8001";


    /**
     *  使用 restTemplate 访问restful接口非常的简单无脑粗暴
     *  (url,requestMap.ResponseBean.class)
     */
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    //SC提供的获取所有服务提供者元数据信息的工具类
    //通过调用getInstances拿到指定的集群
    //再通过索引拿到需要的实例，可以获取它的地址、端口号，拼接一下发过去.........（图一乐）
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "consumer/dept/{id}")
    public Dept get(@PathVariable("id") Long id){

        List<ServiceInstance> instances = discoveryClient.getInstances("DEPT-8001");//图一乐
        for (ServiceInstance instance:instances
             ) {
            System.out.println(instance.getInstanceId());
            System.out.println(instance.getHost());
            System.out.println(instance.getPort());
        }
        ServiceInstance instance = instances.get(0);
        return restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping(value = "consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery",Object.class);
    }

}
