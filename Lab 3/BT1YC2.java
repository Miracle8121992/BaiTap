import java.util.Scanner;

public class BT1YC2 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        n = sc.nextInt();

        for (i = n; i >= 1; i--) {
            System.out.print(i);
        }
    }
}
