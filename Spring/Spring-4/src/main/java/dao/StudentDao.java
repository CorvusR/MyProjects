package dao;

import beans.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    Student addStudent();
}
