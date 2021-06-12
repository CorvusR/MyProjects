package service;

import beans.Book;
import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void deleteBook(int id) {
        bookDao.delete(id);
    }

    public void rewrite(Book book){
        bookDao.rewrite(book);
    }

    public void rewritePlus(String name_before , String name_after){
        bookDao.rewritePlus(name_before,name_after);
    }

    public void query(int id){
        System.out.println(bookDao.query(1));
    }

    public void batchAdd(List<Object[]> books){
        bookDao.batchAdd(books);
    }
}
