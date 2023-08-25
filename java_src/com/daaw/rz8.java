package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class rz8 implements k09 {
    public final xp8 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        k63.b("media3.extractor");
    }

    public rz8(xp8 xp8Var, long j, long j2) {
        this.b = xp8Var;
        this.d = j;
        this.c = j2;
    }

    @Override // com.daaw.k09, com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        int m = m(bArr, i, i2);
        if (m == 0) {
            m = n(bArr, i, i2, 0, true);
        }
        p(m);
        return m;
    }

    @Override // com.daaw.k09
    public final int b(int i) {
        int o = o(1);
        if (o == 0) {
            o = n(this.a, 0, Math.min(1, 4096), 0, true);
        }
        p(o);
        return o;
    }

    @Override // com.daaw.k09
    public final void c(int i) {
        k(i, false);
    }

    @Override // com.daaw.k09
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        int m = m(bArr, i, i2);
        while (m < i2 && m != -1) {
            m = n(bArr, i, i2, m, z);
        }
        p(m);
        return m != -1;
    }

    @Override // com.daaw.k09
    public final int f(byte[] bArr, int i, int i2) {
        int min;
        q(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = n(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    @Override // com.daaw.k09
    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        if (k(i2, z)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.daaw.k09
    public final void i(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    @Override // com.daaw.k09
    public final void j(byte[] bArr, int i, int i2) {
        h(bArr, i, i2, false);
    }

    public final boolean k(int i, boolean z) {
        q(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = n(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public final boolean l(int i, boolean z) {
        int o = o(i);
        while (o < i && o != -1) {
            o = n(this.a, -o, Math.min(i, o + 4096), o, false);
        }
        p(o);
        return o != -1;
    }

    public final int m(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        r(min);
        return min;
    }

    public final int n(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int a = this.b.a(bArr, i + i3, i2 - i3);
        if (a == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + a;
    }

    public final int o(int i) {
        int min = Math.min(this.g, i);
        r(min);
        return min;
    }

    public final void p(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    public final void q(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, it5.P(length + length, 65536 + i2, i2 + 524288));
        }
    }

    public final void r(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.daaw.k09
    public final void u(int i) {
        l(i, false);
    }

    @Override // com.daaw.k09
    public final long zzd() {
        return this.c;
    }

    @Override // com.daaw.k09
    public final long zze() {
        return this.d + this.f;
    }

    @Override // com.daaw.k09
    public final long zzf() {
        return this.d;
    }

    @Override // com.daaw.k09
    public final void zzj() {
        this.f = 0;
    }
}
