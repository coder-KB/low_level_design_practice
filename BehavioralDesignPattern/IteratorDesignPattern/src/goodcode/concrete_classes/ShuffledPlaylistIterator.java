package IteratorDesignPattern.src.goodcode.concrete_classes;

import IteratorDesignPattern.src.goodcode.Playlist;
import IteratorDesignPattern.src.goodcode.PlaylistIterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlaylistIterator implements PlaylistIterator {
    private Playlist playlist;
    private int index;
    private List<String> shuffledSongs;

    public ShuffledPlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
        shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
