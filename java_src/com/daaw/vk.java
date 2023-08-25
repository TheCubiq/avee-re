package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class vk extends FilterInputStream {
    public final long p;
    public int q;

    public vk(InputStream inputStream, long j) {
        super(inputStream);
        this.p = j;
    }

    public static InputStream n(InputStream inputStream, long j) {
        return new vk(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.p - this.q, ((FilterInputStream) this).in.available());
    }

    public final int d(int i) {
        if (i >= 0) {
            this.q += i;
        } else if (this.p - this.q > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.p + ", but read: " + this.q);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        return d(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        return d(super.read(bArr, i, i2));
    }
}
