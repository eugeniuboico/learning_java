package org.example.Homework.hw15.products;

public abstract class Laptop extends Product {

    private final int ram;

    protected Laptop(String name, int price, int quantity, int ram) {
        super(name, price, quantity);
        if (ram <= 0) {
            throw new IllegalArgumentException("RAM must be > 0: " + ram);
        }
        this.ram = ram;
    }

    @Override
    public void describe() {
        System.out.println(getName() + ": " + getPrice() + "$, " + ram + "GB RAM, warranty "
                + getWarrantyMonths() + " months");
    }

    public int getRam() { return ram; }
}
