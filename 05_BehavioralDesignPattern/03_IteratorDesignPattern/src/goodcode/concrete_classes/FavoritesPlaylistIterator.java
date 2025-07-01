package goodcode.concrete_classes;

import goodcode.Playlist;
import goodcode.PlaylistIterator;

public class FavoritesPlaylistIterator implements PlaylistIterator {
    private Playlist playlist;
    private int index;

    public FavoritesPlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while(index < playlist.getSongs().size()) {
            if(playlist.getSongs().get(index).contains("Fav")) {
                return true;
            }
            ++index;
        }
        return false;
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}