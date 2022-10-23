package Lab7;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Student std1 = new Student("A12", "Nam", 1,2,3);

        std1.xemThongTin();
        std1.xetHocBong(std1.getXepLoai());
        std1.xetLenLop(std1.getDTB());

    }
}
