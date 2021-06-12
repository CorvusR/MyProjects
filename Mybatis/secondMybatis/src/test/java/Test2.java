import beans.Users;
import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

public class Test2 {
    @Test
    public void test1() {        //删除
        SqlSession session = MybatisUtils.getFactory();
        UserDao userDao = session.getMapper(UserDao.class);
        int delete = userDao.delete(8);
        if (delete > 0) {
            System.out.println("yue");
        }
        session.commit();
        session.close();
        String s = "ass";
    }
   /* @Test
    public void test2() {           //添加
        SqlSession session = MybatisUtils.getFactory();
        UserDao userDao = session.getMapper(UserDao.class);
        int insert = userDao.insert(new Users(8, "老八", "男"));
        if (insert > 0) {
            System.out.println("奥里给");
        }
        session.commit();
        session.close();
    }*/
}
