package ObserverDesignPattern.src.goodcode.interfaces;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifyAllUser();
}
