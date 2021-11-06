package Session9.Assignment.Shape;

import java.util.Scanner;

public class Circle implements IShape, IShapeContent {
    private String name;
    private double banKinh;
    Scanner sc = new Scanner(System.in);

    public Circle() {
        super();
    }

    public Circle(String name, double banKinh) {
        super();
        this.name = name;
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return this.banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String getName() {
        return this.name = "Circle";
    }

    public void setName(String name) {
        this.name = "Circle";
    }

    public void nhapCircle() {
        do {
            System.out.print("\nNhap ban kinh hinh tron: ");
            this.banKinh = sc.nextDouble();
        } while (this.banKinh < 0);
    }

    @Override
    public void desc() {
        System.out.println("Hinh tron la tap hop cac diem cach tam 1 khoang cach <= ban kinh");
    }

    @Override
    public double area() {
        double dientich = Math.PI * this.banKinh * this.banKinh;
        return dientich;
    }

    @Override
    public double perimeter() {
        double chuvi = Math.PI * this.banKinh * 2;
        return chuvi;
    }

    @Override
    public String toString() {
        return getName() + ": { banKinh = '" + getBanKinh() + "'; chu vi = '" + perimeter() + "'; dien tich = '"
                + area() + "' }";
    }

}
