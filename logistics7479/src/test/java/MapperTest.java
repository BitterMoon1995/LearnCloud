import com.senorita.Logistics7479;
import com.senorita.dao.OrderInfoMapper;
import com.senorita.model.Dept;
import com.senorita.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Logistics7479.class)
//@SpringBootTest注解要导入主程序的类名，默认导入默认类名，若更改主程序类名，此处也要更改
public class MapperTest {
    @Autowired
    OrderInfoMapper orderInfoMapper;
    @Autowired
    OrderInfoService orderInfoService;
    @Test
    public void t1(){
        System.out.println(orderInfoMapper.selectByPrimaryKey(1L));
    }
    @Test
    public void t2(){
        System.out.println(orderInfoService.getLogisticsInfoByOrderNum("20191013190246125408"));
    }
}
