package Lab8;

import java.util.Scanner;

public class CarManagement {
    public static void main(String[] args) {
        Car c1 = new Car("i10", "Ferrari", "2002", 4, 200000000);
        Car c2 = new Car("Lux", "VinFast", "2010", 7, 100000000);
        Car c3 = new Car("SH", "Honda", "2010", 2, 10000000);

        c1.getInfor();
        c2.getInfor();
        c3.getInfor();

        System.out.println("Thue xe i10 la: " + c1.calculateTax());
        System.out.println("Thue xe Lux la: " + c2.calculateTax());
        System.out.println("Thue xe Honda la: " + c3.calculateTax());
    }
}
