package Lab9;

import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        Account acc1 = new Account();
        String choice;
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Open an account: Enter open");
            System.out.println("Make a deposit: Enter deposit");
            System.out.println("Make a withdraw: Enter withdraw");
            System.out.println("Show the number of transaction: Enter show");
            System.out.println("Exit the ATM: Enter quit");
            System.out.print("Enter your choice: ");
            choice = sc.next();

            switch (choice) {
                case "open":
                    acc1.open();
                    break;
                case "deposit":
                    acc1.deposit();
                    break;
                case "withdraw":
                    acc1.withdraw();
                    break;
                case "show":
                    acc1.showTransaction();
                    break;
                case "quit":
                    System.out.println("You choose Exit! See you again!");
                    System.exit(0);
                    break;
            }
        }
    }
}
