package com.daaw;

import java.io.EOFException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ms2 {
    public static final byte[] g = new byte[4096];
    public final kx2 a;
    public final long b;
    public long c;
    public byte[] d = new byte[65536];
    public int e;
    public int f;

    public ms2(kx2 kx2Var, long j, long j2) {
        this.a = kx2Var;
        this.c = j;
        this.b = j2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int k = k(bArr, i, i2);
        if (k == 0) {
            k = j(bArr, i, i2, 0, true);
        }
        m(k);
        return k;
    }

    public final int b(int i) {
        int l = l(i);
        if (l == 0) {
            l = j(g, 0, Math.min(i, 4096), 0, true);
        }
        m(l);
        return l;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final void e() {
        this.e = 0;
    }

    public final boolean f(int i, boolean z) {
        int i2 = this.e + i;
        int length = this.d.length;
        if (i2 > length) {
            this.d = Arrays.copyOf(this.d, pz2.e(length + length, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f - this.e, i);
        while (min < i) {
            min = j(this.d, this.e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.e + i;
        this.e = i3;
        this.f = Math.max(this.f, i3);
        return true;
    }

    public final boolean g(byte[] bArr, int i, int i2, boolean z) {
        if (f(i2, false)) {
            System.arraycopy(this.d, this.e - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        int k = k(bArr, i, i2);
        while (k < i2 && k != -1) {
            k = j(bArr, i, i2, k, z);
        }
        m(k);
        return k != -1;
    }

    public final boolean i(int i, boolean z) {
        int l = l(i);
        while (l < i && l != -1) {
            l = j(g, -l, Math.min(i, l + 4096), l, false);
        }
        m(l);
        return l != -1;
    }

    public final int j(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int a = this.a.a(bArr, i + i3, i2 - i3);
        if (a == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + a;
    }

    public final int k(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.d, 0, bArr, i, min);
        n(min);
        return min;
    }

    public final int l(int i) {
        int min = Math.min(this.f, i);
        n(min);
        return min;
    }

    public final void m(int i) {
        if (i != -1) {
            this.c += i;
        }
    }

    public final void n(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.d = bArr2;
    }
}
