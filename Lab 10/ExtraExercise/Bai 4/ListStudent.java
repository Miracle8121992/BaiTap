package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent  {
    private ArrayList<Student> list;

    public ListStudent(ArrayList<Student> list) {
        this.list = list;
    }
    public ListStudent() {
        this.list = new ArrayList<Student>();
    }
    
    // Thêm sinh viên
    public void addStudent(Student sv){
        this.list.add(sv);
    }
    // In danh sách sinh viên
    public void printListStudent(){
        for (Student student: list) {
            System.out.println(student);
        }
    }
    public boolean deleteStudent(Student sv){
        return this.list.remove(sv);
    }
    public void findStudent(String name){
        for (Student student: list) {
            if (student.getName().contains(name))
                System.out.println(student);
        }
    }
    public void sortStudent(){
        Collections.sort(this.list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getId()<s2.getId())
                    return -1;
                else if (s1.getId()>s2.getId())
                    return 1;
                else
                    return 0;
            }
        });
    }

}
