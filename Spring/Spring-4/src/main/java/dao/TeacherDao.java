package dao;

import beans.Student;
import beans.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao {
    public Student getStudent();
    public Teacher getTeacher();
}
