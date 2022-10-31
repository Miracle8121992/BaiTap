package Bai4;

import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudent ls = new ListStudent();
        int choice = 0;
        do {
            System.out.println("1. Add new student");
            System.out.println("2. Print list of student");
            System.out.println("3. Delete student");
            System.out.println("4. Edit information except ID");
            System.out.println("5. Find student base on name");
            System.out.println("6. Sort student by increase id");
            System.out.println("7. Exit!");
            System.out.print("Please choose function: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter year of birth: ");
                int yob = sc.nextInt();
                System.out.println("Add new student success!");
                Student s = new Student(id, name, yob);
                ls.addStudent(s);
            } else if (choice == 2) {
                System.out.println("List of student: ");
                ls.printListStudent();
                sc.nextLine();
            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                Student s1 = new Student(id);
                System.out.println("Delete student: " + ls.deleteStudent(s1));
            } else if (choice == 4) {

            } else if (choice == 5) {
                System.out.println("Enter name of student: ");
                String name = sc.nextLine();
                System.out.println("Result: ");
                ls.findStudent(name);
            } else if (choice == 6) {
                ls.sortStudent();
                System.out.println("List of student after sort increase by id");
                ls.printListStudent();
            }
        } while (choice != 0);
    }
}
