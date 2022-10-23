package Lab7;

public class Vehicle {
    private String nameOwner, nameCar;
    private int dungTich;
    private float price;

    public Vehicle (){
    }
    public Vehicle (String nameOwner, String nameCar, int dungTich, float price){
        this.nameOwner = nameOwner;
        this.nameCar = nameCar;
        this.dungTich = dungTich;
        this.price = price;
    }

    public double ThueTruocBa() {
        if (getDungTich() < 100) {
            return  (0.01 * price);
        }
            if (getDungTich() < 200) {
                return  (0.03 * price);
             }
            else {
            return (0.05 * price);
        }
    }

    public void setNameOwner(String nameOwner) {
        if (nameOwner == null || nameOwner.isEmpty())
            // Nếu biến ten chưa khởi tạo (mang giá trị null), hoặc biến ten có nội dung rỗng
            // Thì hãy lưu với tên là "Không biết"
            this.nameOwner = "Không biết";
         else
            this.nameOwner = nameOwner;
    }

    public void setNameCar(String nameCar) {
        if (nameCar == null || nameCar.isEmpty())
            this.nameCar = "Không biết";
        else
            this.nameCar = nameCar;

    }

    public void setPrice(float price) {
        if (price < 0)
            this.price = 0;
        else
            this.price = price;
    }

    public void setDungTich(int dungTich) {
        if (dungTich < 0)
            this.dungTich = 0;
        else
            this.dungTich = dungTich;
    }

    public float getPrice() {
        return price;
    }

    public int getDungTich() {
        return dungTich;
    }

    public String getNameCar() {
        return nameCar;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void hienThiThongTin() {
        System.out.println("Ten xe: " + getNameCar());
        System.out.println("Ten chu xe: " + this.nameOwner);
        System.out.println("Dung tich : " + this.dungTich);
        System.out.println("Gia: " + this.price);
    }
}

