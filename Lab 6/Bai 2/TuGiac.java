package Lab6;

public class TuGiac {
    private int a;
    private int b;

    public TuGiac() {
    }

    public TuGiac (int a){
        this.a = a;
        this.b = a;
    }
    public TuGiac (int a, int b){
        this.a = a;
        this.b = b;
    }

    public void veTuGiac(){
        if (a == 0)
            if (b == 0)
                System.out.println("Không thể vẽ hình");
        if (a != 0)
            if (b != 0)
                System.out.println("Vẽ * với kích thước tương ứng");
    }
    public int tinhChuVi(){
        return (a+b)*2;
    }
    public int tinhDienTich(){
        return a*b;
    }
    public String phanLoaiTG(){
        String pl = "";
        if (a != 0)
            if (b != 0)
                if (a == b)
                    return pl = "Vuong";
                else if (a != b)
                    return pl = "HCN";

        if ((a == 0) && (b == 0))
            return pl = "Khong biet!";
    return pl;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
