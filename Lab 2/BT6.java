import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        float x = sc.nextFloat();

        System.out.print("Nhập số thứ nhất: ");
        float y = sc.nextFloat();

        System.out.print("Nhập số thứ nhất: ");
        float z = sc.nextFloat();

        if ((x > 0) && (y > 0) && (z > 0) && (x + y > z) && (x + y > z) && (x + y > z)) {
            if ((x == y) && (y == z)) {
                System.out.println("Ba số bạn vừa nhập là ba cạnh của 1 tam giác đều");
            } else if ((x == y) || (y == z) || (x == z)) {
                System.out.println("Ba số bạn vừa nhập là ba cạnh của 1 tam giác cân");
            } else if ((x * x == y * y + z * z) || (y * y == x * x + z * z) || (z * z == x * x + y * y)) {
                System.out.println("Ba số bạn vừa nhập là ba cạnh của 1 tam giác vuông");
            } else if (((x * x + y * y == z * z) && (x == y)) || ((x * x + z * z == y * y) && (x == z)) || ((y * y + z * z == x * x) && (y == z))) {
                System.out.println("Ba số bạn vừa nhập là ba cạnh của 1 tam giác vuông cân");
            } else {
                System.out.println("Ba số bạn vừa nhập là ba cạnh của 1 tam giác thường");
            }
        } else {
            System.out.println("Ba số bạn vừa nhập không phải là ba cạnh của 1 tam giác");
        }

    }
}
