package com.daaw;

import java.io.InputStream;
/* renamed from: com.daaw.op */
/* loaded from: classes.dex */
public final class C2464op extends InputStream {

    /* renamed from: p */
    public final InterfaceC2200mp f21786p;

    /* renamed from: q */
    public final C2570pp f21787q;

    /* renamed from: u */
    public long f21791u;

    /* renamed from: s */
    public boolean f21789s = false;

    /* renamed from: t */
    public boolean f21790t = false;

    /* renamed from: r */
    public final byte[] f21788r = new byte[1];

    public C2464op(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp) {
        this.f21786p = interfaceC2200mp;
        this.f21787q = c2570pp;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f21790t) {
            return;
        }
        this.f21786p.close();
        this.f21790t = true;
    }

    /* renamed from: d */
    public long m14115d() {
        return this.f21791u;
    }

    /* renamed from: n */
    public final void m14114n() {
        if (this.f21789s) {
            return;
        }
        this.f21786p.mo8641c(this.f21787q);
        this.f21789s = true;
    }

    /* renamed from: q */
    public void m14113q() {
        m14114n();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f21788r) == -1) {
            return -1;
        }
        return this.f21788r[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C2914s6.m10685f(!this.f21790t);
        m14114n();
        int mo8642b = this.f21786p.mo8642b(bArr, i, i2);
        if (mo8642b == -1) {
            return -1;
        }
        this.f21791u += mo8642b;
        return mo8642b;
    }
}
