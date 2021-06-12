package service;

import beans.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Books> getAllBooks();

    Books getBookById(int id);

    int addBooks(Books books);

    int deleteBooksById(int id);

    int updateBooks(Books books);

}
