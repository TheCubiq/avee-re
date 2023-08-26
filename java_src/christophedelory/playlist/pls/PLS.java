package christophedelory.playlist.pls;

import christophedelory.playlist.Media;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import christophedelory.playlist.m3u.Resource;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import mychristophedelory.content.Content;
/* loaded from: classes.dex */
public class PLS implements SpecificPlaylist {
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
        bufferedWriter.write("[Playlist]");
        bufferedWriter.newLine();
        bufferedWriter.write("NumberOfEntries=");
        bufferedWriter.write(Integer.toString(this._resources.size()));
        bufferedWriter.newLine();
        int i = 1;
        for (Resource resource : this._resources) {
            bufferedWriter.write("File");
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write("=");
            bufferedWriter.write(resource.getLocation());
            bufferedWriter.newLine();
            if (resource.getName() != null) {
                bufferedWriter.write("Title");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(resource.getName());
                bufferedWriter.newLine();
            }
            if (resource.getLength() >= 0) {
                bufferedWriter.write("Length");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(Long.toString(resource.getLength()));
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.write("Version=2");
        bufferedWriter.newLine();
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

    public List<Resource> getResources() {
        return this._resources;
    }
}
