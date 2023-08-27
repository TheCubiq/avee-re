package christophedelory.playlist.pla;

import christophedelory.player.PlayerSupport;
import christophedelory.playlist.AbstractPlaylistComponent;
import christophedelory.playlist.Media;
import christophedelory.playlist.Parallel;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.Sequence;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import com.google.android.exoplayer2.C;
import com.mpatric.mp3agic.EncodedText;
import java.io.InputStream;
import java.util.List;
import kotlin.UByte;
import mychristophedelory.content.type.ContentType;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class PLAProvider implements SpecificPlaylistProvider {
    private static final ContentType[] FILETYPES = {new ContentType(new String[]{".pla"}, new String[]{"application/octet-stream"}, new PlayerSupport[0], "iRiver iQuickList File")};

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public String getId() {
        return "pla";
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public ContentType[] getContentTypes() {
        return (ContentType[]) FILETYPES.clone();
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist readFrom(InputStream inputStream, String str, Log log) throws Exception {
        PLA pla = new PLA();
        pla.setProvider(this);
        byte[] bArr = new byte[512];
        if (inputStream.read(bArr) != 512) {
            throw new IllegalArgumentException("Not a PLA playlist format (file too small)");
        }
        if (!"iriver UMS PLA".equals(new String(bArr, 4, 14, C.ASCII_NAME))) {
            throw new IllegalArgumentException("Not a PLA playlist format (bad magic)");
        }
        int i = ((bArr[3] & UByte.MAX_VALUE) << 0) | ((bArr[2] & UByte.MAX_VALUE) << 8) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[0] & UByte.MAX_VALUE) << 24);
        for (int i2 = 0; i2 < i; i2++) {
            if (inputStream.read(bArr) != 512) {
                log.error("Malformed PLA playlist (file too small)");
                return null;
            }
            pla.getFilenames().add(new String(bArr, 2, 510, EncodedText.CHARSET_UTF_16BE));
        }
        return pla;
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception {
        PLA pla = new PLA();
        pla.setProvider(this);
        addToPlaylist(pla.getFilenames(), playlist.getRootSequence());
        return pla;
    }

    private void addToPlaylist(List<String> list, AbstractPlaylistComponent abstractPlaylistComponent) throws Exception {
        if (abstractPlaylistComponent instanceof Sequence) {
            Sequence sequence = (Sequence) abstractPlaylistComponent;
            if (sequence.getRepeatCount() < 0) {
                throw new IllegalArgumentException("A PLA playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int i = 0; i < sequence.getRepeatCount(); i++) {
                for (AbstractPlaylistComponent abstractPlaylistComponent2 : components) {
                    addToPlaylist(list, abstractPlaylistComponent2);
                }
            }
        } else if (abstractPlaylistComponent instanceof Parallel) {
            throw new IllegalArgumentException("A parallel time container is incompatible with a PLA playlist");
        } else {
            if (abstractPlaylistComponent instanceof Media) {
                Media media = (Media) abstractPlaylistComponent;
                if (media.getDuration() != null) {
                    throw new IllegalArgumentException("A PLA playlist cannot handle a timed media");
                }
                if (media.getRepeatCount() < 0) {
                    throw new IllegalArgumentException("A PLA playlist cannot handle a media repeated indefinitely");
                }
                if (media.getSource() != null) {
                    for (int i2 = 0; i2 < media.getRepeatCount(); i2++) {
                        list.add(media.getSource().toString());
                    }
                }
            }
        }
    }
}
