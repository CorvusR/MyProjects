package dao;

import beans.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankDao {
    void reduce(int difference, int id);

    void increase(int difference, int id);

    List<User> query();
}
