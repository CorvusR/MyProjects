import beans.Users;
import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

import java.util.List;

public class Test1 {
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getFactory();
        UserDao mapper = session.getMapper(UserDao.class);
        List<Users> userList = mapper.getUserList();
        for (Users users : userList) {
            System.out.println(users);
        }
        session.close();
    }
}
