package Homework.hw1;

import java.util.Scanner;

public class TemperatureConverter {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the temperature");
        int temp = scanner.nextInt();
        System.out.println("Convert to Celsius or Fahrenheit? write C or F");
        String convTo = scanner.next();

        if (convTo.equals("C") || convTo.equals("c")) {
            System.out.println(temp + "F is: " + ((temp - 32) * 5 / 9) + "C");
        } else if(convTo.equals("F") || convTo.equals("f")) {
            System.out.println(temp + "C is: " + (temp * 9 / 5 + 32) + "F");
        }
    }
}
