package Homework.hw1;

import java.util.Scanner;

public class InvestingCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets calculate how match you can make, write your starting amount");
        int amount = scanner.nextInt();
        System.out.println("Write the annual interest rate(1-100)");
        double rate = scanner.nextDouble();
        System.out.println("write the time in years");
        int time = scanner.nextInt();
        rate = rate / 100;
        System.out.println("After " + time + " year(s) you will receive: " + (amount * rate * time + amount));

    }
}
