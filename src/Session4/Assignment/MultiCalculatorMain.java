package Session4.Assignment;

import java.util.Scanner;

public class MultiCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiCalculator calculate = new MultiCalculator();
        calculate.inputNums();
        System.out.println("----------Select calculation----------");
        System.out.println(
                "1. Addition (+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)\n5. Exponentiation(^)");
        int select;
        do {
            System.out.printf("choose: ");
            select = sc.nextInt();
        } while (select <= 0 || select > 5);
        switch (select) {
            case 1:
                System.out.println("Result: " + calculate.addition());
                break;
            case 2:
                System.out.println("Result: " + calculate.subtraction());
                break;
            case 3:
                System.out.println("Result: " + calculate.multiplication());
                break;
            case 4:
                for (; calculate.num2 == 0;) {
                    System.out.println("can't division for 0");
                    System.out.println("Input num2: ");
                    calculate.num2 = sc.nextInt();
                }
                System.out.println("Result: " + calculate.division());
                break;
            case 5:
                System.out.println("Result: " + calculate.exponent());
                break;
            default:
                break;
        }
        System.out.println(calculate);
        sc.close();
    }
}
