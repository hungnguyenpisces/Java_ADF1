package Session4.Assignment;

import java.util.Scanner;

public class MultiCalculator {
    protected int num1, num2;
    Scanner sc = new Scanner(System.in);

    public MultiCalculator() {
        super();
    }

    public MultiCalculator(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void inputNums() {
        System.out.printf("\nInput num1: ");
        this.num1 = sc.nextInt();
        System.out.printf("Input num2: ");
        this.num2 = sc.nextInt();
    }

    public double addition() {
        double result = num1 + num2;
        return result;
    }

    public double subtraction() {
        double result = num1 - num2;
        return result;
    }

    public double multiplication() {
        double result = num1 * num2;
        return result;
    }

    public double division() {
        double result = num1 / num2;
        return result;
    }

    public double exponent() {
        double result = Math.pow(num1, num2);
        return result;
    }

    @Override
    public String toString() {
        int result = num1 % num2;
        if (result != 0) {
            return num2 + " is not a divisor of " + num1;
        } else {
            return num2 + " is the divisor of " + num1;
        }
    }
}
