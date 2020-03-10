package com.senorita.controller;

import com.senorita.api.DeptInfoService;
import com.senorita.api.SmsService;
import com.senorita.model.Dept;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Dept_Consumer_Controller {
    @Autowired
    DeptInfoService deptInfoService;
    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptInfoService.add(dept);
    }
    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptInfoService.get(id);
    }
    @GetMapping("/consumer/dept/list")
    public List list(){
        return deptInfoService.list();
    }

}
