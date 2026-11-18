package org.example.Homework.hw15.products.business;

import org.example.Homework.hw15.products.Laptop;

public abstract class BusinessLaptop extends Laptop {

    protected BusinessLaptop(String name, int price, int quantity, int ram) {
        super(name, price, quantity, ram);
    }

    @Override
    public int getWarrantyMonths() {
        return 36;
    }
}
