package org.example.Homework.hw18.payments;

//# | technique | input  | expected
//1 | EP        | 100    | fee 1.5, total 101.5, refound 100
//2 | EP        | -100   | InvalidAmountException
//3 | EP        | 1100   | InvalidAmountException
//4 | BVA       | 0      | InvalidAmountException
//5 | BVA       | 1000.01| InvalidAmountException
//6 | BVA       | 0.1    | created
//7 | BVA       | 10000  | created


public class CardPayment extends Payment {
    private static final double FEE_RATE = 0.015;
    private static final double MAX_AMOUNT = 10000;

    public CardPayment(double amount) throws InvalidAmountException {
        super(amount);
        if (amount > MAX_AMOUNT) {
            throw new InvalidAmountException("Amount can not exceed 10000");
        }
    }

        @Override
        public double fee() {
            return getAmount() * FEE_RATE;
        }

        public double refund() {
            return getAmount();
        }

}
