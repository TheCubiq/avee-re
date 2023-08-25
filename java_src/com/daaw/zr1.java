package com.daaw;
/* loaded from: classes.dex */
public final class zr1 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int c(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & i) > 0L ? 1 : ((jArr[i3] & i) == 0L ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public int b() {
        return this.c;
    }

    public long d(a00 a00Var, boolean z, boolean z2, int i) {
        if (this.b == 0) {
            if (!a00Var.c(this.a, 0, 1, z)) {
                return -1L;
            }
            int c = c(this.a[0] & 255);
            this.c = c;
            if (c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2L;
        }
        if (i2 != 1) {
            a00Var.f(this.a, 1, i2 - 1);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}
