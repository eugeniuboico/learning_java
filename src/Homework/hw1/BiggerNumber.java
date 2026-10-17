package Homework.hw1;

import java.util.Scanner;

public class BiggerNumber {
    static void main() {
        System.out.println("Expected true. Result: " + (biggerOfThree(1,2,3) == 3));
        System.out.println("Expected true. Result: " + (biggerOfThree(2,3,1) == 3));
        System.out.println("Expected true. Result: " + (biggerOfThree(3,1,2) == 3));
        System.out.println("Expected true. Result: " + (biggerOfThree(3,2,1) == 3));
        System.out.println("Expected true. Result: " + (biggerOfThree(5,5,5) == 5));
        System.out.println("Expected true. Result: " + (biggerOfThree(5,1,5) == 5));
        System.out.println("Expected true. Result: " + (biggerOfThree(5,5,1) == 5));
        System.out.println("Expected true. Result: " + (biggerOfThree(-1,-2,-3) == -1));
        System.out.println("Expected true. Result: " + (biggerOfThree(2147483647,0,-1) == 2147483647));
    }

    public static int biggerOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

}
