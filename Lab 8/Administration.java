package Lab8;

public class Administration extends Staff {
    protected double allowance;
    public Administration(){
    }

    public Administration (String name, double id, double baseSalary, double yow, double sale) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.yow = yow;
        this.allowance = allowance;
    }

    public void setAllowance(double allowance) {
        if (allowance <0)
            System.out.println("Invalid!");
        else
            this.allowance = allowance;
    }

    @Override
    public double tinhLuong() {
        return getBaseSalary() * getCoefficientsSalary() + getAllowance();
    }

    @Override
    public void xuatThongTinNV() {
        super.xuatThongTinNV();
        System.out.println("Thong tin NV Administration: ");
        System.out.println("Tên: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Luong co ban: " + getSalary());
        System.out.println("Tham nien: " + this.yow);
        System.out.println("Bac Luong: " + this.coefficientsSalary);
        System.out.println("Phu cap: " + getAllowance());
    }

    public double getAllowance() {
        return allowance;
    }
}
