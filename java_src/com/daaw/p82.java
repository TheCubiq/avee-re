package com.daaw;
/* loaded from: classes.dex */
public final class p82 {

    /* renamed from: d */
    public static final long[] f22694d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f22695a = new byte[8];

    /* renamed from: b */
    public int f22696b;

    /* renamed from: c */
    public int f22697c;

    /* renamed from: b */
    public static int m13591b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f22694d[i2] & i) > 0L ? 1 : ((f22694d[i2] & i) == 0L ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m13590c(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= f22694d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int m13592a() {
        return this.f22697c;
    }

    /* renamed from: d */
    public final long m13589d(k09 k09Var, boolean z, boolean z2, int i) {
        if (this.f22696b == 0) {
            if (!k09Var.mo5663e(this.f22695a, 0, 1, z)) {
                return -1L;
            }
            int m13591b = m13591b(this.f22695a[0] & 255);
            this.f22697c = m13591b;
            if (m13591b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f22696b = 1;
        }
        int i2 = this.f22697c;
        if (i2 > i) {
            this.f22696b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ((rz8) k09Var).mo5663e(this.f22695a, 1, i2 - 1, false);
        }
        this.f22696b = 0;
        return m13590c(this.f22695a, this.f22697c, z2);
    }

    /* renamed from: e */
    public final void m13588e() {
        this.f22696b = 0;
        this.f22697c = 0;
    }
}
