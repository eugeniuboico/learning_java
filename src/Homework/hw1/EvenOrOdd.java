package Homework.hw1;

import java.util.Scanner;

public class EvenOrOdd {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number and i will tell you if is even o odd");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }
    }
}
