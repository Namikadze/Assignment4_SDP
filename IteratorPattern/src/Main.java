import playlist.*;
import iterator.PlaylistIterator;
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1"));
        playlist.addSong(new Song("Song 2"));
        playlist.addSong(new Song("Song 3"));
        PlaylistIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getTitle());
        }
    }
}
