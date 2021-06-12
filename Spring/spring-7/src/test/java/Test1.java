import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BankService;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BankService bankService = context.getBean("bankService", BankService.class);
        bankService.exchange(300);
    }

    @Test
    public void resultTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BankService bankService = context.getBean("bankService", BankService.class);
        bankService.query();
    }
}
