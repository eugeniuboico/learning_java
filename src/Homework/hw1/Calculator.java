package Homework.hw1;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number");
        double first = scanner.nextInt();
        scanner.nextLine(); // nu am inteles de ce am pus asta, dar fara nu functioneaza, sare peste pasul cu operatorul dupa primul numar
        System.out.println("Operator(+, -, *, /)");
        String operator = scanner.nextLine();
        System.out.println("Second Number");
        double second = scanner.nextInt();

        if(operator.equals("+")) {
            System.out.println(first + second);
        }else if(operator.equals("-")) {
            System.out.println(first - second);
        }else if(operator.equals("*")) {
            System.out.println(first * second);
        }else if(operator.equals("/")) {
            System.out.println(first / second);
        }

    }
}
