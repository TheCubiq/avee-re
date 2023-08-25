package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.daaw.vk */
/* loaded from: classes.dex */
public final class C3342vk extends FilterInputStream {

    /* renamed from: p */
    public final long f30278p;

    /* renamed from: q */
    public int f30279q;

    public C3342vk(InputStream inputStream, long j) {
        super(inputStream);
        this.f30278p = j;
    }

    /* renamed from: n */
    public static InputStream m7099n(InputStream inputStream, long j) {
        return new C3342vk(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f30278p - this.f30279q, ((FilterInputStream) this).in.available());
    }

    /* renamed from: d */
    public final int m7100d(int i) {
        if (i >= 0) {
            this.f30279q += i;
        } else if (this.f30278p - this.f30279q > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f30278p + ", but read: " + this.f30279q);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        return m7100d(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        return m7100d(super.read(bArr, i, i2));
    }
}
