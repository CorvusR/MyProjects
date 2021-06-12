package dao;

import beans.Student;

public class TeacherDaoImpl implements TeacherDao {
    @Override
    public Student setStudent() {
        Student s = new Student();
        s.setId(1);
        s.setName("张三");
        return s;
    }
}
