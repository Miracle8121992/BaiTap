public class BT1_4 {
    public static void main(String[] args) {
        int array[] = {10, 25, -4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42, -6};

        for(int i = 0; i < 15; i++)
        {
            if (array[i] < 0) {
                array[i] =0;
            }
        }
        System.out.println("Mang sau khi thay doi: ");
        for(int i=0;i<15;i++)
            System.out.print("\t"+array[i]);
    }
}
