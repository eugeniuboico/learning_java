package Homework.hw1;

import java.util.Scanner;

public class TemperatureConverter {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(tempCalculator(0) == 32.0);
        System.out.println(tempCalculator(100) == 212.0);
        System.out.println(tempCalculator(-40) == -40.0);
        System.out.println(tempCalculator(37) == 98.6);
        System.out.println(tempCalculator(36.6) == 97.88000000000001);
        System.out.println(tempCalculator(-273.15) == -459.66999999999996);
        System.out.println(tempCalculator(-274));
    }

    public static double tempCalculator(double tempInC) {
        return tempInC * 9 / 5 + 32;
    }
}
