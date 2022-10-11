import java.util.Scanner;

public class BT4YC1 {
    public static void main(String[] args) {
        //int price = (int) Math.random();
        int price = 20;
        int buy =0;
        int guess = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a price: ");
        buy = sc.nextInt();


        while (buy > price) {
            System.out.println("The real price is lower than the price you guess :");
            System.out.print("Guess another price: ");
            buy = sc.nextInt();
            guess = guess - 1;
            if (guess == 0) {
                System.out.println("You lose!"); break;
            }
        }
        while (buy < price) {
            System.out.println("The real price is higher than the price you guess :");
            System.out.print("Guess another price: ");
            buy = sc.nextInt();
            guess = guess - 1;
            if (guess == 0) {
                System.out.println("You lose!"); break;

            }
        }

        if (buy == price) {
                    System.out.println("Exactly!");
                    System.out.println("Number of incorrectly guess is: " + (10 - guess));
        }
    }
}
