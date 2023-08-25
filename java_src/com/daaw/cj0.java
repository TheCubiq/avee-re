package com.daaw;

import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class cj0 extends OutputStream {
    public long p = 0;

    public long d() {
        return this.p;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.p++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.p += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.p += i2;
    }
}
