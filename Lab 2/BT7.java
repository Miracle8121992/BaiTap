import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int Gio = sc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int Phut = sc.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int Giay = sc.nextInt();

        if (((Gio >= 0) && (Gio <= 24)) && ((Phut >= 0) && (Phut <= 60)) && ((Giay >= 0) && (Giay <= 60))) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ");
            System.out.println("Thời gian chậm hơn 1 giây là: " + Gio + ":" + Phut + ":" + (Giay - 1));
            System.out.println("Thời gian nhanh hơn 1 giây là: " + Gio + ":" + Phut + ":" + (Giay + 1));
        }
        else {
            System.out.print("Ba số bạn vừa nhập không phải là thời gian hợp lệ");
        }
    }
}
