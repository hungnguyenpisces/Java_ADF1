package Session9.Assignment.Shape;

import java.util.Scanner;

public class Triangle implements IShape, IShapeContent {
    private String name;
    private double a, b, c;
    Scanner sc = new Scanner(System.in);

    public Triangle() {
        super();
    }

    public Triangle(String name, double a, double b, double c) {
        super();
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getName() {
        return this.name = "Triangle";
    }

    public void setName(String name) {
        this.name = "Triangle";
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void nhapTriangle() {
        do {
            System.out.println("nhap do dai 3 canh cua tam giac:");
            System.out.print("\ncanh a: ");
            this.a = sc.nextDouble();
            System.out.print("\ncanh b: ");
            this.b = sc.nextDouble();
            System.out.print("\ncanh c: ");
            this.c = sc.nextDouble();
        } while (!(this.a + this.b > this.c && this.a + this.c > this.b && this.b + this.c > this.a));
    }

    @Override
    public void desc() {
        System.out.println("Hinh tam giac la hinh co 3 canh hop thanh 3 goc co tong la 180 do");
    }

    @Override
    public double area() {
        double p, dientich;
        p = (this.a + this.b + this.c) / 2;
        dientich = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return dientich;
    }

    @Override
    public double perimeter() {
        double chuvi = this.a + this.b + this.c;
        return chuvi;
    }

    @Override
    public String toString() {
        return getName() + ": { tam co 3 canh: '" + getA() + ", " + getB() + ", " + getC() + "'; chu vi = '" + perimeter()
                + "'; dien tich = '" + area() + "''}";
    }

}
