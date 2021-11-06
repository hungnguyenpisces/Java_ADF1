package Session4.Assignment;

import java.util.Scanner;

public class HinhTron {
    protected int bk;
    Scanner sc = new Scanner(System.in);

    public HinhTron() {
    }

    public HinhTron(int bk) {
        this.bk = bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    public int getBk() {
        return bk;
    }

    public void inputShape() {
        System.out.println("Nhap do dai ban kinh hinh tron:");
        System.out.printf("ban kinh: ");
        this.bk = sc.nextInt();
    }

    @Override
    public String toString() {
        double chuvi = Math.PI * bk * bk;
        double dientich = Math.PI * 2 * bk;
        return "Hinh tron voi ban kinh " + bk + "\nChu vi = " + chuvi + "\nDien tich = " + dientich;
    }
}
