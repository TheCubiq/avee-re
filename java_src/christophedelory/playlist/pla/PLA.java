package christophedelory.playlist.pla;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import christophedelory.playlist.Media;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import com.mpatric.mp3agic.EncodedText;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mychristophedelory.content.Content;
/* loaded from: classes.dex */
public class PLA implements SpecificPlaylist {
    private transient SpecificPlaylistProvider _provider = null;
    private final List<String> _filenames = new ArrayList();

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
        byte[] bArr = new byte[512];
        Arrays.fill(bArr, (byte) 0);
        bArr[4] = 105;
        bArr[5] = 114;
        bArr[6] = 105;
        bArr[7] = 118;
        bArr[8] = 101;
        bArr[9] = 114;
        bArr[10] = 32;
        bArr[11] = 85;
        bArr[12] = 77;
        bArr[13] = 83;
        bArr[14] = 32;
        bArr[15] = 80;
        bArr[16] = 76;
        bArr[17] = 65;
        int size = this._filenames.size();
        bArr[3] = (byte) ((size & 255) >> 0);
        bArr[2] = (byte) ((size & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
        bArr[1] = (byte) ((16711680 & size) >> 16);
        bArr[0] = (byte) ((size & ViewCompat.MEASURED_STATE_MASK) >> 24);
        outputStream.write(bArr);
        for (String str2 : this._filenames) {
            Arrays.fill(bArr, (byte) 0);
            int lastIndexOf = str2.lastIndexOf(47);
            int lastIndexOf2 = str2.lastIndexOf(92);
            int i = (lastIndexOf > lastIndexOf2 ? lastIndexOf + 1 : lastIndexOf2 > lastIndexOf ? lastIndexOf2 + 1 : 0) + 1;
            bArr[1] = (byte) ((i & 255) >> 0);
            bArr[0] = (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
            byte[] bytes = str2.getBytes(EncodedText.CHARSET_UTF_16BE);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            outputStream.write(bArr);
        }
        outputStream.flush();
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
}
