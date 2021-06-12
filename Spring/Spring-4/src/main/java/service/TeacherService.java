package service;

import dao.StudentDao;
import dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public void printTeacher() {
        System.out.println(teacherDao.getTeacher());
    }

    public void printStudent() {
        System.out.println(teacherDao.getStudent());
    }
}
