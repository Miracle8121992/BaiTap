package Lab5;

import java.util.Scanner;

public class Rectangle {
    private int dai;
    private int rong;

    //setter
    public void setDai(int dai) {
        this.dai = dai;
    }
    public void setRong(int rong) {
        this.rong = rong;
    }

    //getter (optional)
    public int getDai() {
        return dai;
    }
    public int getRong() {
        return rong;
    }

    public int doPerimeter() {
        int v = (dai + rong) * 2;
        return v;
    }
    public int doArea() {
        int s = dai * rong;
        return s;
    }

    public void ketQua(){
        System.out.println("chu vi la: " + this.doPerimeter());
        System.out.println("dien tich la: " + this.doArea());
    }
}