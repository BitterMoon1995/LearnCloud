package com.senorita.controller;

import com.senorita.api.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Logistics_Consumer_Controller {
    @Autowired
    LogisticsService logisticsService;
    @GetMapping("/getInfo/{orderNum}")
    public String getInfo(@PathVariable("orderNum")String orderNum){
        return logisticsService.getInfo(orderNum);
    }

}
