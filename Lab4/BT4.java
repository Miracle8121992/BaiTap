import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {

        int s = 0;
        int i = 0;
        int j = 0;
        int select;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of the array ");
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (; ; ) {
            System.out.println("\t1. Nhập mảng");
            System.out.println("\t2. Hiển thị mảng");
            System.out.println("\t3. Tính tổng các phần tử trong mảng");

            do {
                System.out.println("Bấm số để chọn (1/2/3): ");
                select = sc.nextInt();
            } while ((select < 1) || (select > 3));

            switch (select) {
                    case 1:
                        System.out.println("1. Nhập mảng");
                        for (i = 0; i < n; i++) {
                            for ( j = 0; j < m; j++) {
                                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                                a[i][j] = sc.nextInt();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Print array: ");
                        for (i = 0; i < n; i++) {
                            for ( j = 0; j < m; j++) {
                                System.out.println(a[i][j] + "\t");
                            }
                        }
                        break;
                    case 3:
                        for (i = 0; i < n; i++) {
                            for ( j = 0; j < m; j++) {
                                s = s + a[i][j];
                            }
                        }
                        System.out.println("Tong cac phan tu: " + s);
                        break;
                }
            }
        }
    }

