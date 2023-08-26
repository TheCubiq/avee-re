package christophedelory.playlist.mpcpl;

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
import mychristophedelory.content.type.ContentType;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class MPCPLProvider implements SpecificPlaylistProvider {
    private static final ContentType[] FILETYPES = {new ContentType(new String[]{".mpcpl"}, new String[]{"text/plain"}, new PlayerSupport[]{new PlayerSupport(PlayerSupport.Player.MEDIA_PLAYER_CLASSIC, true, null)}, "Media Player Classic Playlist")};

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public String getId() {
        return "mpcpl";
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public ContentType[] getContentTypes() {
        return (ContentType[]) FILETYPES.clone();
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist readFrom(InputStream inputStream, String str, Log log) throws Exception {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        MPCPL mpcpl = new MPCPL();
        mpcpl.setProvider(this);
        boolean z = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return mpcpl;
            }
            String trim = readLine.trim();
            if (trim.length() > 0) {
                if (!z) {
                    if (!trim.equalsIgnoreCase("MPCPLAYLIST")) {
                        throw new IllegalArgumentException("Not a MPCPL playlist format");
                    }
                    z = true;
                } else {
                    int indexOf = trim.indexOf(44);
                    if (indexOf <= 0) {
                        log.error("Malformed MPCPL playlist entry " + trim);
                        break;
                    }
                    String trim2 = trim.substring(0, indexOf).trim();
                    String substring = trim.substring(indexOf + 1);
                    int indexOf2 = substring.indexOf(44);
                    if (indexOf2 <= 0) {
                        log.error("Malformed MPCPL playlist entry " + substring);
                        break;
                    }
                    String lowerCase = substring.substring(0, indexOf2).trim().toLowerCase();
                    String trim3 = substring.substring(indexOf2 + 1).trim();
                    try {
                        int parseInt = Integer.parseInt(trim2) - 1;
                        for (int size = mpcpl.getResources().size(); size < parseInt + 1; size++) {
                            mpcpl.getResources().add(new Resource());
                        }
                        Resource resource = mpcpl.getResources().get(parseInt);
                        if ("filename".equals(lowerCase)) {
                            resource.setFilename(trim3);
                        } else if ("type".equals(lowerCase)) {
                            resource.setType(trim3);
                        } else if ("subtitle".equals(lowerCase)) {
                            resource.setSubtitle(trim3);
                        } else {
                            log.warn("Unknown MPCPL keyword " + lowerCase);
                        }
                    } catch (NumberFormatException e) {
                        log.error(e.toString());
                        return null;
                    }
                }
            }
        }
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception {
        MPCPL mpcpl = new MPCPL();
        mpcpl.setProvider(this);
        addToPlaylist(mpcpl.getResources(), playlist.getRootSequence());
        return mpcpl;
    }

    private void addToPlaylist(List<Resource> list, AbstractPlaylistComponent abstractPlaylistComponent) throws Exception {
        if (abstractPlaylistComponent instanceof Sequence) {
            Sequence sequence = (Sequence) abstractPlaylistComponent;
            if (sequence.getRepeatCount() < 0) {
                throw new IllegalArgumentException("A MPCPL playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int i = 0; i < sequence.getRepeatCount(); i++) {
                for (AbstractPlaylistComponent abstractPlaylistComponent2 : components) {
                    addToPlaylist(list, abstractPlaylistComponent2);
                }
            }
        } else if (abstractPlaylistComponent instanceof Parallel) {
            throw new IllegalArgumentException("A parallel time container is incompatible with a MPCPL playlist");
        } else {
            if (abstractPlaylistComponent instanceof Media) {
                Media media = (Media) abstractPlaylistComponent;
                if (media.getDuration() != null) {
                    throw new IllegalArgumentException("A MPCPL playlist cannot handle a timed media");
                }
                if (media.getRepeatCount() < 0) {
                    throw new IllegalArgumentException("A MPCPL playlist cannot handle a media repeated indefinitely");
                }
                if (media.getSource() != null) {
                    for (int i2 = 0; i2 < media.getRepeatCount(); i2++) {
                        Resource resource = new Resource();
                        resource.setFilename(media.getSource().toString());
                        list.add(resource);
                    }
                }
            }
        }
    }
}
