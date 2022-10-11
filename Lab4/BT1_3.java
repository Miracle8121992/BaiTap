public class BT1_3 {
    public static void main(String[] args) {
        int s =0;
        int array[] = {10, 25, -4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42, -6};

        for(int i = 0; i < 15; i++)
        {
            if (array[i] % 2 == 0) {
                s = s + array[i];
            }
        }
        System.out.println("Tong cac phan tu co chi so chan la: " + s);
    }
}
