package christophedelory.playlist.m3u;

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
public class M3U implements SpecificPlaylist {
    private transient SpecificPlaylistProvider _provider = null;
    private final List<Resource> _resources = new ArrayList();
    private boolean _extensionM3U = false;

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
        if (this._extensionM3U) {
            bufferedWriter.write("#EXTM3U");
            bufferedWriter.newLine();
        }
        for (Resource resource : this._resources) {
            if (this._extensionM3U) {
                bufferedWriter.write("#EXTINF:");
                bufferedWriter.write(Long.toString(resource.getLength()));
                bufferedWriter.write(",");
                if (resource.getName() == null) {
                    bufferedWriter.write(resource.getLocation());
                } else {
                    bufferedWriter.write(resource.getName());
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.write(resource.getLocation());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public Playlist toPlaylist() {
        Playlist playlist = new Playlist();
        for (Resource resource : this._resources) {
            if (resource.getLocation() != null) {
                Media media = new Media();
                Content content = new Content(resource.getLocation());
                media.setSource(content);
                content.setDuration(resource.getLength() * 1000);
                playlist.getRootSequence().addComponent(media);
            }
        }
        playlist.normalize();
        return playlist;
    }

    public void setExtensionM3U(boolean z) {
        this._extensionM3U = z;
    }

    public boolean isExtensionM3U() {
        return this._extensionM3U;
    }

    public List<Resource> getResources() {
        return this._resources;
    }
}
