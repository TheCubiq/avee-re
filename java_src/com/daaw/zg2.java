package com.daaw;

import java.io.ByteArrayOutputStream;
/* loaded from: classes.dex */
public final class zg2 extends ByteArrayOutputStream {

    /* renamed from: p */
    public final hg2 f35030p;

    public zg2(hg2 hg2Var, int i) {
        this.f35030p = hg2Var;
        ((ByteArrayOutputStream) this).buf = hg2Var.m20801b(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35030p.m20802a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    /* renamed from: d */
    public final void m2342d(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] m20801b = this.f35030p.m20801b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m20801b, 0, ((ByteArrayOutputStream) this).count);
        this.f35030p.m20802a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m20801b;
    }

    public final void finalize() {
        this.f35030p.m20802a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m2342d(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m2342d(i2);
        super.write(bArr, i, i2);
    }
}
