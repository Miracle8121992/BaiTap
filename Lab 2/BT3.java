import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình căn bậc 2 : ax2 + bx + c =0");
        System.out.print("Nhập số a = ");
        float a = sc.nextFloat();
        System.out.print("Nhập số b = ");
        float b = sc.nextFloat();
        System.out.print("Nhập số c = ");
        float c = sc.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("Phương trình có 1 nghiệm: "
                        + "x = " + (-c / b));
            }
        }

        // tính delta
        float delta =( b * b - 4 * a * c);
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có hai nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép là: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}