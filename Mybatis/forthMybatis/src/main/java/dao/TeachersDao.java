package dao;

import beans.Teachers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachersDao {
   List<Teachers> getTeachers(@Param("id") int id);
}
