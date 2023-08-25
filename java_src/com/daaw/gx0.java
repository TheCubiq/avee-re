package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public class gx0 implements Cloneable {

    /* renamed from: p */
    public final EnumC1483a f11814p;

    /* renamed from: q */
    public final boolean f11815q;

    /* renamed from: r */
    public final String f11816r;

    /* renamed from: com.daaw.gx0$a */
    /* loaded from: classes.dex */
    public enum EnumC1483a {
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

    public gx0(EnumC1483a enumC1483a, boolean z, String str) {
        Objects.requireNonNull(enumC1483a, "no player");
        this.f11814p = enumC1483a;
        this.f11815q = z;
        this.f11816r = str;
    }

    public Object clone() {
        return super.clone();
    }
}
