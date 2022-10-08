public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem toan: ");
        double T = sc.nextDouble();
        System.out.println("Nhap diem ly: ");
        double L = sc.nextDouble();
        System.out.println("Nhap diem Hoa: ");
        double H = sc.nextDouble();

        double TBC = ((T + L + H) / 3);
        System.out.println("Diem trung binh cong = " + TBC);

        if (TBC <5) {
            System.out.println("yeu");
        } else if (TBC < 6.5) {
            System.out.println("Trung binh");
        } else if (TBC < 8) {
            System.out.println("Kha");
        } else if (TBC <10){
            System.out.println("Gioi");
        }
        else  {
            System.out.println("Xuat sac");
        }

    }
}