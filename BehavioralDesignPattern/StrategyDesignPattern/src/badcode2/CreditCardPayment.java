package StrategyDesignPattern.src.badcode2;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("CreditCard payment processing");
    }
}