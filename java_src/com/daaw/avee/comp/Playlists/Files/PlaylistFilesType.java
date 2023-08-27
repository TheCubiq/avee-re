package com.daaw.avee.comp.Playlists.Files;
/* loaded from: classes.dex */
public class PlaylistFilesType {
    public static PlaylistFilesType[] playlistFilesTypes = {new PlaylistFilesType("PLA Playlist", 1, "pla", true), new PlaylistFilesType("PLS Playlist", 3, "pls", true), new PlaylistFilesType("MPCPL Playlist", 4, "mpcpl", true), new PlaylistFilesType("PLP Playlist", 5, "plp", true), new PlaylistFilesType("M3U Playlist", 6, "m3u", true), new PlaylistFilesType("M3U8 Playlist", 7, "m3u8", true)};
    public final String fileExtension;
    public final String name;
    public final boolean supportSaving;

    public PlaylistFilesType(String str, int i, String str2, boolean z) {
        this.name = str;
        this.fileExtension = str2;
        this.supportSaving = z;
    }

    public static boolean isPlaylistFileExtension(String str) {
        return str.equals("pla") || str.equals("pls") || str.equals("mpcpl") || str.equals("plp") || str.equals("m3u") || str.equals("m3u8") || str.equals("m4u") || str.equals("ram");
    }
}
