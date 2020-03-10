import com.senorita.DeptProvider8001;
import com.senorita.dao.DeptDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeptProvider8001.class)
//@SpringBootTest注解要导入主程序的类名，默认导入默认类名，若更改主程序类名，此处也要更改
public class MapperTest {
    @Autowired
    DeptDao deptDao;
    @Test
    public void t(){
        System.out.println(deptDao.findAll());
    }
    @Test
    public void t1(){
        System.out.println("hello");
    }
}
