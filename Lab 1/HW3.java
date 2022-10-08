//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri x ");
        int x = sc.nextInt();

        System.out.print("Nhap gia tri y ");
        int y = sc.nextInt();

        double Tong = (double)(x + y);
        System.out.print("Tong cua x va y = " + Tong);

        double Hieu = (double)(x - y);
        System.out.print("\nHieu cua x va y = " + Hieu);

        double Tich = (double)(x * y);
        System.out.print("\nTich cua x va y = " + Tich);

        double Thuong = (double)(x / y);
        System.out.print("\nThuong cua x va y = " + Thuong);

        double Phandu = (double)(x % y);
        System.out.print("\nPhan du cua x chia y = " + Phandu);

        double Luythua = Math.pow((double)x, (double)y);
        System.out.print("\nx luy thua y = " + Luythua);
    }
}
