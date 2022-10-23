package Lab8;

public class Car implements IActionable {
    private String name, producer, year;
    private float seat, price;

    public Car (String name, String producer, String year, float seat, float price){
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public float getSeat() {
        return seat;
    }
    public String getProducer() {
        return producer;
    }
    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setSit(float seat) {
        this.seat = seat;
    }
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public double calculateTax() {
       double tax;
        if (getSeat() < 7)
            tax = getPrice() * 0.6;
        else
            tax = getPrice() * 0.7;
        return tax;
    }

    @Override
    public void calculatePrice() {
        double sum = getPrice() + calculateTax();
    }

    @Override
    public void getInfor() {
        System.out.println(getName() + " Car produced by " + getProducer() + " in " + getYear() +
                            " has " + getSeat() + " seats with the total price is " + getPrice() + "$.");
    }
}
