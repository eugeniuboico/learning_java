package org.example.Homework.hw18.e3;

import java.sql.SQLOutput;

public class Main {
    public static void readAge(String input) {
        try {
            System.out.println("reading: " + input);
            int age = Integer.parseInt(input);
            System.out.println("success, age is " + age);

        }catch (NumberFormatException e) {
            System.out.println("error " + input + " is not a number!");
        } finally {
            // finally is executed always, is used for cleaning.
            // The only one exception is if the program is offed by System.exit()
            System.out.println("finished reading");
        }
    }

    public static void main(String[] args) {
        readAge("25");
        readAge("abc");
        readAge("");
    }
}
