package Lab7;

import java.util.Scanner;

public class Account {
    private double sodu;
    private String pin;
    private String name;

    Scanner sc = new Scanner(System.in);
    public Account(double sodu, String name) {
        this.sodu = sodu;
        this.name = name;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    public double getSodu() {
        return sodu;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public double rutTien() {
        System.out.println("Nhap so tien muon rut tu tai khoan 1");
        double tienMuonRut = sc.nextDouble();
        if (tienMuonRut <= getSodu()) {
            sodu = getSodu() - tienMuonRut;
            return tienMuonRut;
        } else {
            System.out.println("So tien trong tai khoan khong du de rut!");
        }
        return tienMuonRut;
    }
    public void chuyenKhoan(Account ac2) {
        double tienMuonchuyen = sc.nextDouble();
        if (getSodu() > 0 && getSodu() >= tienMuonchuyen){
            ac2.setSodu(getSodu() + tienMuonchuyen);
            setSodu(getSodu() - tienMuonchuyen);
            System.out.println("Chuyen khoan thanh cong");
        }else {
            System.out.println("Tai khoan khong du tien de chuyen");
        }
    }
    public void changePin(){
        System.out.println("Input new pin");
        setPin(sc.next());
    }
}
