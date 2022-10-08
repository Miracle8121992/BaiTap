import java.util.Scanner;

public class BT1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat ");
        double x = sc.nextDouble();

        System.out.print("Nhap so thu hai ");
        double y = sc.nextDouble();

        System.out.print("Nhap phep tinh ");
        char Tinh = sc.next().charAt(0);

        switch (Tinh){
            case '+':
                System.out.println("Phep tinh cong cua hai so la: " + x + y);
                break;
            case '-':
                System.out.println("Phep tinh tru cua hai so la: "+ (x - y) );
                break;
            case '*':
                System.out.println("Phep tinh nhan cua hai so la: "+ ( x * y) );
                break;
            case '/':
                if (y == 0){
                    System.out.println("Khong the thuc hien phep chia voi so 0");
                }
                System.out.println("Phep tinh chia cua hai so la: " + x / y );
                break;

            default:{
                System.out.println("Hien tai chi su dung duoc 4 phep tinh  + - * /: ");
                break;

            }
        }
    }
}