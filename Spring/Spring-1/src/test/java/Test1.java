import beans.User;
import beans.WuHu;
import dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
        WuHu user1 = applicationContext.getBean("qifei", WuHu.class);
        System.out.println(user1);
    }
}
