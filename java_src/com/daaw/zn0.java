package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public abstract class zn0 extends ef {
    public final long i;

    public zn0(mp mpVar, pp ppVar, Format format, int i, Object obj, long j, long j2, long j3) {
        super(mpVar, ppVar, 1, format, i, obj, j, j2);
        s6.e(format);
        this.i = j3;
    }

    public long e() {
        long j = this.i;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean f();
}
