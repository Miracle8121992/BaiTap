package Lab6;

public class PhuongTrinh {
    private float a;
    private float b;
    private float c;

    public PhuongTrinh (float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float timDelta(){
        return (b * b) - 4 *a * c;
    }
    public void giaiPhuongTrinh(){
        double x, x1, x2;
        if (timDelta() < 0)
            System.out.println("PTVN");
        if (timDelta() == 0)
            x = (-b/(2 * a));
            System.out.println("PT có nghiệm kép: " );
        if (timDelta() > 0)
            x1 = ((-b + Math.sqrt(timDelta()))/2 * a);
            x2 = ((-b - Math.sqrt(timDelta()))/2 * a);
            System.out.println("PT có 2 nghiệm pb: " + x1 + x2);
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}
