package Session4.Assignment;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("\n-----Tinh chu vi & dien tich hinh hoc------");
        System.out.println("\n1. Hinh tam giac\n2. Hinh vuong\n3. Hinh tron\n4. Hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        while (choose <= 0 || choose > 4) {
            System.out.printf("chon chuong trinh: ");
            choose = sc.nextInt();
        }
        switch (choose) {
            case 1:
                HinhTamGiac tamgiac = new HinhTamGiac();
                tamgiac.inputShape();
                System.out.println(tamgiac);
                break;
            case 2:
                HinhVuong vuong = new HinhVuong();
                vuong.inputShape();
                System.out.println(vuong);
                break;
            case 3:
                HinhTron tron = new HinhTron();
                tron.inputShape();
                System.out.println(tron);
                break;
            case 4:
                HinhChuNhat chunhat = new HinhChuNhat();
                chunhat.inputShape();
                System.out.println(chunhat);
                break;

            default:
                break;
        }
        sc.close();
    }
}
