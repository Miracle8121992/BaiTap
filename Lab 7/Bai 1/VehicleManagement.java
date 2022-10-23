package Lab7;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Nam", "Honda", 110, 10000000 );
        Vehicle v3 =new Vehicle("Hoa", "Suzuki", 90, 5000000);

        System.out.print("Nhap ten chu xe 1: ");
        v1.setNameOwner(sc.nextLine());
        System.out.print("Nhap ten loai xe 1: ");
        v1.setNameCar(sc.nextLine());
        System.out.print("Nhap dung tich xe 1: ");
        v1.setDungTich(sc.nextInt());
        System.out.print("Nhap gia xe 1: ");
        v1.setPrice(sc.nextFloat());
        sc.nextLine();

        v1.hienThiThongTin();
        v2.hienThiThongTin();
        v3.hienThiThongTin();

        System.out.println("Thue truoc ba xe 1 la: " + v1.ThueTruocBa());
        System.out.println("Thue truoc ba xe 2 la: " + v2.ThueTruocBa());
        System.out.println("Thue truoc ba xe 3 la: " + v3.ThueTruocBa());

        double s = v1.ThueTruocBa() +  v2.ThueTruocBa() + v3.ThueTruocBa();
        System.out.println("Tong thue truoc ba tu 3 xe la: " + s);
    }

}
