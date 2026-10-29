package Homework.hw1;

import java.util.Scanner;

public class EvenOrOdd {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(evenOrOdd(4 ).equals("even"));
        System.out.println(evenOrOdd(7 ).equals("odd"));
        System.out.println(evenOrOdd(0 ).equals("even"));
        System.out.println(evenOrOdd(-4).equals("even"));
        System.out.println(evenOrOdd(-3).equals("odd"));
        System.out.println(evenOrOdd(-1).equals("odd"));
        System.out.println(evenOrOdd(2147483647).equals("odd"));
        System.out.println(evenOrOdd(-2147483648).equals("even"));
        System.out.println(evenOrOdd(4.0).equals("even"));
    }

    public static String evenOrOdd(double number) {
        if(number % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }
}
