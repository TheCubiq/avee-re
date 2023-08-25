package com.daaw;

import java.io.ByteArrayOutputStream;
/* loaded from: classes.dex */
public final class zg2 extends ByteArrayOutputStream {
    public final hg2 p;

    public zg2(hg2 hg2Var, int i) {
        this.p = hg2Var;
        ((ByteArrayOutputStream) this).buf = hg2Var.b(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void d(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] b = this.p.b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b, 0, ((ByteArrayOutputStream) this).count);
        this.p.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b;
    }

    public final void finalize() {
        this.p.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        d(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        d(i2);
        super.write(bArr, i, i2);
    }
}
