package org.example.Homework.hw18.payments;

public class BankTransfer extends Payment{
    private static final double FIXED_FEE = 2.0;

    public BankTransfer(double amount) throws InvalidAmountException {
        super(amount);

    }

    @Override
    public double fee(){
        return FIXED_FEE;
    }


}
