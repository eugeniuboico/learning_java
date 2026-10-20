package Homework.hw5;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Expected true. Result: " + (fizzBuzz(1) == "1"));
        System.out.println("Expected true. Result: " + (fizzBuzz(3) == "Fizz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(5) == "Buzz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(15) == "FizzBuzz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(30) == "FizzBuzz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(98) == "98"));
        System.out.println("Expected true. Result: " + (fizzBuzz(2) == "2"));
        System.out.println("Expected true. Result: " + (fizzBuzz(9) == "Fizz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(25) == "Buzz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(45) == "FizzBuzz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(13) == "13"));
        System.out.println("Expected true. Result: " + (fizzBuzz(100) == "Buzz"));
        System.out.println("Expected true. Result: " + (fizzBuzz(0) == "0"));
        System.out.println("Expected true. Result: " + (fizzBuzz(-15) == "FizzBuzz"));


        System.out.println("now from 1 to 100 with for: ");
        for (int i = 1; i < 101; i++) {
            System.out.println(fizzBuzz(i));
        }

        System.out.println("now from 1 to 100 with while:");
        int i = 1;
        while (i < 101) {
            System.out.println(fizzBuzz(i));
            i++;
        }

        System.out.println("now from 1 to 100 with do while:");
        i = 1;
        do {
            System.out.println(fizzBuzz(i));
            i++;
        } while (i < 101);
    }

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }else if (n % 3 == 0) {
            return "Fizz";
        }else if (n % 5 == 0) {
            return "Buzz";
        }else {
            return String.valueOf(n);
        }
    }
}
