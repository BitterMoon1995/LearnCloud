package com.senorita.controller;

import com.senorita.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogisticsInfoController {
    @Autowired
    OrderInfoService orderInfoService;
    @GetMapping("/logistics/info/{orderNum}")
    @Cacheable(cacheNames = {"logisticsInfo"},key = "#orderNum")

    public String getLogisticsInfo( @PathVariable("orderNum")String orderNum){
        return orderInfoService.getLogisticsInfoByOrderNum(orderNum);
    }
}
