package christophedelory.playlist.plp;

import christophedelory.playlist.Media;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import com.mpatric.mp3agic.EncodedText;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import mychristophedelory.content.Content;
/* loaded from: classes.dex */
public class PLP implements SpecificPlaylist {
    private transient SpecificPlaylistProvider _provider = null;
    private final List<String> _filenames = new ArrayList();
    private String _diskSpecifier = "HARP";

    @Override // christophedelory.playlist.SpecificPlaylist
    public void setProvider(SpecificPlaylistProvider specificPlaylistProvider) {
        this._provider = specificPlaylistProvider;
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public SpecificPlaylistProvider getProvider() {
        return this._provider;
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public void writeTo(OutputStream outputStream, String str) throws Exception {
        if (str == null) {
            str = EncodedText.CHARSET_UTF_16;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        bufferedWriter.write("PLP PLAYLIST");
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        bufferedWriter.write("VERSION 1.20");
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        for (String str2 : this._filenames) {
            bufferedWriter.write(this._diskSpecifier);
            bufferedWriter.write(", ");
            bufferedWriter.write(str2);
            bufferedWriter.write(13);
            bufferedWriter.write(10);
        }
        bufferedWriter.flush();
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public Playlist toPlaylist() {
        Playlist playlist = new Playlist();
        for (String str : this._filenames) {
            Media media = new Media();
            media.setSource(new Content(str));
            playlist.getRootSequence().addComponent(media);
        }
        playlist.normalize();
        return playlist;
    }

    public List<String> getFilenames() {
        return this._filenames;
    }

    public String getDiskSpecifier() {
        return this._diskSpecifier;
    }

    public void setDiskSpecifier(String str) {
        this._diskSpecifier = str.trim();
    }
}
