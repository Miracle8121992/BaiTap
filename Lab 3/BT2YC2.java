import java.util.Scanner;

public class BT2YC2 {
    public static void main(String[] args) {
        int s2=0;
        int f=1;


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++){
            f = (f * i);
            s2 = s2 + f;
        }
        System.out.print("s2 = " +s2);

    }
}
