import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.print("Nhap ten sinh vien 1: ");
        student1.setName(sc.nextLine());
        System.out.print("Nhap ma so sinh vien 1: ");
        student1.setId(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Nhap ten sinh vien 2: ");
        student2.setName(sc.nextLine());
        System.out.print("Nhap ma so sinh vien 2: ");
        student2.setId(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Nhap ten sinh vien 3: ");
        student3.setName(sc.nextLine());
        System.out.print("Nhap ma so sinh vien 3: ");
        student3.setId(sc.nextInt());
        sc.nextLine();
        
        student1.sayHello();
        student2.sayHello();
        student3.sayHello();

        }
    }
