package Lab7;

import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        Account ac1 = new Account(100, "Nam");
        Account ac2 = new Account(50, "Hoa");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma pin: ");
        ac1.setPin(sc.next());

        ac1.changePin();
        System.out.println("Ma pin da duoc thay doi thanh: " + ac1.getPin());
        System.out.println("So du tai khoan 1 la: " + ac1.getSodu());
        System.out.println("So du tai khoan 2 la: " + ac2.getSodu());
        ac1.rutTien();
        System.out.println("So du tai khoan 1 sau khi rut la: " + ac1.getSodu());
        System.out.println("Nhap so tien muon chuyen tu tai khoan 1 sang tai khoan 2");
        ac1.chuyenKhoan(ac2);
        System.out.println("So du tai khoan 1 la: " + ac1.getSodu());
        System.out.println("So du tai khoan 2 la: " + ac2.getSodu());
    }

}
