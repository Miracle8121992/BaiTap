//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem Toan ");
        double Toan = sc.nextDouble();
        System.out.print("Nhap diem Ly ");
        double Ly = sc.nextDouble();
        System.out.print("Nhap diem Hoa ");
        double Hoa = sc.nextDouble();
        double T = Toan + Ly + Hoa;
        System.out.println("Tong 3 mon = " + T);
        double TBC = (Toan + Ly + Hoa) / 3.0;
        System.out.println("Diem trung binh cong = " + TBC);
    }
}
