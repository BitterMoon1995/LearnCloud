package com.senorita.api;

import com.senorita.model.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@FeignClient(value = "DEPT-8001",path = "/dept")
public interface DeptInfoService {
    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept);
    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id);
    @GetMapping("/list")
    public List<Dept> list();
}
