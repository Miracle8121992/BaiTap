package Lab7;

public class Student {
    private String id, name;
    private float mathPoint, engPoint, litPoint;

    public Student(String id, String name, float mathPoint, float engPoint, float litPoint) {
        this.id = id;
        this.name = name;
        this.mathPoint = mathPoint;
        this.litPoint = litPoint;
        this.engPoint = engPoint;
    }
    //getter

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getEngPoint() {
        return engPoint;
    }
    public float getLitPoint() {
        return litPoint;
    }
    public float getMathPoint() {
        return mathPoint;
    }
    //Setter

    public float getDTB() {
        return (this.mathPoint + this.engPoint + this.litPoint) / 3;
    }

    public String getXepLoai() {
        String xepLoai = "";
        if (getDTB() < 0) {
            xepLoai = "Invalid!";
        } else if (getDTB() < 3.5) {
            xepLoai = "Xep loai kem!";
        } else if (getDTB() < 5) {
            xepLoai = "Xep loai yeu";
        } else if (getDTB() < 6.5) {
            xepLoai = "Xep loai trung binh";
        } else if (getDTB() < 8.5) {
            xepLoai = "Xep loai Kha";
        } else {
            xepLoai = "Gioi";
        }
    return xepLoai;
    }

    public void xemThongTin(){
        System.out.println("Thong tin sinh vien: ");
        System.out.println("ID: " + this.id + " - Name: " + this.name + " - Diem toan: " + this.mathPoint + " - Diem Anh: " + this.engPoint + " - Diem Van: " + this.litPoint);
    }

    public void xetHocBong(String xepLoai){
        if (getXepLoai() == "Gioi")
            System.out.println("Duoc cap hoc bong");
        else
            System.out.println("Khong duoc cap hoc bong");

    }

    public void xetLenLop(float DTB) {
        if (getDTB() < 3.5) {
            System.out.println("O lai lop");
        } else if (getDTB() < 5) {
            System.out.println("Thi lai");
        } else {
            System.out.println("Duoc len lop thang");
        }
    }


}
