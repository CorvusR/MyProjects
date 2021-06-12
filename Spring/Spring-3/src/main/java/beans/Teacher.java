package beans;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Teacher {
    private int id;
    private String name;
    private Student student;

    public Teacher() {
    }

    public Teacher(int id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(name, teacher.name) && Objects.equals(student, teacher.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, student);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
