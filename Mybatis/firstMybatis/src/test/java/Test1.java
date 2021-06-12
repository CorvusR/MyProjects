import beans.Users;
import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

import java.io.IOException;
import java.util.List;

public class Test1 {                                                    //查询测试
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getFactory();
        try {

            /*UserDao userDao = session.getMapper(UserDao.class);

            List<Users> userList = userDao.getUserList();                            //第一种方法
            for (Users users : userList) {
                System.out.println(users);
            }

            List<Users> users = session.selectList("dao.UserDao.getUserList");    //第二种方法
            for (Users user : users) {
                System.out.println(user);
            }
            */
            UserDao userDao = session.getMapper(UserDao.class);
            /*List<Users> users = userDao.getUserById(1);        */                 //通过ID查询
            List<Users> users = userDao.getUserByName("张%");                        //通过姓名查询

            for (Users user : users) {
                System.out.println(user);
            }

        } catch (Exception e) {
        } finally {
            session.close();
        }

    }

}
