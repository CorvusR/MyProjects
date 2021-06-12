package dao;

import beans.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {
    /*List<Teacher> getTeacher();*/
    List<Teacher> getTeacher(@Param("id") int id);
    List<Teacher> getTeacher2();
}
