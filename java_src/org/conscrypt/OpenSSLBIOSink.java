package org.conscrypt;

import java.io.ByteArrayOutputStream;
/* loaded from: classes2.dex */
final class OpenSSLBIOSink {
    private final ByteArrayOutputStream buffer;
    private final long ctx;
    private int position;

    private OpenSSLBIOSink(ByteArrayOutputStream byteArrayOutputStream) {
        this.ctx = NativeCrypto.create_BIO_OutputStream(byteArrayOutputStream);
        this.buffer = byteArrayOutputStream;
    }

    public static OpenSSLBIOSink create() {
        return new OpenSSLBIOSink(new ByteArrayOutputStream());
    }

    public int available() {
        return this.buffer.size() - this.position;
    }

    public void finalize() {
        try {
            NativeCrypto.BIO_free_all(this.ctx);
        } finally {
            super.finalize();
        }
    }

    public long getContext() {
        return this.ctx;
    }

    public int position() {
        return this.position;
    }

    public void reset() {
        this.buffer.reset();
        this.position = 0;
    }

    public long skip(long j) {
        int min = Math.min(available(), (int) j);
        int i = this.position + min;
        this.position = i;
        if (i == this.buffer.size()) {
            reset();
        }
        return min;
    }

    public byte[] toByteArray() {
        return this.buffer.toByteArray();
    }
}
