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

    /* renamed from: p */
    public final InputStream f32694p;

    /* renamed from: q */
    public final Charset f32695q;

    /* renamed from: r */
    public byte[] f32696r;

    /* renamed from: s */
    public int f32697s;

    /* renamed from: t */
    public int f32698t;

    /* renamed from: com.daaw.xg1$a */
    /* loaded from: classes.dex */
    public class C3541a extends ByteArrayOutputStream {
        public C3541a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, xg1.this.f32695q.name());
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
        if (!charset.equals(uq1.f29445a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f32694p = inputStream;
        this.f32695q = charset;
        this.f32696r = new byte[i];
    }

    public xg1(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f32694p) {
            if (this.f32696r != null) {
                this.f32696r = null;
                this.f32694p.close();
            }
        }
    }

    /* renamed from: n */
    public final void m5139n() {
        InputStream inputStream = this.f32694p;
        byte[] bArr = this.f32696r;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f32697s = 0;
        this.f32698t = read;
    }

    /* renamed from: q */
    public boolean m5138q() {
        return this.f32698t == -1;
    }

    /* renamed from: u */
    public String m5137u() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f32694p) {
            if (this.f32696r != null) {
                if (this.f32697s >= this.f32698t) {
                    m5139n();
                }
                for (int i3 = this.f32697s; i3 != this.f32698t; i3++) {
                    byte[] bArr2 = this.f32696r;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f32697s;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f32695q.name());
                                this.f32697s = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f32695q.name());
                        this.f32697s = i3 + 1;
                        return str2;
                    }
                }
                C3541a c3541a = new C3541a((this.f32698t - this.f32697s) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f32696r;
                    int i5 = this.f32697s;
                    c3541a.write(bArr3, i5, this.f32698t - i5);
                    this.f32698t = -1;
                    m5139n();
                    i = this.f32697s;
                    while (i != this.f32698t) {
                        bArr = this.f32696r;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f32697s;
                if (i != i6) {
                    c3541a.write(bArr, i6, i - i6);
                }
                this.f32697s = i + 1;
                return c3541a.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
