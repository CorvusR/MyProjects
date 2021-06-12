package dao;

import beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BandDaoImpl implements BankDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void reduce(int difference, int id) {
        String sql = "update bank set money = money - ? where id = ?";
        Object[] args = {difference, id};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void increase(int difference, int id) {
        String sql = "update bank set money = money + ? where id = ?";
        Object[] args = {difference, id};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public List<User> query() {
        String sql = "select * from bank";
        BeanPropertyRowMapper<User> beanPropertyRowMapper = new BeanPropertyRowMapper<>(User.class);
        List<User> query = jdbcTemplate.query(sql, beanPropertyRowMapper);
        return query;
    }


}
