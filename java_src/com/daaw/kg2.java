package com.daaw;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class kg2 extends FilterInputStream {
    public final long p;
    public long q;

    public kg2(InputStream inputStream, long j) {
        super(inputStream);
        this.p = j;
    }

    public final long d() {
        return this.p - this.q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.q++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.q += read;
        }
        return read;
    }
}
