package BDP_02_ObserverDesignPattern.src.goodcode;

import BDP_02_ObserverDesignPattern.src.goodcode.interfaces.Subscriber;
import BDP_02_ObserverDesignPattern.src.goodcode.interfaces.YoutubeChannel;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String video;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyAllUser() {
        for (Subscriber subscriber: subscriberList) {
            subscriber.notifyUser(video);
        }
    }

    public void uploadNewVideo(String video) {
        this.video = video;
        notifyAllUser();
    }
}
