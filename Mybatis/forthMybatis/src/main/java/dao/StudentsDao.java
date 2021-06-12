package dao;

import beans.Students;

import java.util.List;

public interface StudentsDao {
    List<Students> getStudent();
    List<Students> getStudentPlus();
    List<Students> getStudents2();
    List<Students> getNames();
    List<Students> getIds();
}
