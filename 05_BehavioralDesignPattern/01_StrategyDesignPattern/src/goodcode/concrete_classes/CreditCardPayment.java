package goodcode.concrete_classes;

import goodcode.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("CreditCard payment processing");
    }
}

