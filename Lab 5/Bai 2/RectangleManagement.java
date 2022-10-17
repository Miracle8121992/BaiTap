package Lab5;

import java.util.Scanner;

public class RectangleManagement {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai 1: ");
        rectangle1.setDai(sc.nextInt());
        System.out.print("Nhap chieu rong 1: ");
        rectangle1.setRong(sc.nextInt());

        rectangle1.doPerimeter();
        rectangle1.doArea();
        rectangle1.ketQua();
        sc.nextLine();

        System.out.print("Nhap chieu dai 2: ");
        rectangle2.setDai(sc.nextInt());
        System.out.print("Nhap chieu rong 2: ");
        rectangle2.setRong(sc.nextInt());

        rectangle2.doPerimeter();
        rectangle2.doArea();
        rectangle2.ketQua();
        sc.nextLine();


    }
}
