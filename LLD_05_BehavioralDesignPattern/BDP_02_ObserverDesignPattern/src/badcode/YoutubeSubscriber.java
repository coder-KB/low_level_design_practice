package BDP_02_ObserverDesignPattern.src.badcode;

public class YoutubeSubscriber {
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    public void subscribe(YouTubeChannel channel) {
         channel.addSubscriber(name);
    }

    public void watchVideo(String video) {
        System.out.println("User with name: " + name + " is watching the video: " + video);
    }
}
