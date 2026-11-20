package org.example.Homework.hw15.products.ultrabooks;

import org.example.Homework.hw15.products.Laptop;

public abstract class Ultrabook extends Laptop {

    protected Ultrabook(String name, int price, int quantity, int ram) {
        super(name, price, quantity, ram);
    }

    @Override
    public int getWarrantyMonths() {
        return 24;
    }
}
