package badcode;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void playPlaylist(boolean shuffle) {
        if(shuffle) {
            System.out.println("Playling the playlist after shuffling");
        } else {
            for(int i = 0; i < songs.size(); ++i) {
                System.out.println("Playling the song: " + songs.get(i));
            }
        }
    }
}
