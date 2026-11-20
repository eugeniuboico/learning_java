package org.example.Homework.hw15.customer;

import org.example.Homework.hw15.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private int budget;
    private final Cart cart = new Cart();   // the customer HAS A cart

    public Customer(String name, int budget) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        if (budget < 0) {
            throw new IllegalArgumentException("Budget must be >= 0: " + budget);
        }
        this.name = name;
        this.budget = budget;
    }

    public void addToCart(Product product) {
        if (!product.isAvailable()) {
            System.out.println(name + ": " + product.getName() + " is not available");
            return;
        }
        cart.add(product);
    }

    public Order checkout() {
        if (cart.isEmpty()) {
            System.out.println(name + ": the cart is empty");
            return null;
        }
        int total = cart.getTotal();
        if (total > budget) {
            System.out.println(name + ": not enough money (" + budget + "$ < " + total + "$)");
            return null;
        }

        List<String> bought = new ArrayList<>();
        int paid = 0;
        for (Product product : cart.getItems()) {
            if (product.sell()) {
                bought.add(product.getName());
                paid += product.getPrice();
            }
        }
        budget -= paid;
        cart.clear();
        return new Order(name, bought, paid);
    }

    public String getName() { return name; }
    public int getBudget() { return budget; }

    @Override
    public String toString() {
        return name + " (budget " + budget + "$)";
    }
}
