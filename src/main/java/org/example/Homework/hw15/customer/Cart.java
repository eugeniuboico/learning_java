package org.example.Homework.hw15.customer;

import org.example.Homework.hw15.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> items = new ArrayList<>();

    public void add(Product product) {
        items.add(product);
        System.out.println("Cart: added " + product.getName());
    }

    public int getTotal() {
        int total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
