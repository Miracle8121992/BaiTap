import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự: ");
        char Kytu = sc.next().charAt(0);

        switch (Kytu) {
            case 'a':
                System.out.println("Ada");
                break;
            case 'b':
                System.out.println("Basic");
                break;
            case 'c':
                System.out.println("Cobol");
                break;
            case 'd':
                System.out.println("Android");
                break;
            case 'f':
                System.out.println("Fortran");
                break;
            case 'w':
                System.out.println("Windows phone");
                break;
            default: {
                System.out.println("Bạn đã nhập sai.");
                break;

            }

        }
    }
}