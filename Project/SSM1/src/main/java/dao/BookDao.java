package dao;

import beans.Books;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    List<Books> getAllBooks();

    Books getBookById(int id);

    int addBooks(Books books);

    int deleteBooksById(int id);

    int updateBooks(Books books);

}
