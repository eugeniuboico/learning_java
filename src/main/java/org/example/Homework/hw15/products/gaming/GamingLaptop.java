package org.example.Homework.hw15.products.gaming;

import org.example.Homework.hw15.products.Laptop;

public abstract class GamingLaptop extends Laptop {

    protected GamingLaptop(String name, int price, int quantity, int ram) {
        super(name, price, quantity, ram);
    }

    @Override
    public int getWarrantyMonths() {
        return 24;
    }
}
