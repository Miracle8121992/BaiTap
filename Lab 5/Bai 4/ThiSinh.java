package Lab5;

import java.util.Scanner;

public class ThiSinh {
    private String name, id;
    private float point1, point2, point3;
    private boolean HSG, UT;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public double tinhDXT() {
        double DXT = 0;
        float sum = point1 + point2 + point3;
        double dk1 = sum + 1 + 0.5;
        double dk2 = sum + 1;
        double dk3 = sum + 0.5;
        if ((HSG) && (UT)) {
            return dk1;
        } else if (HSG) {
            return dk2;
        } else if (UT) {
            return dk3;
        } else
            return sum;
    }

    public boolean check() {
        boolean liet = false;
        if ((point1 == 0) || (point2 == 0) || (point3 == 0)) ;
        liet = true;

        return liet;
    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.next();

        System.out.print("Input id: ");
        id = sc.next();

        System.out.print("Input diem mon 1: ");
        point1 = sc.nextFloat();

        System.out.print("Input diem mon 2: ");
        point2 = sc.nextFloat();

        System.out.print("Input diem mon 3: ");
        point3 = sc.nextFloat();

        System.out.print("UT ?");
        UT = sc.nextBoolean();

        System.out.print("HSG ?");
        HSG = sc.nextBoolean();
    }
}




