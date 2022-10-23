package Lab8;

public class Marketing extends Staff {
    protected double sale;

    public Marketing (){}
    public Marketing (String name, double id, double baseSalary, double yow, double sale){
      this.name = name;
      this.id = id;
      this.baseSalary = baseSalary;
      this.yow = yow;
      this.sale = sale;
    }
    public double getBonus(double bonus){
        if (getSale() < 5000000) {
            System.out.println("Khong co hoa hong.");
        }else if (getSale() < 10000000){
            bonus = 0.05 * getSale();
        }else if (getSale() < 20000000){
            bonus = 0.1 * getSale();
        }else
            bonus = 0.2 * getSale();
        return bonus;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        if (sale < 0)
            System.out.println("Invalid!");
        else
            this.sale = sale;
    }

    @Override
    public double tinhLuong() {
        return ((getBaseSalary() *getCoefficientsSalary()) + (getSale() ));
    }

    @Override
    public void xuatThongTinNV() {
        super.xuatThongTinNV();
        System.out.println("Thong tin NV Marketing: ");
        System.out.println("Tên: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Luong co ban: " + getSalary());
        System.out.println("Tham nien: " + this.yow);
        System.out.println("Bac Luong: " + this.coefficientsSalary);
        System.out.println("Doanh so: " + getSale());
    }

}
