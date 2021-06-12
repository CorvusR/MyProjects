import beans.Users;
import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

public class Test2 {                                                 //事务测试
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getFactory();
        UserDao mapper = session.getMapper(UserDao.class);

        int res = mapper.insert(new Users(8, "张老八", "男"));                 //添加
        if (res > 0) {
            System.out.println("奥里给！干了！");
        }

       /* int res = mapper.delete(8);                                       //删除
        if(res > 0){
            System.out.println("哕");
        }*/

        /*int update = mapper.update(new Users(8, "老八", "男"));             //修改
        if (update > 0) {
            System.out.println("奥里给，干了！");
        }*/

        session.commit();
        session.close();
    }
}

