package com.daaw;
/* loaded from: classes.dex */
public final class di8 {

    /* renamed from: e */
    public static final di8 f7132e = new di8(-1, -1, -1);

    /* renamed from: a */
    public final int f7133a;

    /* renamed from: b */
    public final int f7134b;

    /* renamed from: c */
    public final int f7135c;

    /* renamed from: d */
    public final int f7136d;

    public di8(int i, int i2, int i3) {
        this.f7133a = i;
        this.f7134b = i2;
        this.f7135c = i3;
        this.f7136d = it5.m19374v(i3) ? it5.m19407Y(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f7133a;
        int i2 = this.f7134b;
        int i3 = this.f7135c;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
