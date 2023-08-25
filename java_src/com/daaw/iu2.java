package com.daaw;
/* loaded from: classes.dex */
public final class iu2 {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public iu2(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        az2.c(iArr.length == length);
        int length2 = jArr.length;
        az2.c(length2 == length);
        az2.c(iArr2.length == length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = length2;
    }

    public final int a(long j) {
        for (int c = pz2.c(this.e, j, true, false); c >= 0; c--) {
            if ((this.f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int b = pz2.b(this.e, j, true, false); b < this.e.length; b++) {
            if ((this.f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
