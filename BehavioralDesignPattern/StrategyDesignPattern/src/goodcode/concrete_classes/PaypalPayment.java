package StrategyDesignPattern.src.goodcode.concrete_classes;

import StrategyDesignPattern.src.goodcode.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Paypal payment processing");
    }
}