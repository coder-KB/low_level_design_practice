package BDP_03_IteratorDesignPattern.src.goodcode;

import BDP_03_IteratorDesignPattern.src.goodcode.concrete_classes.FavoritesPlaylistIterator;
import BDP_03_IteratorDesignPattern.src.goodcode.concrete_classes.ShuffledPlaylistIterator;
import BDP_03_IteratorDesignPattern.src.goodcode.concrete_classes.SimplePlaylistIterator;

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

    public PlaylistIterator iterator(String type) {
        switch(type) {
            case "simple": return new SimplePlaylistIterator(this);
            case "shuffle": return new ShuffledPlaylistIterator(this);
            case "favorite": return new FavoritesPlaylistIterator(this);
            default: return null;
        }
    }

    public List<String> getSongs() {
        return songs;
    }
}
