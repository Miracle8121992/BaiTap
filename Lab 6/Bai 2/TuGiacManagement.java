package Lab6;

public class TuGiacManagement {
    public static void main(String[] args) {
        TuGiac t1 = new TuGiac();
        TuGiac t2 = new TuGiac(2);
        TuGiac t3 = new TuGiac(2, 4);

        t1.veTuGiac();
        t2.veTuGiac();
        t3.veTuGiac();

        int cv1 = t1.tinhChuVi();
        int cv2 = t2.tinhChuVi();
        int cv3 = t3.tinhChuVi();

        int dt1 = t1.tinhDienTich();
        int dt2 = t2.tinhDienTich();
        int dt3 = t3.tinhDienTich();

        String pl1 = t1.phanLoaiTG();
        String pl2 = t2.phanLoaiTG();
        String pl3 = t3.phanLoaiTG();

        System.out.println("Hinh " + pl1 + ". Có chu vi là: " + dt1 + ". Diện tích là: " + dt1);
        System.out.println("Hinh " + pl2 + ". Có chu vi là: " + dt2 + ". Diện tích là: " + dt2);
        System.out.println("Hinh " + pl3 + ". Có chu vi là: " + dt3 + ". Diện tích là: " + dt3);
    }
}
