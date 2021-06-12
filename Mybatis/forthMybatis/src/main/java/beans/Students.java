package beans;

import java.util.Objects;

public class Students {

    private int id;
    private String name;
    private Teachers teachers;

    public Students() {
    }

    public Students(int id, String name, Teachers teachers) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name) && Objects.equals(teachers, students.teachers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teachers);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
