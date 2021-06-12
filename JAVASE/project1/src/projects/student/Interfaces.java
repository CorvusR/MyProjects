package projects.student;

import java.util.List;

public interface Interfaces {
    /**
     *
     */
    void showAll();

    boolean add();

    Bean findById(int id);

    List<Bean> findByName(String name);

    boolean removeById(int id);

    boolean modifyById(int id);
}
