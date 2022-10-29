package Lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account implements IActionable {
    private String name, gender, dob, pob, phone, email;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getPob() {
        return pob;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    public Account(){}

    public Account(String name, String gender, String yob, String dob, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.pob = pob;
        this.phone = phone;
        this.email = email;
    }

    public Scanner sc = new Scanner(System.in);
    public int accountID, accountBalance, transaction;

    @Override
    public void open() {
        System.out.println("Your choice: Open");
        System.out.print("Input your name: ");
        name = sc.next();
        System.out.print("Input your gender: ");
        gender = sc.next();
        System.out.print("Input your date of birth: ");
        dob = sc.next();
        System.out.print("Input your place of birth: ");
        pob = sc.next();
        System.out.print("Input your phone: ");
        phone = sc.next();
        System.out.print("Input your Email: ");
        email = sc.next();
        accountID = 100 + 1;
        System.out.println("Create new account success, Your account ID is: " + accountID);
        System.out.println("Your account information: ");
        System.out.println("Name: " + getName() + " - Gender: " +getGender() + " - Birthday: " + getDob() +
                            " - Address: " + getPob() + " - Phone number: " + getPhone() + " - Email: " + getEmail());
    }

    @Override
    public void deposit() {
        int id, depositMoney = 0;
        try {
            System.out.println("Your choice: Deposit");
            System.out.print("Please Enter your account ID: ");
            id = sc.nextInt();
            if (id == accountID) {
                System.out.print("Enter your amount: ");
                depositMoney = sc.nextInt();
                if (depositMoney > 0) {
                    accountBalance += depositMoney;
                    transaction++;
                    System.out.println("Deposit success, your current balance is: " + accountBalance);
                }
                else throw new InputMismatchException("Deposit money must > 0");
            } else System.out.println("Your account ID does not exist");
        } catch (InputMismatchException e)  {
            System.out.println("Invalid number! error: " + e.toString());
        }
    }
    @Override
    public void withdraw() {
        int id, withdrawMoney = 0;
        try {
            System.out.println("Your choice: Withdraw");
            System.out.print("Please Enter your account ID: ");
            id = sc.nextInt();
            if (id == accountID) {
                System.out.print("Enter your amount: ");
                withdrawMoney = sc.nextInt();
                if (withdrawMoney < accountBalance) {
                    if (withdrawMoney > 0) {
                        accountBalance -= withdrawMoney;
                        System.out.println("Your current balance is " + accountBalance);
                        transaction++;
                    } else throw new InputMismatchException("Withdraw money must > 0");
                } else System.out.println("Sorry but you are short " + withdrawMoney);
            } else System.out.println("Your account ID does not exist");
        } catch (InputMismatchException e)  {
            System.out.println("Invalid number! error: " + e.toString());
        }

    }
    @Override
    public void showTransaction() {
        int id, withdrawMoney;
        System.out.println("Your choice: Show");
        System.out.print("Please Enter your account ID: ");
        id = sc.nextInt();
        if (id == accountID)
            System.out.println("The number of transaction are: " + transaction);
        else
            System.out.println("Your account ID does not exist");
    }
}




