package Lab8;

public class Staff {
    protected String name;
    protected double id, baseSalary,coefficientsSalary = 1, yow;

    public Staff(){
    }

    public Staff (String name, double id, double baseSalary, double yow){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.yow = yow;
    }

    public double getSalary() {
        return yow * coefficientsSalary;
    }

    public void setYow(double yow) {
        if (yow <0)
            System.out.println("Invalid!");
        else
            this.yow = yow;
    }

    public String getName() {
        return name;
    }
    public double getId() {
        return id;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(double id) {
        this.id = id;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double tinhLuong() {
        return getBaseSalary() * coefficientsSalary;
    }
    public void xuatThongTinNV(){
        System.out.println("Thong tin NV: ");
        System.out.println("Tên: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Luong co ban: " + getSalary());
        System.out.println("Tham nien: " + this.yow);
        System.out.println("Bac Luong: " + this.coefficientsSalary);
    }

}


