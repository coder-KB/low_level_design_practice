package StrategyDesignPattern.src.goodcode;

import StrategyDesignPattern.src.goodcode.concrete_classes.CreditCardPayment;
import StrategyDesignPattern.src.goodcode.concrete_classes.CryptoPayment;
import StrategyDesignPattern.src.goodcode.concrete_classes.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy payPal = new PaypalPayment();
        PaymentStrategy crypto = new CryptoPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(payPal);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(crypto);
        paymentProcessor.processPayment();
    }
}
