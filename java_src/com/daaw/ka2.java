package com.daaw;
/* loaded from: classes.dex */
public final class ka2 {
    public final ha2 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ka2(ha2 ha2Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        uo4.d(length == length2);
        int length3 = jArr.length;
        uo4.d(length3 == length2);
        int length4 = iArr2.length;
        uo4.d(length4 == length2);
        this.a = ha2Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int N = it5.N(this.f, j, true, false); N >= 0; N--) {
            if ((this.g[N] & 1) != 0) {
                return N;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int L = it5.L(this.f, j, true, false); L < this.f.length; L++) {
            if ((this.g[L] & 1) != 0) {
                return L;
            }
        }
        return -1;
    }
}
