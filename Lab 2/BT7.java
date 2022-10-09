import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        int hour = 1;
        int minute = 1;
        int second = 1;

        boolean isHour = (hour >= 0 && hour <= 24);
        boolean isMinute = (minute >= 0 && minute <= 60);
        boolean isSecond = (second >= 0 && second <= 60);

        boolean isTimeValid = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input hour: ");
        hour = sc.nextInt();

        System.out.print("Input minute : ");
        minute = sc.nextInt();

        System.out.print("Input second: ");
        second = sc.nextInt();


        if (isHour && isMinute && isSecond) {
            isTimeValid = true;
        }

        switch (second) {
            case 59:
                if (minute == 59) {
                    if (hour == 23) {
                        System.out.println("Time increase 1 second is : 00:00:00");
                        System.out.println("Time decrease 1 second is : 23:59:58");
                    } else {
                        System.out.println("Time increase 1 second is :" + (hour+1) + ":00:00");
                        System.out.println("Time decrease 1 second is :" + hour + ":59:58");
                    }
                } else {
                    System.out.println("Time increase 1 second is :" + hour + ":" + (minute+1) + ":00");
                    System.out.println("Time decrease 1 second is :" + hour + ":" + minute + ":58");
                }
                break;
            case 0:
                if (minute == 0) {
                    if (hour == 0) {
                        System.out.println("Time increase 1 second is : 00:00:01");
                        System.out.println("Time decrease 1 second is : 23:59:59");
                    } else {
                        System.out.println("Time increase 1 second is :" + hour + ":00:01");
                        System.out.println("Time decrease 1 second is :" + (hour-1) + ":59:59");
                    }
                } else {
                    System.out.println("Time increase 1 second is :" + hour + ":" + minute + ":01");
                    System.out.println("Time decrease 1 second is :" + hour + ":" + (minute-1) + ":59");
                }
                break;

            default:
                System.out.println("Time increase 1 second is :" + hour + ":" + minute + ":" + (second + 1));
                System.out.println("Time decrease 1 second is :" + hour + ":" + minute + ":" + (second - 1));
        }

        if (isTimeValid)
            System.out.println("Time is :" + hour + ":" + minute + ":" + second);
        else
            System.out.println("Invalid time format");

    }
}
