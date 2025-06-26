package StrategyDesignPattern.src.goodcode.concrete_classes;

import StrategyDesignPattern.src.goodcode.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Crypto payment processing");
    }
}