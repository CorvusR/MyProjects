import dao.TeacherDao;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TeacherService;

public class Test1 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.printTeacher();
        teacherService.printStudent();
    }
}
