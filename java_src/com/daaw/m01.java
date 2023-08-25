package com.daaw;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public class m01 implements Closeable {
    public static final Logger v = Logger.getLogger(m01.class.getName());
    public final RandomAccessFile p;
    public int q;
    public int r;
    public b s;
    public b t;
    public final byte[] u = new byte[16];

    /* loaded from: classes2.dex */
    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // com.daaw.m01.d
        public void a(InputStream inputStream, int i) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends InputStream {
        public int p;
        public int q;

        public c(b bVar) {
            this.p = m01.this.d0(bVar.a + 4);
            this.q = bVar.b;
        }

        public /* synthetic */ c(m01 m01Var, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.q == 0) {
                return -1;
            }
            m01.this.p.seek(this.p);
            int read = m01.this.p.read();
            this.p = m01.this.d0(this.p + 1);
            this.q--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            m01.Q(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.q;
            if (i3 > 0) {
                if (i2 > i3) {
                    i2 = i3;
                }
                m01.this.Z(this.p, bArr, i, i2);
                this.p = m01.this.d0(this.p + i2);
                this.q -= i2;
                return i2;
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(InputStream inputStream, int i);
    }

    public m01(File file) {
        if (!file.exists()) {
            M(file);
        }
        this.p = T(file);
        V();
    }

    public static void M(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile T = T(file2);
        try {
            T.setLength(4096L);
            T.seek(0L);
            byte[] bArr = new byte[16];
            g0(bArr, 4096, 0, 0, 0);
            T.write(bArr);
            T.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            T.close();
            throw th;
        }
    }

    public static <T> T Q(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static RandomAccessFile T(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static int W(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void f0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void g0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            f0(bArr, i, i2);
            i += 4;
        }
    }

    public synchronized void D(byte[] bArr, int i, int i2) {
        int d0;
        Q(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        K(i2);
        boolean P = P();
        if (P) {
            d0 = 16;
        } else {
            b bVar = this.t;
            d0 = d0(bVar.a + 4 + bVar.b);
        }
        b bVar2 = new b(d0, i2);
        f0(this.u, 0, i2);
        a0(bVar2.a, this.u, 0, 4);
        a0(bVar2.a + 4, bArr, i, i2);
        e0(this.q, this.r + 1, P ? bVar2.a : this.s.a, bVar2.a);
        this.t = bVar2;
        this.r++;
        if (P) {
            this.s = bVar2;
        }
    }

    public synchronized void E() {
        e0(4096, 0, 0, 0);
        this.r = 0;
        b bVar = b.c;
        this.s = bVar;
        this.t = bVar;
        if (this.q > 4096) {
            b0(4096);
        }
        this.q = 4096;
    }

    public final void K(int i) {
        int i2 = i + 4;
        int X = X();
        if (X >= i2) {
            return;
        }
        int i3 = this.q;
        do {
            X += i3;
            i3 <<= 1;
        } while (X < i2);
        b0(i3);
        b bVar = this.t;
        int d0 = d0(bVar.a + 4 + bVar.b);
        if (d0 < this.s.a) {
            FileChannel channel = this.p.getChannel();
            channel.position(this.q);
            long j = d0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.t.a;
        int i5 = this.s.a;
        if (i4 < i5) {
            int i6 = (this.q + i4) - 16;
            e0(i3, this.r, i5, i6);
            this.t = new b(i6, this.t.b);
        } else {
            e0(i3, this.r, i5, i4);
        }
        this.q = i3;
    }

    public synchronized void L(d dVar) {
        int i = this.s.a;
        for (int i2 = 0; i2 < this.r; i2++) {
            b U = U(i);
            dVar.a(new c(this, U, null), U.b);
            i = d0(U.a + 4 + U.b);
        }
    }

    public synchronized boolean P() {
        return this.r == 0;
    }

    public final b U(int i) {
        if (i == 0) {
            return b.c;
        }
        this.p.seek(i);
        return new b(i, this.p.readInt());
    }

    public final void V() {
        this.p.seek(0L);
        this.p.readFully(this.u);
        int W = W(this.u, 0);
        this.q = W;
        if (W <= this.p.length()) {
            this.r = W(this.u, 4);
            int W2 = W(this.u, 8);
            int W3 = W(this.u, 12);
            this.s = U(W2);
            this.t = U(W3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.q + ", Actual length: " + this.p.length());
    }

    public final int X() {
        return this.q - c0();
    }

    public synchronized void Y() {
        if (P()) {
            throw new NoSuchElementException();
        }
        if (this.r == 1) {
            E();
        } else {
            b bVar = this.s;
            int d0 = d0(bVar.a + 4 + bVar.b);
            Z(d0, this.u, 0, 4);
            int W = W(this.u, 0);
            e0(this.q, this.r - 1, d0, this.t.a);
            this.r--;
            this.s = new b(d0, W);
        }
    }

    public final void Z(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int d0 = d0(i);
        int i4 = d0 + i3;
        int i5 = this.q;
        if (i4 <= i5) {
            this.p.seek(d0);
            randomAccessFile = this.p;
        } else {
            int i6 = i5 - d0;
            this.p.seek(d0);
            this.p.readFully(bArr, i2, i6);
            this.p.seek(16L);
            randomAccessFile = this.p;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    public final void a0(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int d0 = d0(i);
        int i4 = d0 + i3;
        int i5 = this.q;
        if (i4 <= i5) {
            this.p.seek(d0);
            randomAccessFile = this.p;
        } else {
            int i6 = i5 - d0;
            this.p.seek(d0);
            this.p.write(bArr, i2, i6);
            this.p.seek(16L);
            randomAccessFile = this.p;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    public final void b0(int i) {
        this.p.setLength(i);
        this.p.getChannel().force(true);
    }

    public int c0() {
        if (this.r == 0) {
            return 16;
        }
        b bVar = this.t;
        int i = bVar.a;
        int i2 = this.s.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.q) - i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.p.close();
    }

    public final int d0(int i) {
        int i2 = this.q;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void e0(int i, int i2, int i3, int i4) {
        g0(this.u, i, i2, i3, i4);
        this.p.seek(0L);
        this.p.write(this.u);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.q);
        sb.append(", size=");
        sb.append(this.r);
        sb.append(", first=");
        sb.append(this.s);
        sb.append(", last=");
        sb.append(this.t);
        sb.append(", element lengths=[");
        try {
            L(new a(sb));
        } catch (IOException e) {
            v.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public void w(byte[] bArr) {
        D(bArr, 0, bArr.length);
    }
}
