package ObserverDesignPattern.src.goodcode.concrete_classes;

import ObserverDesignPattern.src.goodcode.interfaces.Subscriber;

public class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notifyUser(String video) {
        System.out.println("Sending email to " + email + ": New video uploaded: " + video);
    }
}
