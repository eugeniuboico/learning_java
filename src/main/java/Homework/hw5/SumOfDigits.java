package Homework.hw5;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Expected true. Result: " + (sumOfDigits(123) == 6));
        System.out.println("Expected true. Result: " + (sumOfDigits(7) == 7));
        System.out.println("Expected true. Result: " + (sumOfDigits(0) == 0));
        System.out.println("Expected true. Result: " + (sumOfDigits(1000) == 1));
        System.out.println("Expected true. Result: " + (sumOfDigits(999) == 27));
        System.out.println("Expected true. Result: " + (sumOfDigits(-123) == 6));
        System.out.println("Expected true. Result: " + (sumOfDigits(10) == 1));
        System.out.println("Expected true. Result: " + (sumOfDigits(505) == 10));
        System.out.println("Expected true. Result: " + (sumOfDigits(99) == 18));
        System.out.println("Expected true. Result: " + (sumOfDigits(-5) == 5));
        System.out.println("Expected true. Result: " + (sumOfDigits(2147483647) == 46));
        System.out.println("Expected true. Result: " + (sumOfDigits(-2147483648) == 47));
    }

    public static int sumOfDigits(int n) {
        String s = String.valueOf(n);
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
}
