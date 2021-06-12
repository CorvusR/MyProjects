package dao;

import beans.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {

    @Select("select * from corvus.users")
    List<Users> getUserList();



}
