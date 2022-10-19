package Lab6;

import java.util.Scanner;

public class SmartPhone {
    private String name, brand;
    private double price;
    private int ram;

    public SmartPhone() {

    }

    public SmartPhone(String name, String brand, double price, int ram) {
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
        System.out.println("Ten dt la: " + getName());
        System.out.println("Hang sx: " + getBrand());
        System.out.println("Ram: " + getRam());
        System.out.println("Gia: " + getPrice());

    }
    public String soSanh(SmartPhone s2){
        String sosanh1 = "";
        if (getPrice() < s2.getPrice()) {
            sosanh1 = String.format("Giá %s rẻ hơn %s", getName(), s2.getName());
        } else if (getPrice() > s2.getPrice()) {
            sosanh1 = String.format("Giá %s đắt hơn %s", getName(), s2.getName());
        } else {
            sosanh1 = String.format("Giá %s bằng %s", getName(), s2.getName());
        }
        return sosanh1;
        }



    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

