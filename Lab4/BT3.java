import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int s   = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input length of the array ");
        int n = sc.nextInt();

        //nhap gia tri phan tu trong mang
        int [] array = new int [n];
        System.out.println("Input number of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("In put number " + i + ": ");
            array[i] = sc.nextInt();
        }
        //in mang
        System.out.println("Print array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        //tim gia tri nho nhat
        for (int i = 0; i <n; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        //tim gia tri lon nhat
        for (int i = 0; i <n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //tính TBC
        for (int i = 0; i <n; i++) {
            s = s + array[i];
        }
        average = s / n;


        System.out.println("\tSmallest number in the array is: " + min);
        System.out.println("\tBiggest number in the array is: " + max);
        System.out.println("\taverage is: " + average);
    }
}
