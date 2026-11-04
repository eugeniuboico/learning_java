package Homework.hw1;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(calculate(2, "+", 3) == 5.0);
        System.out.println(calculate(5, "-", 10) == -5.0);
        System.out.println(calculate(4, "*", 2.5) == 10.0);
        System.out.println(calculate(7, "/", 2) == 3.5);
        System.out.println(calculate(10, "/", 0) == 0);
        System.out.println(calculate(0, "/", 0) == 0);
        System.out.println(calculate(-10, "/", 0) == 0);
        System.out.println(calculate(0, "*", -5) == 0.0);
        System.out.println(calculate(0.1, "+", 0.2) == 0.3);
    }

    public static double calculate(double first, String operator, double second) {
        if(operator.equals("+")) {
            return first + second;
        }else if(operator.equals("-")) {
            return first - second;
        }else if(operator.equals("*")) {
            return first * second;
        }else{
                return first / second;
        }
    }
}
