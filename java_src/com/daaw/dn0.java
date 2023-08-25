package com.daaw;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public class dn0 extends FilterInputStream {

    /* renamed from: p */
    public int f7491p;

    public dn0(InputStream inputStream) {
        super(inputStream);
        this.f7491p = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.f7491p;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: d */
    public final long m24211d(long j) {
        int i = this.f7491p;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.f7491p = i;
    }

    /* renamed from: n */
    public final void m24210n(long j) {
        int i = this.f7491p;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f7491p = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m24211d(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m24210n(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int m24211d = (int) m24211d(i2);
        if (m24211d == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m24211d);
        m24210n(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.f7491p = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long m24211d = m24211d(j);
        if (m24211d == -1) {
            return -1L;
        }
        long skip = super.skip(m24211d);
        m24210n(skip);
        return skip;
    }
}
