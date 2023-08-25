package com.daaw;
/* loaded from: classes.dex */
public final class kt2 {

    /* renamed from: d */
    public static final long[] f16737d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f16738a = new byte[8];

    /* renamed from: b */
    public int f16739b;

    /* renamed from: c */
    public int f16740c;

    /* renamed from: b */
    public static int m17439b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f16737d[i2] & i) > 0L ? 1 : ((f16737d[i2] & i) == 0L ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m17438c(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= f16737d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int m17440a() {
        return this.f16740c;
    }

    /* renamed from: d */
    public final void m17437d() {
        this.f16739b = 0;
        this.f16740c = 0;
    }

    /* renamed from: e */
    public final long m17436e(ms2 ms2Var, boolean z, boolean z2, int i) {
        if (this.f16739b == 0) {
            if (!ms2Var.m15797h(this.f16738a, 0, 1, z)) {
                return -1L;
            }
            int m17439b = m17439b(this.f16738a[0] & 255);
            this.f16740c = m17439b;
            if (m17439b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f16739b = 1;
        }
        int i2 = this.f16740c;
        if (i2 > i) {
            this.f16739b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ms2Var.m15797h(this.f16738a, 1, i2 - 1, false);
        }
        this.f16739b = 0;
        return m17438c(this.f16738a, this.f16740c, z2);
    }
}
