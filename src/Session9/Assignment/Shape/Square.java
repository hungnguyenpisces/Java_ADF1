package Session9.Assignment.Shape;

import java.util.Scanner;

public class Square implements IShape, IShapeContent {
    private String name;
    private double canh;
    Scanner sc = new Scanner(System.in);

    public Square() {
        super();
    }

    public Square(String name, double canh) {
        super();
        this.name = name;
        this.canh = canh;
    }

    @Override
    public String getName() {
        return this.name = "Square";
    }

    public void setName(String name) {
        this.name = "Square";
    }

    public double getCanh() {
        return this.canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public void nhapSquare() {
        do {
            System.out.print("\nNhap do dai canh hinh vuong: ");
            this.canh = sc.nextDouble();
        } while (this.canh < 0);
    }

    @Override
    public void desc() {
        System.out.println("Hinh vuong la hinh tu giac co 4 canh bang nhau");
    }

    @Override
    public double area() {
        double dientich = this.canh * this.canh;
        return dientich;
    }

    @Override
    public double perimeter() {
        double chuvi = this.canh * 4;
        return chuvi;
    }

    @Override
    public String toString() {
        return getName() + ": { chieu dai canh = '" + getCanh() + "'; chu vi = '" + perimeter() + "'; dien tich = '"
                + area() + "}";
    }

}
