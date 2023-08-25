package com.daaw;

import com.daaw.da1;
/* loaded from: classes.dex */
public final class t20 implements zz {
    public static final e00 p = new a();
    public static final int q = sq1.v("FLV");
    public d00 f;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public p7 n;
    public ss1 o;
    public final rv0 a = new rv0(4);
    public final rv0 b = new rv0(9);
    public final rv0 c = new rv0(11);
    public final rv0 d = new rv0();
    public final j91 e = new j91();
    public int g = 1;
    public long h = -9223372036854775807L;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new t20()};
        }
    }

    @Override // com.daaw.zz
    public void a() {
    }

    public final void b() {
        if (!this.m) {
            this.f.d(new da1.b(-9223372036854775807L));
            this.m = true;
        }
        if (this.h == -9223372036854775807L) {
            this.h = this.e.d() == -9223372036854775807L ? -this.l : 0L;
        }
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        a00Var.k(this.a.a, 0, 3);
        this.a.J(0);
        if (this.a.A() != q) {
            return false;
        }
        a00Var.k(this.a.a, 0, 2);
        this.a.J(0);
        if ((this.a.D() & 250) != 0) {
            return false;
        }
        a00Var.k(this.a.a, 0, 4);
        this.a.J(0);
        int i = this.a.i();
        a00Var.i();
        a00Var.g(i);
        a00Var.k(this.a.a, 0, 4);
        this.a.J(0);
        return this.a.i() == 0;
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    k(a00Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (h(a00Var)) {
                        return 0;
                    }
                } else if (!j(a00Var)) {
                    return -1;
                }
            } else if (!g(a00Var)) {
                return -1;
            }
        }
    }

    public final rv0 e(a00 a00Var) {
        if (this.k > this.d.b()) {
            rv0 rv0Var = this.d;
            rv0Var.H(new byte[Math.max(rv0Var.b() * 2, this.k)], 0);
        } else {
            this.d.J(0);
        }
        this.d.I(this.k);
        a00Var.f(this.d.a, 0, this.k);
        return this.d;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.g = 1;
        this.h = -9223372036854775807L;
        this.i = 0;
    }

    public final boolean g(a00 a00Var) {
        if (a00Var.c(this.b.a, 0, 9, true)) {
            this.b.J(0);
            this.b.K(4);
            int x = this.b.x();
            boolean z = (x & 4) != 0;
            boolean z2 = (x & 1) != 0;
            if (z && this.n == null) {
                this.n = new p7(this.f.a(8, 1));
            }
            if (z2 && this.o == null) {
                this.o = new ss1(this.f.a(9, 2));
            }
            this.f.n();
            this.i = (this.b.i() - 9) + 4;
            this.g = 2;
            return true;
        }
        return false;
    }

    public final boolean h(a00 a00Var) {
        nj1 nj1Var;
        int i = this.j;
        boolean z = true;
        if (i == 8 && this.n != null) {
            b();
            nj1Var = this.n;
        } else if (i != 9 || this.o == null) {
            if (i != 18 || this.m) {
                a00Var.j(this.k);
                z = false;
            } else {
                this.e.a(e(a00Var), this.l);
                long d = this.e.d();
                if (d != -9223372036854775807L) {
                    this.f.d(new da1.b(d));
                    this.m = true;
                }
            }
            this.i = 4;
            this.g = 2;
            return z;
        } else {
            b();
            nj1Var = this.o;
        }
        nj1Var.a(e(a00Var), this.h + this.l);
        this.i = 4;
        this.g = 2;
        return z;
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.f = d00Var;
    }

    public final boolean j(a00 a00Var) {
        if (a00Var.c(this.c.a, 0, 11, true)) {
            this.c.J(0);
            this.j = this.c.x();
            this.k = this.c.A();
            this.l = this.c.A();
            this.l = ((this.c.x() << 24) | this.l) * 1000;
            this.c.K(3);
            this.g = 4;
            return true;
        }
        return false;
    }

    public final void k(a00 a00Var) {
        a00Var.j(this.i);
        this.i = 0;
        this.g = 3;
    }
}
