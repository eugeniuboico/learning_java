package Homework.hw5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Expected true. Result: " + (tableLine(7, 1) == "7 x 1 = 7"));
        System.out.println("Expected true. Result: " + (tableLine(7, 10) == "7 x 10 = 70"));
        System.out.println("Expected true. Result: " + (tableLine(1, 10) == "1 x 10 = 10"));
        System.out.println("Expected true. Result: " + (tableLine(0, 5) == "0 x 5 = 0"));
        System.out.println("Expected true. Result: " + (tableLine(7, 2) == "7 x 2 = 14"));
        System.out.println("Expected true. Result: " + (tableLine(12, 10) == "12 x 10 = 120"));
        printTable(7);
        System.out.println("Expected true. Result: " + (tableLine(214748365, 10) == "214748365 x 10 = 214783650"));
//        System.out.println(tableLine(-3, 2) / printTable(-3));


        Scanner scanner = new Scanner(System.in);
        System.out.println("write a number in terminal: ");
        int n = scanner.nextInt();
        printTable(n);
    }

    public static String tableLine(int n, int i) {
        return n + " x " + i + " = " + (n * i);
    }

    public static void printTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(tableLine(n, i));
        }
    }
}
