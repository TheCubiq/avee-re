package com.daaw;
/* loaded from: classes.dex */
public final class ka2 {

    /* renamed from: a */
    public final ha2 f15844a;

    /* renamed from: b */
    public final int f15845b;

    /* renamed from: c */
    public final long[] f15846c;

    /* renamed from: d */
    public final int[] f15847d;

    /* renamed from: e */
    public final int f15848e;

    /* renamed from: f */
    public final long[] f15849f;

    /* renamed from: g */
    public final int[] f15850g;

    /* renamed from: h */
    public final long f15851h;

    public ka2(ha2 ha2Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        uo4.m7874d(length == length2);
        int length3 = jArr.length;
        uo4.m7874d(length3 == length2);
        int length4 = iArr2.length;
        uo4.m7874d(length4 == length2);
        this.f15844a = ha2Var;
        this.f15846c = jArr;
        this.f15847d = iArr;
        this.f15848e = i;
        this.f15849f = jArr2;
        this.f15850g = iArr2;
        this.f15851h = j;
        this.f15845b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m17922a(long j) {
        for (int m19418N = it5.m19418N(this.f15849f, j, true, false); m19418N >= 0; m19418N--) {
            if ((this.f15850g[m19418N] & 1) != 0) {
                return m19418N;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m17921b(long j) {
        for (int m19420L = it5.m19420L(this.f15849f, j, true, false); m19420L < this.f15849f.length; m19420L++) {
            if ((this.f15850g[m19420L] & 1) != 0) {
                return m19420L;
            }
        }
        return -1;
    }
}
