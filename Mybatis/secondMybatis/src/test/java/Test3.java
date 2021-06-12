import beans.Users;
import dao.UserDao;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

public class Test3 {
    static Logger logger = Logger.getLogger(Test3.class);

    @Test
    public void test1() {
        logger.info("1");
        logger.error("2");
        logger.debug("3");
    }

    @Test
    public void test2() {                                        //limit分页查询
        SqlSession factory = MybatisUtils.getFactory();
        UserDao mapper = factory.getMapper(UserDao.class);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("startIndex", 2);
        hashMap.put("size", 2);
        List<Users> limit = mapper.limit(hashMap);
        for (Users users : limit) {
            System.out.println(users);
        }
        factory.close();
    }

    @Test
    public void test3(){                               //rowbounds分页查询
        SqlSession factory = MybatisUtils.getFactory();
        /*UserDao userDao = factory.getMapper(UserDao.class);*/
        RowBounds rowBounds = new RowBounds(1, 2);
        List<Users> users = factory.selectList("dao.UserDao.rowBounds",null,rowBounds);
        for (Users user : users) {
            System.out.println(user);
        }
    }
}
