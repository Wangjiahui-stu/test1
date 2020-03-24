import com.aistar.pojo.Product;
import com.aistar.service.ProductService;
import com.aistar.util.ServerResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMyBatis {
    BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
    ProductService service = (ProductService) factory.getBean("productServiceImpl");
    @Test
    public void getById(){

    }

    @Test
    public void delete(){


    }

    @Test
    public void getAllByPage(){
    ServerResponse serverResponse = service.getAllByPage(2);
        System.out.println(serverResponse);
    }
}
