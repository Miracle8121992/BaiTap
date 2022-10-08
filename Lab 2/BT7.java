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

        if (((Gio > 0) && (Gio < 23)) && ((Phut > 0) && (Phut < 59)) && ((Giay > 0) && (Giay < 59))) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: " + Gio + ":" + Phut + ":" + Giay);
        }
            else if ((Gio == 23) && (Giay == 59) && (Phut == 59)) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: 23:59:59");
            System.out.println("Thời gian chậm hơn 1 giây là: 23:59:58");
            System.out.println("Thời gian nhanh hơn 1 giây là: 00:00:00");
            }
            else if ((Giay == 59) && (Phut == 59)) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: " + Gio + ":59:59");
            System.out.println("Thời gian chậm hơn 1 giây là: " + Gio + ":59:58");
            System.out.println("Thời gian nhanh hơn 1 giây là: " + (Gio + 1) + ":00:00");
            }
            else if (Giay == 59) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: " + Gio + ":" + Phut + ":59");
            System.out.println("Thời gian chậm hơn 1 giây là: " + Gio + ":" + Phut + ":58");
            System.out.println("Thời gian nhanh hơn 1 giây là: " + Gio + ":" + (Phut + 1) + ":00");
            }
            else if ((Gio == 0) && (Giay == 0) && (Phut == 0)) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: 00:00:00");
            System.out.println("Thời gian chậm hơn 1 giây là: 23:59:59");
            System.out.println("Thời gian nhanh hơn 1 giây là: 00:00:01");
            }
            else if ((Giay == 0) && (Phut == 0)) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: " + Gio + "00:00");
            System.out.println("Thời gian chậm hơn 1 giây là: " + (Gio - 1) + ":59:59");
            System.out.println("Thời gian nhanh hơn 1 giây là: " + Gio + ":01:01");
            }
            else if (Giay == 0) {
            System.out.println("Ba số bạn vừa nhập là thời gian hợp lệ: " + Gio + ":" + Phut + ":00");
            System.out.println("Thời gian chậm hơn 1 giây là: " + (Gio - 1) + ":" + (Phut - 1) + ":" + "59");
            System.out.println("Thời gian nhanh hơn 1 giây là: " + Gio + ":" + Phut + ":01");
            }
        else {
            System.out.print("Ba số bạn vừa nhập không phải là thời gian hợp lệ");
        }
    }
}
