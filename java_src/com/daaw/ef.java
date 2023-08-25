package com.daaw;

import com.daaw.jk0;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public abstract class ef implements jk0.c {
    public final pp a;
    public final int b;
    public final Format c;
    public final int d;
    public final Object e;
    public final long f;
    public final long g;
    public final mp h;

    public ef(mp mpVar, pp ppVar, int i, Format format, int i2, Object obj, long j, long j2) {
        this.h = (mp) s6.e(mpVar);
        this.a = (pp) s6.e(ppVar);
        this.b = i;
        this.c = format;
        this.d = i2;
        this.e = obj;
        this.f = j;
        this.g = j2;
    }

    public abstract long c();

    public final long d() {
        return this.g - this.f;
    }
}
