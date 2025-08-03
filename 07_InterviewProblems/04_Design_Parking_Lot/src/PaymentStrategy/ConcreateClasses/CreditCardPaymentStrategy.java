package PaymentStrategy.ConcreateClasses;

import PaymentStrategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    public CreditCardPaymentStrategy(double fee) {

    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Process Payment in Credit Card for amount: " + amount);
    }
}
