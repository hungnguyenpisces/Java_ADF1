package Session3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("-----------Calculator---------");
        Scanner sc = new Scanner(System.in);
        int choose, num1, num2;
        String confirm = "";
        do {
            System.out.println("Chon phep toan:");
            System.out.println("1: Phep cong");
            System.out.println("2: Phep tru");
            System.out.println("3: Phep nhan");
            System.out.println("4: Phep chia");
            System.out.println("5: Phep chia lay so du");
            System.out.println("6: Phep luy thua");
            System.out.println("7: Thoat");

            System.out.println("nhap so thu nhat");
            num1 = sc.nextInt();
            System.out.println("nhap so thu hai");
            num2 = sc.nextInt();

            for (;;) {
                System.out.println("lua chon phep tinh (1-7)");
                choose = sc.nextInt();
                if (choose >= 1 && choose <= 7) {
                    break;
                }
            }

            switch (choose) {
                case 1:
                    int tong = num1 + num2;
                    System.out.println("Tong 2 so vua nhap la:" + tong);
                    break;
                case 2:
                    int hieu = num1 - num2;
                    System.out.println("Hieu 2 so vua nhap la:" + hieu);
                    break;
                case 3:
                    int tich = num1 * num2;
                    System.out.println("Tich 2 so vua nhap la:" + tich);
                    break;
                case 4:
                    for (; num2 == 0;) {
                        System.out.println("Khong the chia cho so " + num2);
                        System.out.println("Vui long nhap lai so thu 2:");
                        num2 = sc.nextInt();
                    }
                    float thuong = num1 / (float) num2;
                    System.out.println("Thuong 2 so vua nhap la: " + thuong);
                    break;
                case 5:
                    for (; num2 == 0;) {
                        System.out.println("Khong the chia cho so " + num2);
                        System.out.println("Vui long nhap lai so thu 2:");
                        num2 = sc.nextInt();
                    }
                    float du = num1 % num2;
                    System.out.println("Thuong 2 so vua nhap du la: " + du);

                    break;
                case 6:
                    double luyThua = Math.pow(num1, num2);
                    System.out.println("Luy thua 2 so vua nhap la:" + luyThua);
                    break;
                case 7:
                    System.exit(1);
            }

            sc.nextLine();
            System.out.println("Ban muon tiep tuc khong? (Y/N)");
            confirm = sc.nextLine();
        } while (confirm.equalsIgnoreCase("y"));

        sc.close();
    }
}
