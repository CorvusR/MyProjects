package dao;

import beans.Student;
import beans.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl implements TeacherDao {
    @Autowired
    private Teacher teacher;
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudent() {
        return studentDao.addStudent();
    }

    public Teacher getTeacher() {
        teacher.setName("王五");
        teacher.setStudent(studentDao.addStudent());
        return teacher;
    }
}
