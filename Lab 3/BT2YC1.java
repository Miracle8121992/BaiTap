import java.util.Scanner;

public class BT2YC1 {
    public static void main(String[] args) {
            int i = 0;
            int n = 0;
            int factorials = 1;

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập N: ");
            n = sc.nextInt();

            for (i = 1; i <= n ; i++){
                factorials = factorials * i;
            }

            System.out.print("factorials of " +  n + " is " +factorials);
        }
    }