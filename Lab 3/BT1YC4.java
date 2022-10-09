import java.util.Scanner;

public class BT1YC4 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        n = sc.nextInt();

        for (i = 2; i <= n; i= i+2) {
            System.out.print(i);
        }
    }
}
