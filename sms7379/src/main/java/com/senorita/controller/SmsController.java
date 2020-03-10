package com.senorita.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.senorita.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class SmsController {
    @Autowired
    SmsService smsApi;
    @PostMapping("/sms/send")
    @Cacheable(cacheNames = {"verifyCode"},key = "#phoneNumber")
    public String SendVerifyCode(@RequestParam String phoneNumber, @RequestParam String templateCode){
        String verifyCode=null;
        try {
            SendSmsResponse sendSmsResponse = smsApi.sendSms(phoneNumber, templateCode);
            verifyCode=sendSmsResponse.getCode();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return verifyCode;
    }
}
