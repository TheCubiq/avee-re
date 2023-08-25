package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class op extends InputStream {
    public final mp p;
    public final pp q;
    public long u;
    public boolean s = false;
    public boolean t = false;
    public final byte[] r = new byte[1];

    public op(mp mpVar, pp ppVar) {
        this.p = mpVar;
        this.q = ppVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.t) {
            return;
        }
        this.p.close();
        this.t = true;
    }

    public long d() {
        return this.u;
    }

    public final void n() {
        if (this.s) {
            return;
        }
        this.p.c(this.q);
        this.s = true;
    }

    public void q() {
        n();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.r) == -1) {
            return -1;
        }
        return this.r[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        s6.f(!this.t);
        n();
        int b = this.p.b(bArr, i, i2);
        if (b == -1) {
            return -1;
        }
        this.u += b;
        return b;
    }
}
