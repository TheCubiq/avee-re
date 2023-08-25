package com.daaw;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class uq0 extends l10 {

    /* renamed from: d */
    public int f29425d;

    /* renamed from: e */
    public int f29426e;

    /* renamed from: f */
    public int f29427f;

    /* renamed from: g */
    public int f29428g;

    /* renamed from: h */
    public int f29429h;

    /* renamed from: i */
    public Map<Integer, jr0> f29430i;

    /* renamed from: j */
    public int f29431j;

    /* renamed from: k */
    public double f29432k;

    /* renamed from: l */
    public String f29433l;

    /* renamed from: m */
    public String f29434m;

    /* renamed from: n */
    public String f29435n;

    /* renamed from: o */
    public String f29436o;

    /* renamed from: p */
    public int f29437p;

    /* renamed from: q */
    public boolean f29438q;

    /* renamed from: r */
    public boolean f29439r;

    /* renamed from: s */
    public String f29440s;

    /* renamed from: t */
    public bd0 f29441t;

    /* renamed from: u */
    public hd0 f29442u;

    /* renamed from: v */
    public byte[] f29443v;

    /* renamed from: w */
    public boolean f29444w;

    public uq0(String str) {
        super(str);
        this.f29426e = -1;
        this.f29427f = -1;
        this.f29428g = -1;
        this.f29429h = 0;
        this.f29430i = new HashMap();
        this.f29432k = 0.0d;
        m7822h(65536, true);
    }

    /* renamed from: c */
    public final void m7827c(int i) {
        Integer num = new Integer(i);
        jr0 jr0Var = this.f29430i.get(num);
        if (jr0Var != null) {
            jr0Var.m18319a();
        } else {
            this.f29430i.put(num, new jr0(1));
        }
        double d = this.f29432k;
        int i2 = this.f29429h;
        double d2 = i2 - 1;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = i;
        Double.isNaN(d4);
        double d5 = i2;
        Double.isNaN(d5);
        this.f29432k = (d3 + d4) / d5;
    }

    /* renamed from: d */
    public hd0 m7826d() {
        return this.f29442u;
    }

    /* renamed from: e */
    public boolean m7825e() {
        return this.f29441t != null;
    }

    /* renamed from: f */
    public boolean m7824f() {
        return this.f29442u != null;
    }

    /* renamed from: g */
    public boolean m7823g() {
        return this.f29426e >= 0;
    }

    /* renamed from: h */
    public final void m7822h(int i, boolean z) {
        if (i < 41) {
            throw new IllegalArgumentException("Buffer too small");
        }
        this.f29425d = i;
        this.f29444w = z;
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f16945a.getPath(), "r");
        try {
            m7820j(randomAccessFile);
            m7812r(randomAccessFile);
            if (this.f29427f < 0) {
                throw new xg0("No mpegs frames found");
            }
            m7819k(randomAccessFile);
            if (z) {
                m7821i(randomAccessFile);
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final void m7821i(RandomAccessFile randomAccessFile) {
        int m17223a = (int) (m17223a() - (this.f29428g + 1));
        if (m7825e()) {
            m17223a -= 128;
        }
        if (m17223a <= 0) {
            this.f29443v = null;
            return;
        }
        this.f29443v = new byte[m17223a];
        randomAccessFile.seek(this.f29428g + 1);
        if (randomAccessFile.read(this.f29443v, 0, m17223a) < m17223a) {
            throw new IOException("Not enough bytes read");
        }
    }

    /* renamed from: j */
    public final void m7820j(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[128];
        randomAccessFile.seek(m17223a() - 128);
        if (randomAccessFile.read(bArr, 0, 128) < 128) {
            throw new IOException("Not enough bytes read");
        }
        try {
            this.f29441t = new cd0(bArr);
        } catch (xs0 unused) {
            this.f29441t = null;
        }
    }

    /* renamed from: k */
    public final void m7819k(RandomAccessFile randomAccessFile) {
        if (this.f29426e != 0 && this.f29427f != 0) {
            int i = m7823g() ? this.f29426e : this.f29427f;
            byte[] bArr = new byte[i];
            randomAccessFile.seek(0L);
            if (randomAccessFile.read(bArr, 0, i) < i) {
                throw new IOException("Not enough bytes read");
            }
            try {
                this.f29442u = nd0.m15222b(bArr);
                return;
            } catch (xs0 unused) {
            }
        }
        this.f29442u = null;
    }

    /* renamed from: l */
    public final boolean m7818l(byte[] bArr, int i) {
        int i2 = i + 13;
        if (bArr.length >= i2 + 3) {
            if ("Xing".equals(C3419wc.m6201c(bArr, i2, 4)) || "Info".equals(C3419wc.m6201c(bArr, i2, 4))) {
                return true;
            }
            int i3 = i + 21;
            if (bArr.length >= i3 + 3) {
                if ("Xing".equals(C3419wc.m6201c(bArr, i3, 4)) || "Info".equals(C3419wc.m6201c(bArr, i3, 4))) {
                    return true;
                }
                int i4 = i + 36;
                if (bArr.length >= i4 + 3) {
                    return "Xing".equals(C3419wc.m6201c(bArr, i4, 4)) || "Info".equals(C3419wc.m6201c(bArr, i4, 4));
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public final int m7817m() {
        int m17223a = (int) m17223a();
        return m7825e() ? m17223a - 128 : m17223a;
    }

    /* renamed from: n */
    public int m7816n(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[10];
        try {
            randomAccessFile.seek(0L);
            if (randomAccessFile.read(bArr, 0, 10) == 10) {
                nd0.m15221c(bArr);
                return C3419wc.m6191m(bArr[6], bArr[7], bArr[8], bArr[9]) + 10;
            }
        } catch (sp1 | xs0 | IOException unused) {
        }
        return 0;
    }

    /* renamed from: o */
    public final void m7815o(ar0 ar0Var, int i) {
        if (this.f29437p != ar0Var.m27157h()) {
            throw new xg0("Inconsistent frame header");
        }
        if (!this.f29435n.equals(ar0Var.m27160e())) {
            throw new xg0("Inconsistent frame header");
        }
        if (!this.f29440s.equals(ar0Var.m27156i())) {
            throw new xg0("Inconsistent frame header");
        }
        if (i + ar0Var.m27159f() > m17223a()) {
            throw new xg0("Frame would extend beyond end of file");
        }
    }

    /* renamed from: p */
    public final int m7814p(byte[] bArr, int i, int i2, int i3) {
        int i4;
        while (i3 < i - 40) {
            ar0 ar0Var = new ar0(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            m7815o(ar0Var, i2 + i3);
            if ((ar0Var.m27159f() + i4) - 1 >= m7817m()) {
                break;
            }
            this.f29428g = (i4 + ar0Var.m27159f()) - 1;
            this.f29429h++;
            m7827c(ar0Var.m27163b());
            i3 += ar0Var.m27159f();
        }
        return i3;
    }

    /* renamed from: q */
    public final int m7813q(byte[] bArr, int i, int i2, int i3) {
        ar0 ar0Var;
        while (i3 < i - 40) {
            if (bArr[i3] == -1) {
                int i4 = i3 + 1;
                if ((bArr[i4] & (-32)) == -32) {
                    try {
                        ar0Var = new ar0(bArr[i3], bArr[i4], bArr[i3 + 2], bArr[i3 + 3]);
                    } catch (xg0 unused) {
                        i3 = i4;
                    }
                    if (this.f29426e >= 0 || !m7818l(bArr, i3)) {
                        this.f29427f = i2 + i3;
                        this.f29433l = ar0Var.m27162c();
                        this.f29434m = ar0Var.m27161d();
                        this.f29435n = ar0Var.m27160e();
                        this.f29436o = ar0Var.m27158g();
                        this.f29437p = ar0Var.m27157h();
                        this.f29440s = ar0Var.m27156i();
                        this.f29438q = ar0Var.m27155j();
                        this.f29439r = ar0Var.m27154k();
                        this.f29429h++;
                        m7827c(ar0Var.m27163b());
                        return i3 + ar0Var.m27159f();
                    }
                    this.f29426e = i2 + i3;
                    this.f29431j = ar0Var.m27163b();
                    i3 += ar0Var.m27159f();
                }
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: r */
    public final void m7812r(RandomAccessFile randomAccessFile) {
        int i;
        byte[] bArr = new byte[this.f29425d];
        int m7816n = m7816n(randomAccessFile);
        randomAccessFile.seek(m7816n);
        int i2 = m7816n;
        while (true) {
            boolean z = false;
            while (!z) {
                int read = randomAccessFile.read(bArr, 0, this.f29425d);
                if (read < this.f29425d) {
                    z = true;
                }
                if (read >= 40) {
                    try {
                        if (this.f29427f < 0) {
                            i = m7813q(bArr, read, m7816n, 0);
                            int i3 = this.f29427f;
                            if (i3 >= 0 && !this.f29444w) {
                                return;
                            }
                            i2 = i3;
                        } else {
                            i = 0;
                        }
                        m7816n += m7814p(bArr, read, m7816n, i);
                        randomAccessFile.seek(m7816n);
                    } catch (xg0 e) {
                        if (this.f29429h >= 2) {
                            return;
                        }
                        this.f29427f = -1;
                        this.f29426e = -1;
                        this.f29429h = 0;
                        this.f29430i.clear();
                        int i4 = i2 + 1;
                        if (i4 == 0) {
                            throw new xg0("Valid start of mpeg frames not found", e);
                        }
                        randomAccessFile.seek(i4);
                        m7816n = i4;
                    }
                }
            }
            return;
        }
    }
}
