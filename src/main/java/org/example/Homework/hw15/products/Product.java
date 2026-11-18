package org.example.Homework.hw15.products;

import org.example.Homework.hw15.behavior.Restockable;
import org.example.Homework.hw15.behavior.Sellable;

public abstract class Product implements Sellable, Restockable {

    private final String name;
    private final int price;
    private int quantity;

    protected Product(String name, int price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be > 0: " + price);
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0: " + quantity);
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean sell() {
        if (quantity == 0) {
            System.out.println(name + ": out of stock");
            return false;
        }
        quantity--;
        System.out.println(name + ": sold [" + quantity + " left]");
        return true;
    }

    @Override
    public void restock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be > 0: " + amount);
        }
        quantity += amount;
        System.out.println(name + ": restocked [" + quantity + " in stock]");
    }

    public void describe() {
        System.out.println(name + ": " + price + "$, warranty " + getWarrantyMonths() + " months");
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public abstract int getWarrantyMonths();

    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getQuantity() { return quantity; }
}
