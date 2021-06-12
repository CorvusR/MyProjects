package dao;

import beans.Student;

public class StudentDaoImpl implements StudentDao{

    @Override
    public void setStudent() {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
    }
}
