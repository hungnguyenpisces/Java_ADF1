package Session2;

import java.util.Scanner;

public class GiaiPTBac1 {
    public static void main(String[] args) {
        System.out.println("Gai phuong trinh bac 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hs a");
        int a = sc.nextInt();
        System.out.println("Nhap hs b");
        int b = sc.nextInt();
        // toan tuw 3 ngoi : dk1 ? (vao day neu dk1 true): (vao day neu dk1 false)
        String result = (a == 0) ? ((b == 0 ? "PT vo so nghiem" : "PT vo nghiem"))
                : ("PT co 1 nghiem: " + -b / (double) a);
        System.out.println("Ket qua: " + result);
        sc.close();
    }
}
