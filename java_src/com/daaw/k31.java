package com.daaw;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class k31 extends FilterInputStream {
    public volatile byte[] p;
    public int q;
    public int r;
    public int s;
    public int t;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public k31(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.s = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.p = bArr;
    }

    public static IOException q() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.p == null || inputStream == null) {
            throw q();
        }
        return (this.q - this.t) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.p = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int d(InputStream inputStream, byte[] bArr) {
        int i = this.s;
        if (i != -1) {
            int i2 = this.t - i;
            int i3 = this.r;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.q == bArr.length) {
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
                    this.p = bArr2;
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.t - this.s;
                this.t = i4;
                this.s = 0;
                this.q = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.t;
                if (read > 0) {
                    i5 += read;
                }
                this.q = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.s = -1;
            this.t = 0;
            this.q = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.r = Math.max(this.r, i);
        this.s = this.t;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public synchronized void n() {
        this.r = this.p.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.p;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw q();
        }
        if (this.t < this.q || d(inputStream, bArr) != -1) {
            if (bArr != this.p && (bArr = this.p) == null) {
                throw q();
            }
            int i = this.q;
            int i2 = this.t;
            if (i - i2 > 0) {
                this.t = i2 + 1;
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
        byte[] bArr2 = this.p;
        if (bArr2 == null) {
            throw q();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw q();
        }
        int i5 = this.t;
        int i6 = this.q;
        if (i5 < i6) {
            int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.t += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.s == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else if (d(inputStream, bArr2) == -1) {
                return i3 != i2 ? i2 - i3 : -1;
            } else {
                if (bArr2 != this.p && (bArr2 = this.p) == null) {
                    throw q();
                }
                int i8 = this.q;
                int i9 = this.t;
                i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.t += i4;
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
        if (this.p == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.s;
        if (-1 == i) {
            throw new a("Mark has been invalidated");
        }
        this.t = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        byte[] bArr = this.p;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null) {
            if (j < 1) {
                return 0L;
            }
            if (inputStream != null) {
                int i = this.q;
                int i2 = this.t;
                if (i - i2 >= j) {
                    this.t = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.t = i;
                if (this.s == -1 || j > this.r) {
                    return j2 + inputStream.skip(j - j2);
                } else if (d(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.q;
                    int i4 = this.t;
                    long j3 = j - j2;
                    if (i3 - i4 >= j3) {
                        this.t = (int) (i4 + j3);
                        return j;
                    }
                    long j4 = (j2 + i3) - i4;
                    this.t = i3;
                    return j4;
                }
            }
            throw q();
        }
        throw q();
    }
}
