package Lab5;

import java.util.Calendar;
import java.util.Scanner;

public class Worker {
    private String name;
    private int yob;
    private String job;
    private String place;

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.next();

        System.out.print("Nhap nam sinh: ");
        yob = sc.nextInt();

        System.out.print("Nhap cong viec: ");
        job = sc.next();
    }

    public String findWorkplace() {
        switch (job) {
            case "Giao_duc":
                place = "Truong hoc"; break;
            case "Y_te":
                place = "Benhvien"; break;
            case "Luat":
                place = "Toa an"; break;
            case "Cong so":
                place = "Van phong"; break;
            case "Khac":
                place = "Khong biet"; break;
            default:
                place = "Invalid"; break;
        }
        return this.place;
    }


        public String studyOrWork() {
            Calendar now = Calendar.getInstance();
            int age = now.get(Calendar.YEAR) - yob;
            if (age < 20) {
                return "Đang học";
            } else {
                return "Đang làm việc";
            }
        }

        public void outPut() {
            System.out.println("Bạn tên là " + name + ". Bạn " + studyOrWork() + " về " + job + " tại " + findWorkplace());
        }
    }






