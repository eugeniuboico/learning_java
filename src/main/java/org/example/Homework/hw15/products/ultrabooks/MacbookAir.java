package org.example.Homework.hw15.products.ultrabooks;

public class MacbookAir extends Ultrabook {

    public MacbookAir() {
        super("MacBook Air M3", 1200, 4, 16);
    }

    @Override
    public int getWarrantyMonths() {
        return 12;
    }
}
