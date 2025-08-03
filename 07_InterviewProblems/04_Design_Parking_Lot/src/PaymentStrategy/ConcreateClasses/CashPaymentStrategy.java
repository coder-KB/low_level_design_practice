package PaymentStrategy.ConcreateClasses;

import PaymentStrategy.PaymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy {
    public CashPaymentStrategy(double fee) {

    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Process Payment in Cash for amount: " + amount);
    }
}
