import java.util.Scanner;

public class BT2YC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int i = 1;
        int s = 0;

        while ((1 <= i) && (i <= n)) {
            if (i % 3 == 0) {
                if (i % 7 == 0) {
                    s = s + 1;
                }
            }
            i++;
        }
        System.out.print("So luong so chia het cho 3 va 7 trong khoang tu 1 toi " + n + " la: " + s);
    }
}
