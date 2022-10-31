package Bai4;

import java.util.Objects;

public class Student {
    private String name;
    private int yob, id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "ID ='" + id + '\'' +
                ", Name ='" + name + '\'' +
                ", Year of birth =" + yob;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

}
