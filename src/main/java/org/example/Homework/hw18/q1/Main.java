package org.example.Homework.hw18.q1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void check(String testName, Object expected, Object actual) {
        String result = expected.equals(actual) ? "PASS" : "FAIL";
        System.out.println(result + " | " + testName + " | expected: " + expected + ", actual: " + actual);
    }

    public static void main(String[] args) {
        Donor d1 = new Donor("Ion Pop", "1990101123456");
        Donor d2 = new Donor("Pop Ion", "1990101123456");
        Donor d3 = new Donor("Maria Ionescu", "2950505654321");

        check("same CNP", true, d1.equals(d2));
        check("different CNP", false, d1.equals(d3));
        check("equals(null)", false, d1.equals(null));

        Set<Donor> donors = new HashSet<>();
        donors.add(d1);
        donors.add(d2);
        donors.add(d3);
        check("HashSet size", 2, donors.size());
        System.out.println("Set contents: " + donors);
    }
}
