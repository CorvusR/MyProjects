import beans.Teacher;
import dao.TeacherDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import utils.MybatisUtils;

import java.util.List;

public class Test1 {
    @Test
    public void test1() {
        SqlSession session = MybatisUtils.getSession();
        TeacherDao mapper = session.getMapper(TeacherDao.class);
        List<Teacher> teacher = mapper.getTeacher(1);
        for (Teacher teachers : teacher) {
            System.out.println(teachers);
        }

    }

    @Test
    public void test2() {
        SqlSession session = MybatisUtils.getSession();
        TeacherDao mapper = session.getMapper(TeacherDao.class);
        List<Teacher> teacher = mapper.getTeacher2();
        for (Teacher teachers : teacher) {
            System.out.println(teachers);
        }

    }
}
