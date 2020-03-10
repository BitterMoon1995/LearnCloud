package com.senorita.controller;

import com.senorita.api.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sms_Consumer_Controller {
    @Autowired
    SmsService smsService;

    @PostMapping("/send")
    public String SendVerifyCode(@RequestParam String phoneNumber, @RequestParam String templateCode) {
        templateCode="SMS-173665402";
        return smsService.SendVerifyCode(phoneNumber,templateCode);
    }
}
