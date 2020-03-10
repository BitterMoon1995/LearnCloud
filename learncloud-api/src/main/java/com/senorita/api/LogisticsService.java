package com.senorita.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@FeignClient(value = "LOGISTICS-SERVICE",path = "/logistics")
public interface LogisticsService {
    @GetMapping("/info/{orderNum}")
    public String getInfo(@PathVariable("orderNum")String orderNum);
}
