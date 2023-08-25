package com.daaw;
/* loaded from: classes.dex */
public final class tm1 {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;
    public final long g;

    public tm1(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        s6.a(iArr.length == jArr2.length);
        s6.a(jArr.length == jArr2.length);
        s6.a(iArr2.length == jArr2.length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.g = j;
        this.a = jArr.length;
    }

    public int a(long j) {
        for (int e = sq1.e(this.e, j, true, false); e >= 0; e--) {
            if ((this.f[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int c = sq1.c(this.e, j, true, false); c < this.e.length; c++) {
            if ((this.f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }
}
