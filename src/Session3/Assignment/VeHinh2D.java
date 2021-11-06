package Session3.Assignment;

import java.util.Scanner;

public class VeHinh2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ve hinh tam giac can
        int row = 0;
        do {
            System.out.printf("\n\nnhap chieu cao tam giac can:");
            row = sc.nextInt();
        } while (row <= 0);
        System.out.println("----------Ve tam giac can------------\n");
        int space = row;
        for (int i = 0; i < row; i++) {
            System.out.printf("\t");
            for (int j = space; j > 0; j--) {
                System.out.printf(" ");
            }
            space--;
            for (int pen = row - space; pen > 0; pen--) {
                System.out.printf("X ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        sc.nextLine();
        // ve hinh chu nhat
        int dai = 0, rong = 0;
        do {
            System.out.printf("\nnhap chieu dai hinh chu nhat:");
            dai = sc.nextInt();
        } while (dai <= 0);
        do {
            System.out.printf("\nnhap chieu rong hinh chu nhat:");
            rong = sc.nextInt();
        } while (rong <= 0);
        System.out.println("\n----------Ve hinh chu nhat-----------\n");
        for (int i = 0; i <= rong; i++) {
            System.out.printf("\t");
            for (int j = 0; j <= dai; j++) {
                System.out.printf("X ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");

        sc.close();
    }
}
