package Homework.hw1;

import java.util.Scanner;

public class InvestingCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(calculator(1000, 5,1) == 50.0);
        System.out.println(calculator(1050, 5, 1) == 52.5);
        System.out.println(calculator(1000, 3.5, 2) == 70.0);
        System.out.println(calculator(1000, 5, 1.5) == 75.0);
        System.out.println(calculator(999.99, 5, 1) == 50.0);
        System.out.println(calculator(10000000, 10, 30) == 30000000.0);
        System.out.println(calculator(1000, 0, 5) == 0.0);
        System.out.println(calculator(1000, 5, 0) == 0.0);
        System.out.println(calculator(-1000, 5, 1));
        System.out.println(calculator(1000, -5, 1));
        System.out.println(calculator(1000, 0.05, 1) == 0.5);
    }
    public static double calculator(double amount, double rate, double time) {
        rate = rate / 100;
        return amount * rate * time;
    }
}
