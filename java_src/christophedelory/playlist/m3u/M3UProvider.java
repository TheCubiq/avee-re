package christophedelory.playlist.m3u;

import christophedelory.player.PlayerSupport;
import christophedelory.playlist.AbstractPlaylistComponent;
import christophedelory.playlist.Media;
import christophedelory.playlist.Parallel;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.Sequence;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import mychristophedelory.content.type.ContentType;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class M3UProvider implements SpecificPlaylistProvider {
    private static final ContentType[] FILETYPES = {new ContentType(new String[]{".m3u"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new PlayerSupport[]{new PlayerSupport(PlayerSupport.Player.WINAMP, true, null), new PlayerSupport(PlayerSupport.Player.VLC_MEDIA_PLAYER, true, null), new PlayerSupport(PlayerSupport.Player.WINDOWS_MEDIA_PLAYER, true, null), new PlayerSupport(PlayerSupport.Player.MEDIA_PLAYER_CLASSIC, true, null), new PlayerSupport(PlayerSupport.Player.FOOBAR2000, true, null), new PlayerSupport(PlayerSupport.Player.MPLAYER, true, null), new PlayerSupport(PlayerSupport.Player.QUICKTIME, true, null), new PlayerSupport(PlayerSupport.Player.ITUNES, true, null), new PlayerSupport(PlayerSupport.Player.REALPLAYER, false, null)}, "Winamp M3U"), new ContentType(new String[]{".m3u8"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new PlayerSupport[]{new PlayerSupport(PlayerSupport.Player.WINAMP, true, null), new PlayerSupport(PlayerSupport.Player.FOOBAR2000, true, null)}, "Winamp M3U8"), new ContentType(new String[]{".m4u"}, new String[]{"video/x-mpegurl"}, new PlayerSupport[0], "M4U Playlist"), new ContentType(new String[]{".ram"}, new String[]{"audio/vnd.rn-realaudio", "audio/x-pn-realaudio"}, new PlayerSupport[]{new PlayerSupport(PlayerSupport.Player.MEDIA_PLAYER_CLASSIC, false, null), new PlayerSupport(PlayerSupport.Player.REALPLAYER, false, null)}, "Real Audio Metadata (RAM)")};

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public String getId() {
        return "m3u";
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public ContentType[] getContentTypes() {
        return (ContentType[]) FILETYPES.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        r3 = new christophedelory.playlist.m3u.Resource();
        r3.setLocation(r2);
        r3.setName(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        r3.setLength(java.lang.Long.parseLong(r1));
     */
    @Override // christophedelory.playlist.SpecificPlaylistProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpecificPlaylist readFrom(InputStream inputStream, String str, Log log) throws Exception {
        Resource resource;
        if (str == null) {
            str = "UTF-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        M3U m3u = new M3U();
        m3u.setProvider(this);
        loop0: while (true) {
            String str2 = null;
            String str3 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return m3u;
                }
                String trim = readLine.trim();
                if (trim.length() > 0) {
                    char charAt = trim.charAt(0);
                    if (charAt != '<' && charAt != '[') {
                        if (charAt != '#') {
                            break;
                        } else if (trim.toUpperCase(Locale.ENGLISH).startsWith("#EXTINF")) {
                            int indexOf = trim.indexOf(44, 0);
                            if (indexOf >= 0) {
                                str2 = trim.substring(indexOf + 1, trim.length());
                            }
                            int indexOf2 = trim.indexOf(58, 0);
                            if (indexOf2 >= 0 && indexOf2 < indexOf) {
                                str3 = trim.substring(indexOf2 + 1, indexOf).trim();
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            m3u.getResources().add(resource);
        }
        throw new IllegalArgumentException("Doesn't seem to be a M3U playlist (and related ones)");
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception {
        M3U m3u = new M3U();
        m3u.setProvider(this);
        addToPlaylist(m3u.getResources(), playlist.getRootSequence());
        return m3u;
    }

    private void addToPlaylist(List<Resource> list, AbstractPlaylistComponent abstractPlaylistComponent) throws Exception {
        if (abstractPlaylistComponent instanceof Sequence) {
            Sequence sequence = (Sequence) abstractPlaylistComponent;
            if (sequence.getRepeatCount() < 0) {
                throw new IllegalArgumentException("A M3U playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int i = 0; i < sequence.getRepeatCount(); i++) {
                for (AbstractPlaylistComponent abstractPlaylistComponent2 : components) {
                    addToPlaylist(list, abstractPlaylistComponent2);
                }
            }
        } else if (abstractPlaylistComponent instanceof Parallel) {
            throw new IllegalArgumentException("A parallel time container is incompatible with a M3U playlist");
        } else {
            if (abstractPlaylistComponent instanceof Media) {
                Media media = (Media) abstractPlaylistComponent;
                if (media.getDuration() != null) {
                    throw new IllegalArgumentException("A M3U playlist cannot handle a timed media");
                }
                if (media.getRepeatCount() < 0) {
                    throw new IllegalArgumentException("A M3U playlist cannot handle a media repeated indefinitely");
                }
                if (media.getSource() != null) {
                    for (int i2 = 0; i2 < media.getRepeatCount(); i2++) {
                        Resource resource = new Resource();
                        resource.setLocation(media.getSource().toString());
                        if (media.getSource().getDuration() >= 0) {
                            resource.setLength((media.getSource().getDuration() + 999) / 1000);
                        }
                        list.add(resource);
                    }
                }
            }
        }
    }
}
