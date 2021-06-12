package dao;

import beans.Users;

import java.util.List;

public interface UserDao {
    List<Users> getUserList();
    List<Users> getUserById(int id);
    List<Users> getUserByName(String name);
    int update(Users users);
    int insert(Users users);
    int delete(int id);

}
