package com.senorita.test;

import com.senorita.DeptConsumerFeign;
import com.senorita.api.SmsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeptConsumerFeign.class)
public class MStest {
    private static final String REST_URL_PREFIX = "http://DEPT-8001";
    @Autowired
    SmsService smsService;
    @Autowired
    private RestTemplate restTemplate;

//    @Test
//    public void t() {
//        Map map=new HashMap<String,String>();
//        map.put("phoneNumber","18683951862");
//        map.put("templateCode","SMS_173665404");
//        VerifyInfo info=new VerifyInfo("18683951862","SMS_173665404");
//        restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
//    }

}
