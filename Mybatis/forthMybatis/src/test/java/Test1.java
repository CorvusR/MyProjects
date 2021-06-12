import beans.Students;
import beans.Teachers;
import dao.StudentsDao;
import dao.TeachersDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

import java.util.List;

public class Test1 {
    @Test
    public void getTeachers() {
        SqlSession session = MybatisUtils.getFactory();
        TeachersDao mapper = session.getMapper(TeachersDao.class);
        List<Teachers> teachers = mapper.getTeachers(1);
        for (Teachers teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Test
    public void getStudents() {
        SqlSession session = MybatisUtils.getFactory();
        StudentsDao mapper = session.getMapper(StudentsDao.class);
        List<Students> students = mapper.getStudent();
        for (Students student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void getStudentsPlus() {
        SqlSession session = MybatisUtils.getFactory();
        StudentsDao mapper = session.getMapper(StudentsDao.class);
        List<Students> studentPlus = mapper.getStudentPlus();
        for (Students plus : studentPlus) {
            System.out.println(plus);
        }
        session.close();
    }

    @Test
    public void getStudents2(){
        SqlSession session = MybatisUtils.getFactory();
        StudentsDao mapper = session.getMapper(StudentsDao.class);
        List<Students> students = mapper.getStudents2();
        for (Students student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void getNames(){
        SqlSession session = MybatisUtils.getFactory();
        StudentsDao mapper = session.getMapper(StudentsDao.class);
        List<Students> names = mapper.getNames();
        for (Students name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void getIds(){
        SqlSession session = MybatisUtils.getFactory();
        StudentsDao mapper = session.getMapper(StudentsDao.class);
        List<Students> ids = mapper.getIds();
        for (Students id : ids) {
            System.out.println(id);
        }
    }
}
