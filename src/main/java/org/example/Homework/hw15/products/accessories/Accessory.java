package org.example.Homework.hw15.products.accessories;

import org.example.Homework.hw15.products.Product;

public abstract class Accessory extends Product {

    protected Accessory(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public int getWarrantyMonths() {
        return 6;
    }
}
