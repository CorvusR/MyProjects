package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void minus() {
        String sql ="update bank set money = money - ? where username = ?";
        jdbcTemplate.update(sql,100,"张三");
    }

    @Override
    public void add() {
        String sql ="update bank set money = money + ? where username = ?";
        jdbcTemplate.update(sql,100,"李四");
    }

}