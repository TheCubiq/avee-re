package com.daaw;

import java.io.EOFException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class wq implements a00 {
    public final mp b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    public wq(mp mpVar, long j, long j2) {
        this.b = mpVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.daaw.a00
    public int a(int i) {
        int q = q(i);
        if (q == 0) {
            byte[] bArr = this.a;
            q = o(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m(q);
        return q;
    }

    @Override // com.daaw.a00
    public int b(byte[] bArr, int i, int i2) {
        int p = p(bArr, i, i2);
        if (p == 0) {
            p = o(bArr, i, i2, 0, true);
        }
        m(p);
        return p;
    }

    @Override // com.daaw.a00
    public boolean c(byte[] bArr, int i, int i2, boolean z) {
        int p = p(bArr, i, i2);
        while (p < i2 && p != -1) {
            p = o(bArr, i, i2, p, z);
        }
        m(p);
        return p != -1;
    }

    @Override // com.daaw.a00
    public boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (l(i2, z)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.daaw.a00
    public long e() {
        return this.d + this.f;
    }

    @Override // com.daaw.a00
    public void f(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }

    @Override // com.daaw.a00
    public void g(int i) {
        l(i, false);
    }

    @Override // com.daaw.a00
    public long getPosition() {
        return this.d;
    }

    @Override // com.daaw.a00
    public long h() {
        return this.c;
    }

    @Override // com.daaw.a00
    public void i() {
        this.f = 0;
    }

    @Override // com.daaw.a00
    public void j(int i) {
        r(i, false);
    }

    @Override // com.daaw.a00
    public void k(byte[] bArr, int i, int i2) {
        d(bArr, i, i2, false);
    }

    public boolean l(int i, boolean z) {
        n(i);
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = o(this.e, this.f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i2 = this.f + i;
        this.f = i2;
        this.g = Math.max(this.g, i2);
        return true;
    }

    public final void m(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    public final void n(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, sq1.l(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int o(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int b = this.b.b(bArr, i + i3, i2 - i3);
        if (b == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + b;
    }

    public final int p(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        s(min);
        return min;
    }

    public final int q(int i) {
        int min = Math.min(this.g, i);
        s(min);
        return min;
    }

    public boolean r(int i, boolean z) {
        int q = q(i);
        while (q < i && q != -1) {
            q = o(this.a, -q, Math.min(i, this.a.length + q), q, z);
        }
        m(q);
        return q != -1;
    }

    public final void s(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }
}
