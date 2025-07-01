package badcode2;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Crypto payment processing");
    }
}