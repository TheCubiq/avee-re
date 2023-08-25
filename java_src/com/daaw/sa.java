package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public abstract class sa extends zn0 {
    public final long j;
    public ta k;
    public int[] l;

    public sa(mp mpVar, pp ppVar, Format format, int i, Object obj, long j, long j2, long j3, long j4) {
        super(mpVar, ppVar, format, i, obj, j, j2, j4);
        this.j = j3;
    }

    public final int g(int i) {
        return this.l[i];
    }

    public final ta h() {
        return this.k;
    }

    public void i(ta taVar) {
        this.k = taVar;
        this.l = taVar.b();
    }
}
