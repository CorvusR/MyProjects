package dao;

import beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

  @Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private Student student;

    @Override
    public Student addStudent() {
        student.setId(1);
        student.setName("张三");
        return student;
    }
}
