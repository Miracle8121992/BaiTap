//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen co 3 chu so ");
        short SN = sc.nextShort();

        if (SN <= 999 && SN >= 100) {
            System.out.println("Chu so hang tram la " + SN / 100);
            System.out.println("Chu so hang chuc la " + SN % 100 / 10);
            System.out.println("Chu so hang don vi la " + SN % 100 % 10);
        } else {
            System.out.print("Ban phai nhap so nguyen co 3 chu so");
        }

    }
}
