package com.daaw.avee.comp.Playlists.Files;

import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.kpl.Entry;
import christophedelory.playlist.kpl.Xml;
import christophedelory.playlist.m3u.M3U;
import christophedelory.playlist.m3u.Resource;
import christophedelory.playlist.mpcpl.MPCPL;
import christophedelory.playlist.pla.PLA;
import christophedelory.playlist.plp.PLP;
import christophedelory.playlist.pls.PLS;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public class PlaylistFilesRUtils {

    /* loaded from: classes.dex */
    public static class ReadParameters {
        public String playlistPath;
    }

    static String makeSongPathAbsolute(String str, String str2) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int readFromSpecificPlaylist(SpecificPlaylist specificPlaylist, ReadParameters readParameters, List<PlaylistSong> list) {
        if (specificPlaylist == null) {
            return 0;
        }
        if (specificPlaylist instanceof PLA) {
            return readFromSpecificPlaylist((PLA) specificPlaylist, readParameters, list);
        }
        if (specificPlaylist instanceof Xml) {
            return readFromSpecificPlaylist((Xml) specificPlaylist, readParameters, list);
        }
        if (specificPlaylist instanceof PLS) {
            return readFromSpecificPlaylist((PLS) specificPlaylist, readParameters, list);
        }
        if (specificPlaylist instanceof MPCPL) {
            return readFromSpecificPlaylist((MPCPL) specificPlaylist, readParameters, list);
        }
        if (specificPlaylist instanceof PLP) {
            return readFromSpecificPlaylist((PLP) specificPlaylist, readParameters, list);
        }
        if (specificPlaylist instanceof M3U) {
            return readFromSpecificPlaylist((M3U) specificPlaylist, readParameters, list);
        }
        return 0;
    }

    static int readFromSpecificPlaylist(PLA pla, ReadParameters readParameters, List<PlaylistSong> list) {
        List<String> filenames = pla.getFilenames();
        for (String str : filenames) {
            list.add(makePlaylistSong(-1L, Utils.fixIncludedNullTerminatorString(str), readParameters));
        }
        return filenames.size();
    }

    static int readFromSpecificPlaylist(Xml xml, ReadParameters readParameters, List<PlaylistSong> list) {
        List<Entry> entries = xml.getEntries();
        for (Entry entry : entries) {
            list.add(makePlaylistSong(-1L, entry.getFilename(), readParameters));
        }
        return entries.size();
    }

    static int readFromSpecificPlaylist(PLS pls, ReadParameters readParameters, List<PlaylistSong> list) {
        List<Resource> resources = pls.getResources();
        for (Resource resource : resources) {
            list.add(makePlaylistSong(-1L, resource.getLocation(), resource.getName(), null, readParameters));
        }
        return resources.size();
    }

    static int readFromSpecificPlaylist(MPCPL mpcpl, ReadParameters readParameters, List<PlaylistSong> list) {
        List<christophedelory.playlist.mpcpl.Resource> resources = mpcpl.getResources();
        for (christophedelory.playlist.mpcpl.Resource resource : resources) {
            list.add(makePlaylistSong(-1L, resource.getFilename(), null, resource.getSubtitle(), readParameters));
        }
        return resources.size();
    }

    static int readFromSpecificPlaylist(PLP plp, ReadParameters readParameters, List<PlaylistSong> list) {
        List<String> filenames = plp.getFilenames();
        for (String str : filenames) {
            list.add(makePlaylistSong(-1L, str, readParameters));
        }
        return filenames.size();
    }

    static int readFromSpecificPlaylist(M3U m3u, ReadParameters readParameters, List<PlaylistSong> list) {
        m3u.setExtensionM3U(true);
        List<Resource> resources = m3u.getResources();
        for (Resource resource : resources) {
            list.add(makePlaylistSong(-1L, resource.getLocation(), resource.getName(), null, readParameters));
        }
        return resources.size();
    }

    static PlaylistSong makePlaylistSong(long j, String str, ReadParameters readParameters) {
        return new PlaylistSong(j, makeSongPath(str, readParameters.playlistPath));
    }

    static PlaylistSong makePlaylistSong(long j, String str, String str2, String str3, ReadParameters readParameters) {
        return new PlaylistSong(j, makeSongPath(str, readParameters.playlistPath), str2, str3);
    }

    static String makeSongPath(String str, String str2) {
        if (str.startsWith("/")) {
            return makeSongPathAbsolute(str, str2);
        }
        if (str.startsWith("\\")) {
            return makeSongPathAbsolute(str, str2);
        }
        if (str.startsWith("..")) {
            String makeSongPathRelative = makeSongPathRelative(str, str2);
            return makeSongPathRelative == null ? makeSongPathAbsolute(str, str2) : makeSongPathRelative;
        } else if (str.contains(":")) {
            return makeSongPathAbsolute(str, str2);
        } else {
            String makeSongPathRelative2 = makeSongPathRelative(str, str2);
            return makeSongPathRelative2 == null ? makeSongPathAbsolute(str, str2) : makeSongPathRelative2;
        }
    }

    static String makeSongPathRelative(String str, String str2) {
        File parentFile;
        File file = new File(str2);
        if (!file.isDirectory() && (parentFile = file.getParentFile()) != null) {
            file = parentFile;
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            try {
                return file2.getCanonicalPath();
            } catch (IOException unused) {
                return file2.getAbsolutePath();
            }
        }
        return null;
    }
}
