package christophedelory.playlist.pls;

import christophedelory.player.PlayerSupport;
import christophedelory.playlist.AbstractPlaylistComponent;
import christophedelory.playlist.Media;
import christophedelory.playlist.Parallel;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.Sequence;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import christophedelory.playlist.m3u.Resource;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import mychristophedelory.content.type.ContentType;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class PLSProvider implements SpecificPlaylistProvider {
    private static final ContentType[] FILETYPES = {new ContentType(new String[]{".pls"}, new String[]{"audio/x-scpls"}, new PlayerSupport[]{new PlayerSupport(PlayerSupport.Player.WINAMP, true, null), new PlayerSupport(PlayerSupport.Player.VLC_MEDIA_PLAYER, false, null), new PlayerSupport(PlayerSupport.Player.MEDIA_PLAYER_CLASSIC, true, null), new PlayerSupport(PlayerSupport.Player.FOOBAR2000, false, null), new PlayerSupport(PlayerSupport.Player.MPLAYER, true, null), new PlayerSupport(PlayerSupport.Player.QUICKTIME, true, null), new PlayerSupport(PlayerSupport.Player.ITUNES, true, null), new PlayerSupport(PlayerSupport.Player.REALPLAYER, false, null)}, "Winamp PLSv2 Playlist")};

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public String getId() {
        return "pls";
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
        PLS pls = new PLS();
        pls.setProvider(this);
        int i = -1;
        boolean z = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            String trim = readLine.trim();
            if (trim.length() > 0) {
                if (!z) {
                    if (!trim.equalsIgnoreCase("[playlist]")) {
                        throw new IllegalArgumentException("Not a PLS playlist format");
                    }
                    z = true;
                } else {
                    int indexOf = trim.indexOf(61);
                    if (indexOf <= 0) {
                        log.error("Malformed PLS playlist");
                        break;
                    }
                    String lowerCase = trim.substring(0, indexOf).trim().toLowerCase();
                    String trim2 = trim.substring(indexOf + 1).trim();
                    if ("numberofentries".equals(lowerCase)) {
                        try {
                            int parseInt = Integer.parseInt(trim2);
                            if (parseInt < 0) {
                                log.warn("Invalid NumberOfEntries in PLS playlist: " + parseInt);
                                break;
                            }
                            if (i >= 0 && i != parseInt) {
                                log.error("PLS playlist number of entries already specified with a different value");
                                break;
                            }
                            i = parseInt;
                        } catch (NumberFormatException e) {
                            log.error(e.toString());
                        }
                    } else if (lowerCase.startsWith("file")) {
                        try {
                            int parseInt2 = Integer.parseInt(lowerCase.substring(4)) - 1;
                            for (int size = pls.getResources().size(); size < parseInt2 + 1; size++) {
                                pls.getResources().add(new Resource());
                            }
                            pls.getResources().get(parseInt2).setLocation(trim2);
                        } catch (NumberFormatException e2) {
                            log.error(e2.toString());
                        }
                    } else if (lowerCase.startsWith("title")) {
                        try {
                            int parseInt3 = Integer.parseInt(lowerCase.substring(5)) - 1;
                            for (int size2 = pls.getResources().size(); size2 < parseInt3 + 1; size2++) {
                                pls.getResources().add(new Resource());
                            }
                            pls.getResources().get(parseInt3).setName(trim2);
                        } catch (NumberFormatException e3) {
                            log.error(e3.toString());
                        }
                    } else if (lowerCase.startsWith("length")) {
                        try {
                            int parseInt4 = Integer.parseInt(lowerCase.substring(6)) - 1;
                            for (int size3 = pls.getResources().size(); size3 < parseInt4 + 1; size3++) {
                                pls.getResources().add(new Resource());
                            }
                            try {
                                pls.getResources().get(parseInt4).setLength(Long.parseLong(trim2));
                            } catch (NumberFormatException e4) {
                                log.error(e4.toString());
                            }
                        } catch (NumberFormatException e5) {
                            log.error(e5.toString());
                        }
                    } else if ("version".equals(lowerCase)) {
                        if (!"2".equals(trim2)) {
                            log.error("Unknown PLS version " + trim2);
                            break;
                        }
                    } else {
                        log.warn("Unknown PLS keyword " + lowerCase);
                    }
                }
            }
        }
        pls = null;
        if (pls != null) {
            if (i < 0) {
                log.warn("No number of entries in PLS playlist");
            } else {
                int size4 = pls.getResources().size() - i;
                if (size4 > 0) {
                    log.warn("Ignoring " + size4 + " extra resources according to the specified number of entries " + i);
                }
                for (int i2 = 0; i2 < size4; i2++) {
                    pls.getResources().remove(i);
                }
            }
        }
        return pls;
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception {
        PLS pls = new PLS();
        pls.setProvider(this);
        addToPlaylist(pls.getResources(), playlist.getRootSequence());
        return pls;
    }

    private void addToPlaylist(List<Resource> list, AbstractPlaylistComponent abstractPlaylistComponent) throws Exception {
        if (abstractPlaylistComponent instanceof Sequence) {
            Sequence sequence = (Sequence) abstractPlaylistComponent;
            if (sequence.getRepeatCount() < 0) {
                throw new IllegalArgumentException("A PLS playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int i = 0; i < sequence.getRepeatCount(); i++) {
                for (AbstractPlaylistComponent abstractPlaylistComponent2 : components) {
                    addToPlaylist(list, abstractPlaylistComponent2);
                }
            }
        } else if (abstractPlaylistComponent instanceof Parallel) {
            throw new IllegalArgumentException("A parallel time container is incompatible with a PLS playlist");
        } else {
            if (abstractPlaylistComponent instanceof Media) {
                Media media = (Media) abstractPlaylistComponent;
                if (media.getDuration() != null) {
                    throw new IllegalArgumentException("A PLS playlist cannot handle a timed media");
                }
                if (media.getRepeatCount() < 0) {
                    throw new IllegalArgumentException("A PLS playlist cannot handle a media repeated indefinitely");
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
