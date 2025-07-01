package goodcode.concrete_classes;

import goodcode.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Crypto payment processing");
    }
}