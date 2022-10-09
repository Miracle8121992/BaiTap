import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input character: ");
        char Character = sc.next().charAt(0);

        switch (Character) {
            case 'a', 'A' -> System.out.println("Ada");
            case 'b', 'B' -> System.out.println("Basic");
            case 'c', 'C' -> System.out.println("Cobol");
            case 'd', 'D' -> System.out.println("Android");
            case 'f', 'F' -> System.out.println("Fortran");
            case 'w', 'W' -> System.out.println("Windows phone");
            default -> System.out.println("Invalid.");

        }
    }
}
