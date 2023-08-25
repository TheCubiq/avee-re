package com.daaw;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class kg2 extends FilterInputStream {

    /* renamed from: p */
    public final long f16360p;

    /* renamed from: q */
    public long f16361q;

    public kg2(InputStream inputStream, long j) {
        super(inputStream);
        this.f16360p = j;
    }

    /* renamed from: d */
    public final long m17755d() {
        return this.f16360p - this.f16361q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f16361q++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f16361q += read;
        }
        return read;
    }
}
