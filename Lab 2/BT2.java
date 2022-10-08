import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem toan: ");
        double T = sc.nextDouble();

        System.out.print("Nhap diem ly: ");
        double L = sc.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double H = sc.nextDouble();

        double TBC = ((T + L + H) / 3);
        System.out.println("Diem trung binh cong = " + TBC);

        if (TBC <5) {
            System.out.print("Xep hang yeu");
        } else if (TBC < 6.5) {
            System.out.print("Xep hang trung binh");
        } else if (TBC < 8) {
            System.out.print("Xep hang kha");
        } else if (TBC <10){
            System.out.print("Xep hang gioi");
        }
        else  {
            System.out.println("Xep hang xuat sac");
        }

    }
}