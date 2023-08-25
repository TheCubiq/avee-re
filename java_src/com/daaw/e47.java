package com.daaw;

import java.io.OutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class e47 extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        sy6.g(i, i2 + i, bArr.length);
    }
}
