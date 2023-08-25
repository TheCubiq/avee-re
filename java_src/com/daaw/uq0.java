package com.daaw;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class uq0 extends l10 {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Map<Integer, jr0> i;
    public int j;
    public double k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public String s;
    public bd0 t;
    public hd0 u;
    public byte[] v;
    public boolean w;

    public uq0(String str) {
        super(str);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = new HashMap();
        this.k = 0.0d;
        h(65536, true);
    }

    public final void c(int i) {
        Integer num = new Integer(i);
        jr0 jr0Var = this.i.get(num);
        if (jr0Var != null) {
            jr0Var.a();
        } else {
            this.i.put(num, new jr0(1));
        }
        double d = this.k;
        int i2 = this.h;
        double d2 = i2 - 1;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = i;
        Double.isNaN(d4);
        double d5 = i2;
        Double.isNaN(d5);
        this.k = (d3 + d4) / d5;
    }

    public hd0 d() {
        return this.u;
    }

    public boolean e() {
        return this.t != null;
    }

    public boolean f() {
        return this.u != null;
    }

    public boolean g() {
        return this.e >= 0;
    }

    public final void h(int i, boolean z) {
        if (i < 41) {
            throw new IllegalArgumentException("Buffer too small");
        }
        this.d = i;
        this.w = z;
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.a.getPath(), "r");
        try {
            j(randomAccessFile);
            r(randomAccessFile);
            if (this.f < 0) {
                throw new xg0("No mpegs frames found");
            }
            k(randomAccessFile);
            if (z) {
                i(randomAccessFile);
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

    public final void i(RandomAccessFile randomAccessFile) {
        int a = (int) (a() - (this.g + 1));
        if (e()) {
            a -= 128;
        }
        if (a <= 0) {
            this.v = null;
            return;
        }
        this.v = new byte[a];
        randomAccessFile.seek(this.g + 1);
        if (randomAccessFile.read(this.v, 0, a) < a) {
            throw new IOException("Not enough bytes read");
        }
    }

    public final void j(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[128];
        randomAccessFile.seek(a() - 128);
        if (randomAccessFile.read(bArr, 0, 128) < 128) {
            throw new IOException("Not enough bytes read");
        }
        try {
            this.t = new cd0(bArr);
        } catch (xs0 unused) {
            this.t = null;
        }
    }

    public final void k(RandomAccessFile randomAccessFile) {
        if (this.e != 0 && this.f != 0) {
            int i = g() ? this.e : this.f;
            byte[] bArr = new byte[i];
            randomAccessFile.seek(0L);
            if (randomAccessFile.read(bArr, 0, i) < i) {
                throw new IOException("Not enough bytes read");
            }
            try {
                this.u = nd0.b(bArr);
                return;
            } catch (xs0 unused) {
            }
        }
        this.u = null;
    }

    public final boolean l(byte[] bArr, int i) {
        int i2 = i + 13;
        if (bArr.length >= i2 + 3) {
            if ("Xing".equals(wc.c(bArr, i2, 4)) || "Info".equals(wc.c(bArr, i2, 4))) {
                return true;
            }
            int i3 = i + 21;
            if (bArr.length >= i3 + 3) {
                if ("Xing".equals(wc.c(bArr, i3, 4)) || "Info".equals(wc.c(bArr, i3, 4))) {
                    return true;
                }
                int i4 = i + 36;
                if (bArr.length >= i4 + 3) {
                    return "Xing".equals(wc.c(bArr, i4, 4)) || "Info".equals(wc.c(bArr, i4, 4));
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int m() {
        int a = (int) a();
        return e() ? a - 128 : a;
    }

    public int n(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[10];
        try {
            randomAccessFile.seek(0L);
            if (randomAccessFile.read(bArr, 0, 10) == 10) {
                nd0.c(bArr);
                return wc.m(bArr[6], bArr[7], bArr[8], bArr[9]) + 10;
            }
        } catch (sp1 | xs0 | IOException unused) {
        }
        return 0;
    }

    public final void o(ar0 ar0Var, int i) {
        if (this.p != ar0Var.h()) {
            throw new xg0("Inconsistent frame header");
        }
        if (!this.n.equals(ar0Var.e())) {
            throw new xg0("Inconsistent frame header");
        }
        if (!this.s.equals(ar0Var.i())) {
            throw new xg0("Inconsistent frame header");
        }
        if (i + ar0Var.f() > a()) {
            throw new xg0("Frame would extend beyond end of file");
        }
    }

    public final int p(byte[] bArr, int i, int i2, int i3) {
        int i4;
        while (i3 < i - 40) {
            ar0 ar0Var = new ar0(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            o(ar0Var, i2 + i3);
            if ((ar0Var.f() + i4) - 1 >= m()) {
                break;
            }
            this.g = (i4 + ar0Var.f()) - 1;
            this.h++;
            c(ar0Var.b());
            i3 += ar0Var.f();
        }
        return i3;
    }

    public final int q(byte[] bArr, int i, int i2, int i3) {
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
                    if (this.e >= 0 || !l(bArr, i3)) {
                        this.f = i2 + i3;
                        this.l = ar0Var.c();
                        this.m = ar0Var.d();
                        this.n = ar0Var.e();
                        this.o = ar0Var.g();
                        this.p = ar0Var.h();
                        this.s = ar0Var.i();
                        this.q = ar0Var.j();
                        this.r = ar0Var.k();
                        this.h++;
                        c(ar0Var.b());
                        return i3 + ar0Var.f();
                    }
                    this.e = i2 + i3;
                    this.j = ar0Var.b();
                    i3 += ar0Var.f();
                }
            }
            i3++;
        }
        return i3;
    }

    public final void r(RandomAccessFile randomAccessFile) {
        int i;
        byte[] bArr = new byte[this.d];
        int n = n(randomAccessFile);
        randomAccessFile.seek(n);
        int i2 = n;
        while (true) {
            boolean z = false;
            while (!z) {
                int read = randomAccessFile.read(bArr, 0, this.d);
                if (read < this.d) {
                    z = true;
                }
                if (read >= 40) {
                    try {
                        if (this.f < 0) {
                            i = q(bArr, read, n, 0);
                            int i3 = this.f;
                            if (i3 >= 0 && !this.w) {
                                return;
                            }
                            i2 = i3;
                        } else {
                            i = 0;
                        }
                        n += p(bArr, read, n, i);
                        randomAccessFile.seek(n);
                    } catch (xg0 e) {
                        if (this.h >= 2) {
                            return;
                        }
                        this.f = -1;
                        this.e = -1;
                        this.h = 0;
                        this.i.clear();
                        int i4 = i2 + 1;
                        if (i4 == 0) {
                            throw new xg0("Valid start of mpeg frames not found", e);
                        }
                        randomAccessFile.seek(i4);
                        n = i4;
                    }
                }
            }
            return;
        }
    }
}
