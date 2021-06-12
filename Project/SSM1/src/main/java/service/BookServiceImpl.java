package service;

import beans.Books;
import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Books> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Books getBookById(int id) {
        return bookDao.getBookById(id);
    }

    @Override
    public int addBooks(Books books) {
        return bookDao.addBooks(books);
    }

    @Override
    public int deleteBooksById(int id) {
        return bookDao.deleteBooksById(id);
    }

    @Override
    public int updateBooks(Books books) {
        return bookDao.updateBooks(books);
    }
}
