import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so goi hang duoc gui : ");
        int Pack = sc.nextInt();
        System.out.print("Nhap khoang cach gui : ");
        int Distance = sc.nextInt();
        System.out.print("Nhap so ngay lam viec : ");
        int Shift = sc.nextInt();
        System.out.print("Nhap so luong y kien tot duoc phan hoi tu khach hang : ");
        int Feedback = sc.nextInt();
        System.out.print("Nhap so luong cuoc goi da tiep nhan tu khach hang : ");
        int Call = sc.nextInt();
        System.out.print("Nhap so tien thanh toan truc tiep cho nhan vien : ");
        int Electric = sc.nextInt();
        System.out.print("Nhap so tien thanh toan them : ");
        int Other = sc.nextInt();
        double Salary = (double)(Pack * 50 + Distance * 75) + (double)(Shift * 50) * 0.1 + (double)Feedback + (double)Call + (double)Electric + (double)Other;
        System.out.print("Luong nhan vien = " + Salary);
    }
}
