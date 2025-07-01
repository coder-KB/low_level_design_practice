package badcode1;

public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if(paymentType.equals("CreditCard")) {
            System.out.println("CreditCard payment processing");
        } else if(paymentType.equals("Paypal")) {
            System.out.println("Paypal payment processing");
        } else if(paymentType.equals("Crypto")) {
            System.out.println("Crypto payment processing");
        } else {
            System.out.println("Unsupported payment type");
        }
    }
}
