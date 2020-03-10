import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.senorita.DeptConsumer80;
import com.senorita.model.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeptConsumer80.class)
//@SpringBootTest注解要导入主程序的类名，默认导入默认类名，若更改主程序类名，此处也要更改
public class MapperTest {
    @Autowired
    RestTemplate restTemplate;
    private static final String REST_URL_PREFIX1 = "http://DEPT-8001";
    private static final String REST_URL_PREFIX2 = "http://SMS-SERVICE";

    @Test
    public void t1(){
        System.out.println(restTemplate.getForObject(REST_URL_PREFIX1+"/dept/list", List.class));
    }
    @Test
    public void t2(){
        Dept dept=new Dept("司马儿");
        System.out.println(restTemplate.postForObject(REST_URL_PREFIX1 + "/dept/add",dept,Boolean.class));
    }

    @Test
    public void t3(){
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
        paramMap.add("phoneNumber", "13778109293");
        paramMap.add("templateCode","SMS_173665404");

        System.out.println(restTemplate.postForObject(REST_URL_PREFIX2+"/sms/send",paramMap,String.class));
    }

}
