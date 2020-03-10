package com.senorita.api;

import com.senorita.model.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "SMS-SERVICE",path = "/sms")

public interface SmsService {
    @PostMapping("/send")
    public String SendVerifyCode(@RequestParam String phoneNumber, @RequestParam String templateCode);
}
