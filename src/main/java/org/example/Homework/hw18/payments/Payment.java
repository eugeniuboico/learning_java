package org.example.Homework.hw18.payments;

public abstract class Payment {
    private final double amount;

    protected Payment(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }
        this.amount = amount;
    }

    public abstract double fee();

    public double total() {
        return amount + fee();
    }

    public double getAmount() {
        return amount;
    }
}
