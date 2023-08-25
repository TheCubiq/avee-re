package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class nm1 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final Format f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final pm1[] k;

    public nm1(int i, int i2, long j, long j2, long j3, Format format, int i3, pm1[] pm1VarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = format;
        this.g = i3;
        this.k = pm1VarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public pm1 a(int i) {
        pm1[] pm1VarArr = this.k;
        if (pm1VarArr == null) {
            return null;
        }
        return pm1VarArr[i];
    }
}
