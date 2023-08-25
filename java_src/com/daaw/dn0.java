package com.daaw;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public class dn0 extends FilterInputStream {
    public int p;

    public dn0(InputStream inputStream) {
        super(inputStream);
        this.p = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.p;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long d(long j) {
        int i = this.p;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.p = i;
    }

    public final void n(long j) {
        int i = this.p;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.p = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (d(1L) == -1) {
            return -1;
        }
        int read = super.read();
        n(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int d = (int) d(i2);
        if (d == -1) {
            return -1;
        }
        int read = super.read(bArr, i, d);
        n(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.p = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long d = d(j);
        if (d == -1) {
            return -1L;
        }
        long skip = super.skip(d);
        n(skip);
        return skip;
    }
}
