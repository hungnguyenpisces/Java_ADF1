package Session9.Assignment.Shape;

import java.util.Scanner;

public class Rectangle implements IShape, IShapeContent {
    private String name;
    private double chieuDai, chieuRong;
    Scanner sc = new Scanner(System.in);

    public Rectangle() {
        super();
    }

    public Rectangle(String name, double chieuDai, double chieuRong) {
        super();
        this.name = name;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public String getName() {
        return this.name = "Rectangle";
    }

    public void setName(String name) {
        this.name = "Rectangle";
    }

    public double getChieuDai() {
        return this.chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return this.chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void nhapRectangle() {
        do {
            System.out.print("\nNhap chieu dai: ");
            this.chieuDai = sc.nextDouble();
            System.out.print("\nNhap chieu rong: ");
            this.chieuRong = sc.nextDouble();
        } while (this.chieuDai <= 0 || this.chieuRong <= 0);
    }

    @Override
    public void desc() {
        System.out.println("Hinh chu nhat la hinh tu giac co 2 cap canh song song bang nhau");
    }

    @Override
    public double area() {
        double dientich = this.chieuDai * this.chieuRong;
        return dientich;
    }

    @Override
    public double perimeter() {
        double chuvi = 2 * (this.chieuDai + this.chieuRong);
        return chuvi;
    }

    @Override
    public String toString() {
        return getName() + ": { chieuDai = '" + getChieuDai() + "'; chieuRong = '" + getChieuRong() + "'; chu vi = '"
                + perimeter() + "'; dien tich = '" + area() + "}";
    }

}
