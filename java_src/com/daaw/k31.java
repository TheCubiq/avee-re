package com.daaw;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class k31 extends FilterInputStream {

    /* renamed from: p */
    public volatile byte[] f15634p;

    /* renamed from: q */
    public int f15635q;

    /* renamed from: r */
    public int f15636r;

    /* renamed from: s */
    public int f15637s;

    /* renamed from: t */
    public int f15638t;

    /* renamed from: com.daaw.k31$a */
    /* loaded from: classes.dex */
    public static class C1908a extends RuntimeException {
        public C1908a(String str) {
            super(str);
        }
    }

    public k31(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f15637s = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f15634p = bArr;
    }

    /* renamed from: q */
    public static IOException m18064q() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f15634p == null || inputStream == null) {
            throw m18064q();
        }
        return (this.f15635q - this.f15638t) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15634p = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final int m18066d(InputStream inputStream, byte[] bArr) {
        int i = this.f15637s;
        if (i != -1) {
            int i2 = this.f15638t - i;
            int i3 = this.f15636r;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f15635q == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    if (Log.isLoggable("BufferedIs", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("allocate buffer of length: ");
                        sb.append(i3);
                    }
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f15634p = bArr2;
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f15638t - this.f15637s;
                this.f15638t = i4;
                this.f15637s = 0;
                this.f15635q = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f15638t;
                if (read > 0) {
                    i5 += read;
                }
                this.f15635q = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f15637s = -1;
            this.f15638t = 0;
            this.f15635q = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f15636r = Math.max(this.f15636r, i);
        this.f15637s = this.f15638t;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    /* renamed from: n */
    public synchronized void m18065n() {
        this.f15636r = this.f15634p.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f15634p;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m18064q();
        }
        if (this.f15638t < this.f15635q || m18066d(inputStream, bArr) != -1) {
            if (bArr != this.f15634p && (bArr = this.f15634p) == null) {
                throw m18064q();
            }
            int i = this.f15635q;
            int i2 = this.f15638t;
            if (i - i2 > 0) {
                this.f15638t = i2 + 1;
                return bArr[i2] & 255;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f15634p;
        if (bArr2 == null) {
            throw m18064q();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m18064q();
        }
        int i5 = this.f15638t;
        int i6 = this.f15635q;
        if (i5 < i6) {
            int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f15638t += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f15637s == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else if (m18066d(inputStream, bArr2) == -1) {
                return i3 != i2 ? i2 - i3 : -1;
            } else {
                if (bArr2 != this.f15634p && (bArr2 = this.f15634p) == null) {
                    throw m18064q();
                }
                int i8 = this.f15635q;
                int i9 = this.f15638t;
                i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f15638t += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f15634p == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f15637s;
        if (-1 == i) {
            throw new C1908a("Mark has been invalidated");
        }
        this.f15638t = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        byte[] bArr = this.f15634p;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null) {
            if (j < 1) {
                return 0L;
            }
            if (inputStream != null) {
                int i = this.f15635q;
                int i2 = this.f15638t;
                if (i - i2 >= j) {
                    this.f15638t = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.f15638t = i;
                if (this.f15637s == -1 || j > this.f15636r) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m18066d(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f15635q;
                    int i4 = this.f15638t;
                    long j3 = j - j2;
                    if (i3 - i4 >= j3) {
                        this.f15638t = (int) (i4 + j3);
                        return j;
                    }
                    long j4 = (j2 + i3) - i4;
                    this.f15638t = i3;
                    return j4;
                }
            }
            throw m18064q();
        }
        throw m18064q();
    }
}
