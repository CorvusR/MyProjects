package dao;

import beans.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    void add(Book book);
    void delete(int id);
    void rewrite(Book book);
    void rewritePlus(String name_before,String name_after);
    List<Book> query(int id);
    void batchAdd(List<Object[]> books);
}
