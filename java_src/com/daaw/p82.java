package com.daaw;
/* loaded from: classes.dex */
public final class p82 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static int b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((d[i2] & i) > 0L ? 1 : ((d[i2] & i) == 0L ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final int a() {
        return this.c;
    }

    public final long d(k09 k09Var, boolean z, boolean z2, int i) {
        if (this.b == 0) {
            if (!k09Var.e(this.a, 0, 1, z)) {
                return -1L;
            }
            int b = b(this.a[0] & 255);
            this.c = b;
            if (b == -1) {
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
            ((rz8) k09Var).e(this.a, 1, i2 - 1, false);
        }
        this.b = 0;
        return c(this.a, this.c, z2);
    }

    public final void e() {
        this.b = 0;
        this.c = 0;
    }
}
