package iterator;
import playlist.Song;
public interface PlaylistIterator {
    boolean hasNext();
    Song next();
}
