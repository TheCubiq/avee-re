package org.conscrypt;

import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
final class OpenSSLBIOSource {
    private OpenSSLBIOInputStream source;

    /* loaded from: classes2.dex */
    public static class ByteBufferInputStream extends InputStream {
        private final ByteBuffer source;

        public ByteBufferInputStream(ByteBuffer byteBuffer) {
            this.source = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.source.limit() - this.source.position();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.source.remaining() > 0) {
                return this.source.get();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            int position = this.source.position();
            this.source.get(bArr);
            return this.source.position() - position;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int min = Math.min(this.source.remaining(), i2);
            int position = this.source.position();
            this.source.get(bArr, i, min);
            return this.source.position() - position;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.source.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            long position = this.source.position();
            this.source.position((int) (j + position));
            return this.source.position() - position;
        }
    }

    private OpenSSLBIOSource(OpenSSLBIOInputStream openSSLBIOInputStream) {
        this.source = openSSLBIOInputStream;
    }

    private synchronized void release() {
        OpenSSLBIOInputStream openSSLBIOInputStream = this.source;
        if (openSSLBIOInputStream != null) {
            NativeCrypto.BIO_free_all(openSSLBIOInputStream.getBioContext());
            this.source = null;
        }
    }

    public static OpenSSLBIOSource wrap(ByteBuffer byteBuffer) {
        return new OpenSSLBIOSource(new OpenSSLBIOInputStream(new ByteBufferInputStream(byteBuffer), false));
    }

    public void finalize() {
        try {
            release();
        } finally {
            super.finalize();
        }
    }

    public long getContext() {
        return this.source.getBioContext();
    }
}
