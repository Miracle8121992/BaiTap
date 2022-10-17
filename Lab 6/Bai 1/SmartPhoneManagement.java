package Lab5;

public class SmartPhoneManagement {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        SmartPhone s2 = new SmartPhone("N95" , "Nokia", 10000000, 4);

        s1.inputPhone();

        s1.showInfo();
        s2.showInfo();
    }
}
