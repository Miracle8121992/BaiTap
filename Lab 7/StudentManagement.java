package Lab7;

public class StudentManagement {
    public static void main(String[] args) {
        Student std1 = new Student("A12", "Nam", 7,8,9);

        std1.xemThongTin();
        std1.xetHocBong(std1);
        std1.xetLenLop();

    }
}
