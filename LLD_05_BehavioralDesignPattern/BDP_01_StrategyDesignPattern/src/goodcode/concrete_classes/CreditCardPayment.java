package BDP_01_StrategyDesignPattern.src.goodcode.concrete_classes;

import BDP_01_StrategyDesignPattern.src.goodcode.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("CreditCard payment processing");
    }
}

