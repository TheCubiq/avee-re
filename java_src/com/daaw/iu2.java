package com.daaw;
/* loaded from: classes.dex */
public final class iu2 {

    /* renamed from: a */
    public final int f14008a;

    /* renamed from: b */
    public final long[] f14009b;

    /* renamed from: c */
    public final int[] f14010c;

    /* renamed from: d */
    public final int f14011d;

    /* renamed from: e */
    public final long[] f14012e;

    /* renamed from: f */
    public final int[] f14013f;

    public iu2(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        az2.m26585c(iArr.length == length);
        int length2 = jArr.length;
        az2.m26585c(length2 == length);
        az2.m26585c(iArr2.length == length);
        this.f14009b = jArr;
        this.f14010c = iArr;
        this.f14011d = i;
        this.f14012e = jArr2;
        this.f14013f = iArr2;
        this.f14008a = length2;
    }

    /* renamed from: a */
    public final int m19348a(long j) {
        for (int m12847c = pz2.m12847c(this.f14012e, j, true, false); m12847c >= 0; m12847c--) {
            if ((this.f14013f[m12847c] & 1) != 0) {
                return m12847c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m19347b(long j) {
        for (int m12848b = pz2.m12848b(this.f14012e, j, true, false); m12848b < this.f14012e.length; m12848b++) {
            if ((this.f14013f[m12848b] & 1) != 0) {
                return m12848b;
            }
        }
        return -1;
    }
}
