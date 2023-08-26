package christophedelory.playlist.plp;

import christophedelory.player.PlayerSupport;
import christophedelory.playlist.AbstractPlaylistComponent;
import christophedelory.playlist.Media;
import christophedelory.playlist.Parallel;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.Sequence;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import com.mpatric.mp3agic.EncodedText;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import mychristophedelory.content.type.ContentType;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class PLPProvider implements SpecificPlaylistProvider {
    private static final ContentType[] FILETYPES = {new ContentType(new String[]{".plp"}, new String[]{"text/plain"}, new PlayerSupport[0], "Sansa Playlist File")};

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public String getId() {
        return "plp";
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public ContentType[] getContentTypes() {
        return (ContentType[]) FILETYPES.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        r10.setDiskSpecifier(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
        return r10;
     */
    @Override // christophedelory.playlist.SpecificPlaylistProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpecificPlaylist readFrom(InputStream inputStream, String str, Log log) throws Exception {
        if (str == null) {
            str = EncodedText.CHARSET_UTF_16;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        PLP plp = new PLP();
        plp.setProvider(this);
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            String trim = readLine.trim();
            if (trim.length() > 0) {
                if (z) {
                    if (!z2) {
                        if (!"VERSION 1.20".equals(trim)) {
                            log.error("Malformed PLP playlist (no version information)");
                            break;
                        }
                        z2 = true;
                    } else {
                        int indexOf = trim.indexOf(44);
                        if (indexOf <= 0) {
                            log.error("Malformed PLP playlist (playlist entry line format)");
                            break;
                        }
                        String trim2 = trim.substring(0, indexOf).trim();
                        if (str2 != null) {
                            if (!str2.equals(trim2)) {
                                log.error("Malformed PLP playlist (inconsistent disk specifier)");
                                break;
                            }
                        } else {
                            str2 = trim2;
                        }
                        plp.getFilenames().add(trim.substring(indexOf + 1).trim());
                    }
                } else if (!"PLP PLAYLIST".equals(trim)) {
                    throw new IllegalArgumentException("Not a PLP playlist format");
                } else {
                    z = true;
                }
            }
        }
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception {
        PLP plp = new PLP();
        plp.setProvider(this);
        addToPlaylist(plp.getFilenames(), playlist.getRootSequence());
        return plp;
    }

    private void addToPlaylist(List<String> list, AbstractPlaylistComponent abstractPlaylistComponent) throws Exception {
        if (abstractPlaylistComponent instanceof Sequence) {
            Sequence sequence = (Sequence) abstractPlaylistComponent;
            if (sequence.getRepeatCount() < 0) {
                throw new IllegalArgumentException("A PLP playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int i = 0; i < sequence.getRepeatCount(); i++) {
                for (AbstractPlaylistComponent abstractPlaylistComponent2 : components) {
                    addToPlaylist(list, abstractPlaylistComponent2);
                }
            }
        } else if (abstractPlaylistComponent instanceof Parallel) {
            throw new IllegalArgumentException("A parallel time container is incompatible with a PLP playlist");
        } else {
            if (abstractPlaylistComponent instanceof Media) {
                Media media = (Media) abstractPlaylistComponent;
                if (media.getDuration() != null) {
                    throw new IllegalArgumentException("A PLP playlist cannot handle a timed media");
                }
                if (media.getRepeatCount() < 0) {
                    throw new IllegalArgumentException("A PLP playlist cannot handle a media repeated indefinitely");
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
