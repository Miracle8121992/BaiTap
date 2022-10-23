package Lab8;

import java.util.Scanner;

public class StaffManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = sc.nextInt();
        Staff[] s1 = new Staff[soNhanVien];


        //public String nhapDS () {
            System.out.println("Nhập thông tin cho nhân viên");
            for (int i = 0; i < soNhanVien; i++) {
                System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
                System.out.print("Chọn loại nhân viên (1 - Administration, 2 - Marketing): ");
                int choose = sc.nextInt();

                if (choose == 1) {
                    s1[i] = new Administration();
                } else if (choose == 2) {
                    s1[i] = new Marketing();
                }

                
  //  }
//}
