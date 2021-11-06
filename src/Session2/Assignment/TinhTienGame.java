package Session2.Assignment;

import java.util.Scanner;

public class TinhTienGame {
    public static void main(String[] args) {
        System.out.println("\n\n--------Game payment---------\n");
        System.out.println("\nInput time check in:");
        Scanner sc = new Scanner(System.in);
        int checkIn = sc.nextInt();
        System.out.println("\nInput time checkout:");
        int checkOut = sc.nextInt();
        int totalTime = checkOut - checkIn;
        if (totalTime <= 0) {
            System.out.println("\nInput ERROR\n");
        } else if (totalTime < 18) {
            System.out.printf("\nTotal time: %dh, price 3k/1h\n", totalTime);
            int bill = totalTime * 3000;
            System.out.printf("\nYour bill: %d\n", bill);
        } else {
            System.out.printf("\nTotal time: %dh, price 2.5k/1h\n", totalTime);
            int bill = totalTime * 2500;
            System.out.printf("\nYour bill: %d\n", bill);
        }
        sc.close();
    }
}
