package org.example.Homework.hw18.q2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("LAP-001", "Laptop Dell", 3500, 10);
        Product p2 = new Product("LAP-001", "Laptop Dell", 3200, 4);

        BadProduct b1 = new BadProduct("LAP-001", "Laptop Dell");
        BadProduct b2 = new BadProduct("LAP-001", "Laptop Dell");

        System.out.println("equals: p1 vs p2 = " + p1.equals(p2));
        System.out.println("equals: b1 vs b2 = " + b1.equals(b2));


        Set<BadProduct> badSet = new HashSet<>();
        badSet.add(b1);
        badSet.add(b2);
        System.out.println("\nWITHOUT hashCode, size = " + badSet.size() + " -> " + badSet);


        Set<Product> goodSet = new HashSet<>();
        goodSet.add(p1);
        goodSet.add(p2);
        System.out.println("WITH hashCode,    size = " + goodSet.size() + " -> " + goodSet);
    }
}
