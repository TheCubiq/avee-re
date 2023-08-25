package com.daaw;
/* loaded from: classes.dex */
public final class di8 {
    public static final di8 e = new di8(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public di8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = it5.v(i3) ? it5.Y(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
