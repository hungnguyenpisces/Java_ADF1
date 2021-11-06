package Session2.Assignment;

import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        System.out.println("-----------Giai phuong trinh bac 2-----------");
        System.out.println("----------ax^2 + bx + c = 0--------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        System.out.println("Nhap c:");
        int c = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.printf("\nphuong trinh co vo so nghiem\n");
                } else {
                    System.out.printf("\nphuong trinh vo nghiem 1\n");
                }
            } else {
                float x;
                x = -c / (float) b;
                System.out.printf("\nphuong trinh co nghiem x = %f\n", x);
            }
        } else {
            double d, x2, x1;
            d = (((double) b * b) - (4 * (double) a * c));
            if (d < 0) {
                System.out.printf("\nphuong trinh vo nghiem 2\n");
            } else {
                if (d == 0) {
                    x1 = x2 = -b / (2 * a);
                    System.out.printf("\nnghiem cua phuong trinh la %f\n", x1);
                } else {
                    x1 = (-b - Math.sqrt(d)) / (2 * a);
                    x2 = (-b + Math.sqrt(d)) / (2 * a);
                    System.out.printf("\nphuong trinh co nghiem\n");
                    System.out.printf("\nx1 = %f\n", x1);
                    System.out.printf("\nx2 = %f\n", x2);
                }
            }

        }
        sc.close();
    }
}
