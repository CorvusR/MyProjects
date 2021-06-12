
import beans.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;

public class Test1 {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.test();
    }
}
