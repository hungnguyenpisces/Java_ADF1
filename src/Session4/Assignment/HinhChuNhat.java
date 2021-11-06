package Session4.Assignment;

import java.util.Scanner;

public class HinhChuNhat {
    protected int dai, rong;
    Scanner sc = new Scanner(System.in);

    public HinhChuNhat() {
    }

    public HinhChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getDai() {
        return dai;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getRong() {
        return rong;
    }

    public void inputShape() {
        System.out.println("Nhap do dai 2 canh hinh chu nhat:");
        System.out.printf("chieu dai: ");
        this.dai = sc.nextInt();
        System.out.printf("chieu rong: ");
        this.rong = sc.nextInt();
    }

    @Override
    public String toString() {
        double chuvi = (dai + rong) * 2;
        double dientich = dai * rong;
        return "Hinh chu nhat voi chieu dai: " + dai + "; chieu rong: " + rong + "\nChu vi = " + chuvi
                + "\nDien tich = " + dientich;
    }
}
