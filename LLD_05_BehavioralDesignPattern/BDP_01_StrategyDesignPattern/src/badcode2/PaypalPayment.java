package BDP_01_StrategyDesignPattern.src.badcode2;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Paypal payment processing");
    }
}
