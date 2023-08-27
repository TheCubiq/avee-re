package christophedelory.playlist;

import java.io.InputStream;
import mychristophedelory.content.type.ContentType;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public interface SpecificPlaylistProvider {
    ContentType[] getContentTypes();

    String getId();

    SpecificPlaylist readFrom(InputStream inputStream, String str, Log log) throws Exception;

    SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception;
}
