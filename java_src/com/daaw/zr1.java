package com.daaw;
/* loaded from: classes.dex */
public final class zr1 {

    /* renamed from: d */
    public static final long[] f35427d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f35428a = new byte[8];

    /* renamed from: b */
    public int f35429b;

    /* renamed from: c */
    public int f35430c;

    /* renamed from: a */
    public static long m1969a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= f35427d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m1967c(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f35427d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & i) > 0L ? 1 : ((jArr[i3] & i) == 0L ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: b */
    public int m1968b() {
        return this.f35430c;
    }

    /* renamed from: d */
    public long m1966d(a00 a00Var, boolean z, boolean z2, int i) {
        if (this.f35429b == 0) {
            if (!a00Var.mo5864c(this.f35428a, 0, 1, z)) {
                return -1L;
            }
            int m1967c = m1967c(this.f35428a[0] & 255);
            this.f35430c = m1967c;
            if (m1967c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f35429b = 1;
        }
        int i2 = this.f35430c;
        if (i2 > i) {
            this.f35429b = 0;
            return -2L;
        }
        if (i2 != 1) {
            a00Var.mo5861f(this.f35428a, 1, i2 - 1);
        }
        this.f35429b = 0;
        return m1969a(this.f35428a, this.f35430c, z2);
    }

    /* renamed from: e */
    public void m1965e() {
        this.f35429b = 0;
        this.f35430c = 0;
    }
}
