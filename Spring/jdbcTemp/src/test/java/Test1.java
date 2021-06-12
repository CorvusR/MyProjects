import beans.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    @Test                //增
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId(2);
        book.setName("呼啸山庄");
        service.addBook(book);
    }

    @Test               //删
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook(2);
    }

    @Test                  //改1
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId(1);
        book.setName("红高粱");
        bookService.rewrite(book);
    }

    @Test               //改2
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.rewritePlus("红高粱", "雾都孤儿");
    }

    @Test                //查
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.query(1);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Object[] book1 = {3,"李尔王"};
        Object[] book2 = {4,"哈姆雷特"};
        List<Object[]> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        bookService.batchAdd(books);
    }

}
