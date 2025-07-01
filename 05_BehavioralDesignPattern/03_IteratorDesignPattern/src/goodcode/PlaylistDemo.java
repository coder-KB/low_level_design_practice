package goodcode;

public class PlaylistDemo {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("song 1");
        playlist.addSong("song 2 Fav");
        playlist.addSong("song 3");
        playlist.addSong("song 4 Fav");

        System.out.println("Simple Playlist: ");
        PlaylistIterator simpleIterator = playlist.iterator("simple");
        while(simpleIterator.hasNext()) {
            System.out.println("Playling: " + simpleIterator.next());
        }

        System.out.println("\nShuffled Playlist: ");
        PlaylistIterator shuffuledIterator = playlist.iterator("shuffle");
        while(shuffuledIterator.hasNext()) {
            System.out.println("Playling: " + shuffuledIterator.next());
        }

        System.out.println("\nFavorite Playlist: ");
        PlaylistIterator favoriteIterator = playlist.iterator("favorite");
        while(favoriteIterator.hasNext()) {
            System.out.println("Playling: " + favoriteIterator.next());
        }
    }
}
