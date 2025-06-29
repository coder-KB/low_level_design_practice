package BDP_02_ObserverDesignPattern.src.goodcode.concrete_classes;

import BDP_02_ObserverDesignPattern.src.goodcode.interfaces.Subscriber;

public class YoutubeSubscriber implements Subscriber {
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notifyUser(String video) {
        System.out.println("Sending notification to " + name + ": New video uploaded: " + video);
    }
}
