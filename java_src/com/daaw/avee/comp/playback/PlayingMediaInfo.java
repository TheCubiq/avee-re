package com.daaw.avee.comp.playback;
/* loaded from: classes.dex */
public class PlayingMediaInfo {
    public static final PlayingMediaInfo empty = new PlayingMediaInfo(0, false);
    public final boolean containsVideoTrack;
    public final long duration;

    public PlayingMediaInfo(long j, boolean z) {
        this.duration = j;
        this.containsVideoTrack = z;
    }
}
