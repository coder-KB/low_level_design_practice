package BDP_02_ObserverDesignPattern.src.goodcode.interfaces;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifyAllUser();
}
