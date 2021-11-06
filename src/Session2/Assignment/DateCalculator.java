package Session2.Assignment;

import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args) {
        System.out.println("\n---------Date calculator---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month:");
        int month = sc.nextInt();
        System.out.println("Input year:");
        int year = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Input month ERROR");
        } else {
            switch (month) {
                case 1:
                    System.out.printf("\nJanuary in year %d has 31 days.", year);
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.printf("February in year %d has 29 days", year);
                    } else {
                        System.out.printf("February in year %d has 28 days", year);
                    }
                    break;
                case 3:
                    System.out.printf("\nMarch in year %d has 31 days.", year);
                    break;
                case 4:
                    System.out.printf("\nApril in year %d has 30 days", year);
                    break;
                case 5:
                    System.out.printf("\nMay in year %d has 31 days.", year);
                    break;
                case 6:
                    System.out.printf("\nJune in year %d has 30 days", year);
                    break;
                case 7:
                    System.out.printf("\nJuly in year %d has 31 days.", year);
                    break;
                case 8:
                    System.out.printf("\nAugust in year %d has 31 days.", year);
                    break;
                case 9:
                    System.out.printf("\nSeptember in year %d has 30 days", year);
                    break;
                case 10:
                    System.out.printf("\nOctober in year %d has 31 days.", year);
                    break;
                case 11:
                    System.out.printf("\nNovember in year %d has 30 days", year);
                    break;
                case 12:
                    System.out.printf("\nDecember in year %d has 31 days.", year);
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
