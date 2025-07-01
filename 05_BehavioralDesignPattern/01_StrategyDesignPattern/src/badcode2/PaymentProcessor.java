package badcode2;

public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if(paymentType.equals("CreditCard")) {
            CreditCardPayment creditCardPayment = new CreditCardPayment();
            creditCardPayment.processPayment();
        } else if(paymentType.equals("Paypal")) {
            PaypalPayment paypalPayment = new PaypalPayment();
            paypalPayment.processPayment();
        } else if(paymentType.equals("Crypto")) {
            CryptoPayment cryptoPayment = new CryptoPayment();
            cryptoPayment.processPayment();
        } else {
            System.out.println("Unsupported payment type");
        }
    }
}