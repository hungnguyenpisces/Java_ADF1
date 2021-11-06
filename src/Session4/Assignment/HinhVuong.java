package Session4.Assignment;

import java.util.Scanner;

public class HinhVuong {
    protected int a;
    Scanner sc = new Scanner(System.in);

    public HinhVuong() {
    }

    public HinhVuong(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void inputShape() {
        System.out.println("Nhap do dai canh hinh vuong:");
        System.out.printf("canh a: ");
        this.a = sc.nextInt();
    }

    @Override
    public String toString() {
        float chuvi = a * 4;
        float dientich = a * a;
        return "Hinh vuong voi chieu dai canh la " + a + "\nChu vi = " + chuvi + "\nDien tich = " + dientich;
    }
}
