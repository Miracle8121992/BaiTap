import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        boolean yearLeap = false;
        int year =  1;
        int month = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hiển thị số ngày trong tháng");

        System.out.print("Nhập năm: ");
        year = sc.nextInt();

        System.out.print("Nhập tháng: ");
        month = sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Số ngày trong tháng là 31");
            case 4, 6, 9, 11 -> System.out.println("Số ngày trong tháng là 30");
            case 2 -> {
                if (year % 4 == 0) {
                    yearLeap = year % 100 != 0;
                }
                if (year % 400 == 0) yearLeap = true;
                if (yearLeap)
                    System.out.println("Số ngày trong tháng là 29");
                else
                    System.out.println("Số ngày trong tháng là 28");
            }
            default -> System.out.println("Sai thông tin");
        }
    }
}

