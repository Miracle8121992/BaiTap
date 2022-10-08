import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hiển thị số ngày trong tháng");

        System.out.print("Nhập năm: ");
        int Nam = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int Thang = sc.nextInt();

        if ((Thang <1 ) || (Thang >12)){
            System.out.println("Bạn phải nhập số tháng từ 1 tới 12.");
        }
           else if((Thang == 1) || (Thang == 3) || (Thang == 5) || (Thang == 7) || (Thang == 8) || (Thang == 10) || (Thang == 12)) {
            System.out.println("Số ngày trong tháng "+ Thang +" năm " + Nam + " là: 31");
        }
           else if ((Thang == 4) || (Thang == 6) || (Thang == 9) || (Thang == 11)) {
            System.out.println("Số ngày trong tháng "+ Thang+ " năm " + Nam + " là: 30");
        }
           else if ((Thang == 2) && ((Nam % 4) == 0) && ((Nam % 100) > 0))
        {
            System.out.println("Số ngày trong tháng "+ Thang +" năm " + Nam + " là: 29");

        }
        else {
            System.out.println("Số ngày trong tháng " + Thang + " năm " + Nam + " là: 28");
        }
    }
}