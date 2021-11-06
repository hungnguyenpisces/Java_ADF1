package Session3.Assignment;

import java.util.Scanner;

public class NghichDao {
    public static void main(String[] args) {
        System.out.println("\n----------- +- nghich dao cua n------------");
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 1, pre = -1;
        double result = 0;
        do {
            System.out.println("nhap so nguyen duong n");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();
        for (; i <= n; i++) {
            result += 1 / (double) i;
        }
        System.out.printf("\n(for loop) Tong nghich dao cua %d la: %5.10f", n, result);
        i = 1;
        result = 0;
        while (i <= n) {
            result += 1 / (double) i;
            i++;
        }
        System.out.printf("\n(while loop) Tong nghich dao cua %d la: %5.10f", n, result);
        i = 1;
        result = 0;
        do {
            result += 1 / (double) i;
            i++;
        } while (i <= n);
        System.out.printf("\n(do...while loop) Tong nghich dao cua %d la: %5.10f", n, result);
        i = 1;
        result = 0;
        for (; i <= n; i++) {
            pre *= -1;
            result += pre * (1 / (double) i);
        }
        System.out.printf("\n(for loop) +- nghich dao cua %d la: %5.10f", n, result);
    }
}
