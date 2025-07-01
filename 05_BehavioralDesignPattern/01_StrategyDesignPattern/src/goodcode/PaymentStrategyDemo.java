package goodcode;

import goodcode.concrete_classes.*;

public class PaymentStrategyDemo {
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
