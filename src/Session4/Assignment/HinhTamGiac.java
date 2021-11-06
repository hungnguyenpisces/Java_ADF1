package Session4.Assignment;

import java.util.Scanner;

public class HinhTamGiac {
    protected int a, b, c;
    Scanner sc = new Scanner(System.in);

    public HinhTamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public HinhTamGiac() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void inputShape() {
        System.out.println("Nhap do dai 3 canh tam giac:");
        System.out.printf("canh a: ");
        this.a = sc.nextInt();
        System.out.printf("canh b: ");
        this.b = sc.nextInt();
        System.out.printf("canh c: ");
        this.c = sc.nextInt();
    }

    @Override
    public String toString() {
        String result = "";
        if (a + b > c && a + c > b && b + c > a) {
            double p, chuvi, dientich;
            p = (a + b + c) / (double) 2;
            chuvi = (a + b + c);
            dientich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            result = "Hinh tam giac voi 3 canh vua nhap: " + a + ", " + b + ", " + c + "\nChu vi = " + chuvi
                    + "\nDien tich = " + dientich;
        } else {
            result = "3 canh vua nhap khong the tao thanh 1 tam giac";
        }

        return result;
    }
}
