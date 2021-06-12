package dao;

import beans.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into book values(?,?)";
        Object[] args = {book.getId(), book.getName()};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from book where id = ?";
        System.out.println(jdbcTemplate.update(sql, id));
    }

    @Override
    public void rewrite(Book book) {
        String sql = "update book set name = ? where id = ?";
        Object[] args = {book.getName(), book.getId()};
        System.out.println(jdbcTemplate.update(sql, args));
    }

    @Override
    public void rewritePlus(String name_before, String name_after) {
        String sql = "update book set name = ? where name = ?";
        System.out.println(jdbcTemplate.update(sql, name_after, name_before));
    }

    @Override
    public List<Book> query(int id) {
        String sql = "select * from book";
        BeanPropertyRowMapper<Book> bookBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Book.class);
        List<Book> books = jdbcTemplate.query(sql, bookBeanPropertyRowMapper);
        return books;
    }

    @Override
    public void batchAdd(List<Object[]> books) {
        String sql = "insert into book values (?,?)";
        System.out.println(Arrays.toString(jdbcTemplate.batchUpdate(sql, books)));
    }

}
