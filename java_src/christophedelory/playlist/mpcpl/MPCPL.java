package christophedelory.playlist.mpcpl;

import christophedelory.playlist.Media;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import mychristophedelory.content.Content;
/* loaded from: classes.dex */
public class MPCPL implements SpecificPlaylist {
    private transient SpecificPlaylistProvider _provider = null;
    private final List<Resource> _resources = new ArrayList();

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
            str = "UTF-8";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        bufferedWriter.write("MPCPLAYLIST");
        bufferedWriter.newLine();
        int i = 1;
        for (Resource resource : this._resources) {
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",type,");
            bufferedWriter.write(resource.getType());
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",filename,");
            bufferedWriter.write(resource.getFilename());
            bufferedWriter.newLine();
            if (resource.getSubtitle() != null) {
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write(",subtitle,");
                bufferedWriter.write(resource.getSubtitle());
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.flush();
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public Playlist toPlaylist() {
        Playlist playlist = new Playlist();
        for (Resource resource : this._resources) {
            if (resource.getFilename() != null) {
                Media media = new Media();
                media.setSource(new Content(resource.getFilename()));
                playlist.getRootSequence().addComponent(media);
            }
        }
        playlist.normalize();
        return playlist;
    }

    public List<Resource> getResources() {
        return this._resources;
    }
}
