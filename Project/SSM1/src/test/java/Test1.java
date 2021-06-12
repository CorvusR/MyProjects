import beans.Books;
import dao.BookDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.BookServiceImpl;
import utils.MybatisUtil;

import java.util.List;

public class Test1 {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bean = context.getBean(BookService.class);
        List<Books> allBooks1 = bean.getAllBooks();
        for (Books books : allBooks1) {
            System.out.println(books);
        }
    }
}
