package IteratorDesignPattern.src.goodcode.concrete_classes;

import IteratorDesignPattern.src.goodcode.Playlist;
import IteratorDesignPattern.src.goodcode.PlaylistIterator;

public class SimplePlaylistIterator implements PlaylistIterator {
    private Playlist playlist;
    private int index;

    public SimplePlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}