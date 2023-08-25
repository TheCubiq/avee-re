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

    /* renamed from: v */
    public static final Logger f17955v = Logger.getLogger(m01.class.getName());

    /* renamed from: p */
    public final RandomAccessFile f17956p;

    /* renamed from: q */
    public int f17957q;

    /* renamed from: r */
    public int f17958r;

    /* renamed from: s */
    public C2142b f17959s;

    /* renamed from: t */
    public C2142b f17960t;

    /* renamed from: u */
    public final byte[] f17961u = new byte[16];

    /* renamed from: com.daaw.m01$a */
    /* loaded from: classes2.dex */
    public class C2141a implements InterfaceC2144d {

        /* renamed from: a */
        public boolean f17962a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f17963b;

        public C2141a(StringBuilder sb) {
            this.f17963b = sb;
        }

        @Override // com.daaw.m01.InterfaceC2144d
        /* renamed from: a */
        public void mo15613a(InputStream inputStream, int i) {
            if (this.f17962a) {
                this.f17962a = false;
            } else {
                this.f17963b.append(", ");
            }
            this.f17963b.append(i);
        }
    }

    /* renamed from: com.daaw.m01$b */
    /* loaded from: classes2.dex */
    public static class C2142b {

        /* renamed from: c */
        public static final C2142b f17965c = new C2142b(0, 0);

        /* renamed from: a */
        public final int f17966a;

        /* renamed from: b */
        public final int f17967b;

        public C2142b(int i, int i2) {
            this.f17966a = i;
            this.f17967b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f17966a + ", length = " + this.f17967b + "]";
        }
    }

    /* renamed from: com.daaw.m01$c */
    /* loaded from: classes2.dex */
    public final class C2143c extends InputStream {

        /* renamed from: p */
        public int f17968p;

        /* renamed from: q */
        public int f17969q;

        public C2143c(C2142b c2142b) {
            this.f17968p = m01.this.m16320d0(c2142b.f17966a + 4);
            this.f17969q = c2142b.f17967b;
        }

        public /* synthetic */ C2143c(m01 m01Var, C2142b c2142b, C2141a c2141a) {
            this(c2142b);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f17969q == 0) {
                return -1;
            }
            m01.this.f17956p.seek(this.f17968p);
            int read = m01.this.f17956p.read();
            this.f17968p = m01.this.m16320d0(this.f17968p + 1);
            this.f17969q--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            m01.m16332Q(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f17969q;
            if (i3 > 0) {
                if (i2 > i3) {
                    i2 = i3;
                }
                m01.this.m16325Z(this.f17968p, bArr, i, i2);
                this.f17968p = m01.this.m16320d0(this.f17968p + i2);
                this.f17969q -= i2;
                return i2;
            }
            return -1;
        }
    }

    /* renamed from: com.daaw.m01$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC2144d {
        /* renamed from: a */
        void mo15613a(InputStream inputStream, int i);
    }

    public m01(File file) {
        if (!file.exists()) {
            m16334M(file);
        }
        this.f17956p = m16331T(file);
        m16329V();
    }

    /* renamed from: M */
    public static void m16334M(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m16331T = m16331T(file2);
        try {
            m16331T.setLength(4096L);
            m16331T.seek(0L);
            byte[] bArr = new byte[16];
            m16317g0(bArr, 4096, 0, 0, 0);
            m16331T.write(bArr);
            m16331T.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            m16331T.close();
            throw th;
        }
    }

    /* renamed from: Q */
    public static <T> T m16332Q(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: T */
    public static RandomAccessFile m16331T(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: W */
    public static int m16328W(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: f0 */
    public static void m16318f0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: g0 */
    public static void m16317g0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            m16318f0(bArr, i, i2);
            i += 4;
        }
    }

    /* renamed from: D */
    public synchronized void m16338D(byte[] bArr, int i, int i2) {
        int m16320d0;
        m16332Q(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m16336K(i2);
        boolean m16333P = m16333P();
        if (m16333P) {
            m16320d0 = 16;
        } else {
            C2142b c2142b = this.f17960t;
            m16320d0 = m16320d0(c2142b.f17966a + 4 + c2142b.f17967b);
        }
        C2142b c2142b2 = new C2142b(m16320d0, i2);
        m16318f0(this.f17961u, 0, i2);
        m16324a0(c2142b2.f17966a, this.f17961u, 0, 4);
        m16324a0(c2142b2.f17966a + 4, bArr, i, i2);
        m16319e0(this.f17957q, this.f17958r + 1, m16333P ? c2142b2.f17966a : this.f17959s.f17966a, c2142b2.f17966a);
        this.f17960t = c2142b2;
        this.f17958r++;
        if (m16333P) {
            this.f17959s = c2142b2;
        }
    }

    /* renamed from: E */
    public synchronized void m16337E() {
        m16319e0(4096, 0, 0, 0);
        this.f17958r = 0;
        C2142b c2142b = C2142b.f17965c;
        this.f17959s = c2142b;
        this.f17960t = c2142b;
        if (this.f17957q > 4096) {
            m16323b0(4096);
        }
        this.f17957q = 4096;
    }

    /* renamed from: K */
    public final void m16336K(int i) {
        int i2 = i + 4;
        int m16327X = m16327X();
        if (m16327X >= i2) {
            return;
        }
        int i3 = this.f17957q;
        do {
            m16327X += i3;
            i3 <<= 1;
        } while (m16327X < i2);
        m16323b0(i3);
        C2142b c2142b = this.f17960t;
        int m16320d0 = m16320d0(c2142b.f17966a + 4 + c2142b.f17967b);
        if (m16320d0 < this.f17959s.f17966a) {
            FileChannel channel = this.f17956p.getChannel();
            channel.position(this.f17957q);
            long j = m16320d0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f17960t.f17966a;
        int i5 = this.f17959s.f17966a;
        if (i4 < i5) {
            int i6 = (this.f17957q + i4) - 16;
            m16319e0(i3, this.f17958r, i5, i6);
            this.f17960t = new C2142b(i6, this.f17960t.f17967b);
        } else {
            m16319e0(i3, this.f17958r, i5, i4);
        }
        this.f17957q = i3;
    }

    /* renamed from: L */
    public synchronized void m16335L(InterfaceC2144d interfaceC2144d) {
        int i = this.f17959s.f17966a;
        for (int i2 = 0; i2 < this.f17958r; i2++) {
            C2142b m16330U = m16330U(i);
            interfaceC2144d.mo15613a(new C2143c(this, m16330U, null), m16330U.f17967b);
            i = m16320d0(m16330U.f17966a + 4 + m16330U.f17967b);
        }
    }

    /* renamed from: P */
    public synchronized boolean m16333P() {
        return this.f17958r == 0;
    }

    /* renamed from: U */
    public final C2142b m16330U(int i) {
        if (i == 0) {
            return C2142b.f17965c;
        }
        this.f17956p.seek(i);
        return new C2142b(i, this.f17956p.readInt());
    }

    /* renamed from: V */
    public final void m16329V() {
        this.f17956p.seek(0L);
        this.f17956p.readFully(this.f17961u);
        int m16328W = m16328W(this.f17961u, 0);
        this.f17957q = m16328W;
        if (m16328W <= this.f17956p.length()) {
            this.f17958r = m16328W(this.f17961u, 4);
            int m16328W2 = m16328W(this.f17961u, 8);
            int m16328W3 = m16328W(this.f17961u, 12);
            this.f17959s = m16330U(m16328W2);
            this.f17960t = m16330U(m16328W3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f17957q + ", Actual length: " + this.f17956p.length());
    }

    /* renamed from: X */
    public final int m16327X() {
        return this.f17957q - m16322c0();
    }

    /* renamed from: Y */
    public synchronized void m16326Y() {
        if (m16333P()) {
            throw new NoSuchElementException();
        }
        if (this.f17958r == 1) {
            m16337E();
        } else {
            C2142b c2142b = this.f17959s;
            int m16320d0 = m16320d0(c2142b.f17966a + 4 + c2142b.f17967b);
            m16325Z(m16320d0, this.f17961u, 0, 4);
            int m16328W = m16328W(this.f17961u, 0);
            m16319e0(this.f17957q, this.f17958r - 1, m16320d0, this.f17960t.f17966a);
            this.f17958r--;
            this.f17959s = new C2142b(m16320d0, m16328W);
        }
    }

    /* renamed from: Z */
    public final void m16325Z(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int m16320d0 = m16320d0(i);
        int i4 = m16320d0 + i3;
        int i5 = this.f17957q;
        if (i4 <= i5) {
            this.f17956p.seek(m16320d0);
            randomAccessFile = this.f17956p;
        } else {
            int i6 = i5 - m16320d0;
            this.f17956p.seek(m16320d0);
            this.f17956p.readFully(bArr, i2, i6);
            this.f17956p.seek(16L);
            randomAccessFile = this.f17956p;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: a0 */
    public final void m16324a0(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int m16320d0 = m16320d0(i);
        int i4 = m16320d0 + i3;
        int i5 = this.f17957q;
        if (i4 <= i5) {
            this.f17956p.seek(m16320d0);
            randomAccessFile = this.f17956p;
        } else {
            int i6 = i5 - m16320d0;
            this.f17956p.seek(m16320d0);
            this.f17956p.write(bArr, i2, i6);
            this.f17956p.seek(16L);
            randomAccessFile = this.f17956p;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: b0 */
    public final void m16323b0(int i) {
        this.f17956p.setLength(i);
        this.f17956p.getChannel().force(true);
    }

    /* renamed from: c0 */
    public int m16322c0() {
        if (this.f17958r == 0) {
            return 16;
        }
        C2142b c2142b = this.f17960t;
        int i = c2142b.f17966a;
        int i2 = this.f17959s.f17966a;
        return i >= i2 ? (i - i2) + 4 + c2142b.f17967b + 16 : (((i + 4) + c2142b.f17967b) + this.f17957q) - i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f17956p.close();
    }

    /* renamed from: d0 */
    public final int m16320d0(int i) {
        int i2 = this.f17957q;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: e0 */
    public final void m16319e0(int i, int i2, int i3, int i4) {
        m16317g0(this.f17961u, i, i2, i3, i4);
        this.f17956p.seek(0L);
        this.f17956p.write(this.f17961u);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f17957q);
        sb.append(", size=");
        sb.append(this.f17958r);
        sb.append(", first=");
        sb.append(this.f17959s);
        sb.append(", last=");
        sb.append(this.f17960t);
        sb.append(", element lengths=[");
        try {
            m16335L(new C2141a(sb));
        } catch (IOException e) {
            f17955v.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: w */
    public void m16313w(byte[] bArr) {
        m16338D(bArr, 0, bArr.length);
    }
}
