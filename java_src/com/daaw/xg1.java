package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class xg1 implements Closeable {
    public final InputStream p;
    public final Charset q;
    public byte[] r;
    public int s;
    public int t;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, xg1.this.q.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public xg1(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(uq1.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.p = inputStream;
        this.q = charset;
        this.r = new byte[i];
    }

    public xg1(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.p) {
            if (this.r != null) {
                this.r = null;
                this.p.close();
            }
        }
    }

    public final void n() {
        InputStream inputStream = this.p;
        byte[] bArr = this.r;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.s = 0;
        this.t = read;
    }

    public boolean q() {
        return this.t == -1;
    }

    public String u() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.p) {
            if (this.r != null) {
                if (this.s >= this.t) {
                    n();
                }
                for (int i3 = this.s; i3 != this.t; i3++) {
                    byte[] bArr2 = this.r;
                    if (bArr2[i3] == 10) {
                        int i4 = this.s;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.q.name());
                                this.s = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.q.name());
                        this.s = i3 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.t - this.s) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.r;
                    int i5 = this.s;
                    aVar.write(bArr3, i5, this.t - i5);
                    this.t = -1;
                    n();
                    i = this.s;
                    while (i != this.t) {
                        bArr = this.r;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.s;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.s = i + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
