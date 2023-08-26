package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
final class zzao extends FilterInputStream {
    private final long zzcc;
    private long zzcd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(InputStream inputStream, long j) {
        super(inputStream);
        this.zzcc = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.zzcd++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.zzcd += read;
        }
        return read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzo() {
        return this.zzcc - this.zzcd;
    }
}
