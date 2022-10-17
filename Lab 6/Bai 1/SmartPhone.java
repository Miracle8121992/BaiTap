package Lab5;

import java.util.Scanner;

public class SmartPhone {
    private String name, brand;
    private double price;
    private int ram;

    SmartPhone() {

    }

    SmartPhone(String name, String brand, double price, int ram) {
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public void inputPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dt: ");
        name = sc.next();

        System.out.print("Nhap hang sx: ");
        brand = sc.next();

        System.out.print("Nhap so ram: ");
        ram = sc.nextInt();

        System.out.print("Nhap gia tien: ");
        price = sc.nextDouble();
    }

    public void showInfo() {
        System.out.println("Thong tin dt: ");
        System.out.println("Ten dt la: " + name);
        System.out.println("Hang sx: " + brand);
        System.out.println("Ram: " + ram);
        System.out.println("Gia: " + price);
    
    }
}

