package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public class gx0 implements Cloneable {
    public final a p;
    public final boolean q;
    public final String r;

    /* loaded from: classes.dex */
    public enum a {
        FOOBAR2000,
        ITUNES,
        MEDIA_PLAYER_CLASSIC,
        MPLAYER,
        QUICKTIME,
        REALPLAYER,
        VLC_MEDIA_PLAYER,
        WINAMP,
        WINDOWS_MEDIA_PLAYER
    }

    public gx0(a aVar, boolean z, String str) {
        Objects.requireNonNull(aVar, "no player");
        this.p = aVar;
        this.q = z;
        this.r = str;
    }

    public Object clone() {
        return super.clone();
    }
}
