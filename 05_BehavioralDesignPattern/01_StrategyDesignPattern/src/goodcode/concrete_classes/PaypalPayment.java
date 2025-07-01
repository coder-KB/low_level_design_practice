package goodcode.concrete_classes;

import goodcode.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Paypal payment processing");
    }
}