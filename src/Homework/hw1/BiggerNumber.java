package Homework.hw1;

import java.util.Scanner;

public class BiggerNumber {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a >= b && a >= c) {
            System.out.println(a + " mai mare");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " mai mare");
        }
        else if (c >= b && c >= a) {
            System.out.println(b + " mai mare");
        }
    }
}
