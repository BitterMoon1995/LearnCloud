package com.senorita.controller;

import com.senorita.model.Dept;
import com.senorita.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private DeptService deptService;
    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept){
//        @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
        return deptService.addDept(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
//        @PathVariable是spring3.0的一个新功能：接收请求路径中占位符的值
        return deptService.findById(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }
}
