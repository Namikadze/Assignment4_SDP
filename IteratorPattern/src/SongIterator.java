package iterator;
import playlist.Song;
import java.util.List;
public class SongIterator implements PlaylistIterator {
    private List<Song> songs;
    private int currentIndex = 0;
    public SongIterator(List<Song> songs) {
        this.songs = songs;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < songs.size();
    }
    @Override
    public Song next() {
        return songs.get(currentIndex++);
    }
}
