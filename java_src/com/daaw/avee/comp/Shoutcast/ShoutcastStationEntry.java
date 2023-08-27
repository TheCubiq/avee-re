package com.daaw.avee.comp.Shoutcast;

import com.daaw.avee.comp.IceCast.StationEntry;
/* loaded from: classes.dex */
public class ShoutcastStationEntry extends StationEntry {
    private String currentTrack;
    private String[] tuneinDataReference;

    public String albumName() {
        return "";
    }

    public int duration() {
        return 1;
    }

    public String getAlbumArtPath0Str() {
        return "";
    }

    public String getAlbumArtPath1Str() {
        return "";
    }

    public String getVideoThumbDataSourceAsStr() {
        return "";
    }

    public boolean isAlbumKnown() {
        return false;
    }

    public boolean isArtistKnownOrSecondName() {
        return true;
    }

    public boolean isStream() {
        return true;
    }

    public ShoutcastStationEntry(String str, String str2, int i, String str3, String str4, String[] strArr) {
        super(str, str2, i, str3);
        this.currentTrack = str4 == null ? "" : str4;
        this.tuneinDataReference = strArr;
    }

    public String getShoutcastId() {
        return this.url;
    }

    public String getShoutcastBase() {
        return this.tuneinDataReference[0];
    }

    public String getAlbumArtGenerateStr() {
        return this.name;
    }

    public String trackName() {
        return this.name;
    }

    public String artistName() {
        return this.genre;
    }
}
