//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai :");
        double length = sc.nextDouble();
        System.out.print("Nhap chieu rong :");
        double width = sc.nextDouble();
        double area = length * width;
        double cir = (length + width) * 2.0;
        System.out.print("Area =" + area);
        System.out.print("\nCircumference = " + cir);
    }
}
