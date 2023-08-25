package com.daaw;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* loaded from: classes.dex */
public final class ro0 {
    public final qo0 a;
    public final Object b;
    public final d81[] c;
    public final boolean[] d;
    public long e;
    public boolean f;
    public boolean g;
    public so0 h;
    public ro0 i;
    public TrackGroupArray j;
    public xm1 k;
    public final b41[] l;
    public final wm1 m;
    public final bp0 n;
    public xm1 o;

    public ro0(b41[] b41VarArr, long j, wm1 wm1Var, l2 l2Var, bp0 bp0Var, Object obj, so0 so0Var) {
        this.l = b41VarArr;
        this.e = j - so0Var.b;
        this.m = wm1Var;
        this.n = bp0Var;
        this.b = s6.e(obj);
        this.h = so0Var;
        this.c = new d81[b41VarArr.length];
        this.d = new boolean[b41VarArr.length];
        qo0 g = bp0Var.g(so0Var.a, l2Var);
        long j2 = so0Var.c;
        this.a = j2 != Long.MIN_VALUE ? new yf(g, true, 0L, j2) : g;
    }

    public long a(long j, boolean z) {
        return b(j, z, new boolean[this.l.length]);
    }

    public long b(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            xm1 xm1Var = this.k;
            boolean z2 = true;
            if (i >= xm1Var.a) {
                break;
            }
            boolean[] zArr2 = this.d;
            if (z || !xm1Var.b(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        f(this.c);
        r(this.k);
        um1 um1Var = this.k.c;
        long i2 = this.a.i(um1Var.b(), this.d, this.c, zArr, j);
        c(this.c);
        this.g = false;
        int i3 = 0;
        while (true) {
            d81[] d81VarArr = this.c;
            if (i3 >= d81VarArr.length) {
                return i2;
            }
            if (d81VarArr[i3] != null) {
                s6.f(this.k.c(i3));
                if (this.l[i3].i() != 5) {
                    this.g = true;
                }
            } else {
                s6.f(um1Var.a(i3) == null);
            }
            i3++;
        }
    }

    public final void c(d81[] d81VarArr) {
        int i = 0;
        while (true) {
            b41[] b41VarArr = this.l;
            if (i >= b41VarArr.length) {
                return;
            }
            if (b41VarArr[i].i() == 5 && this.k.c(i)) {
                d81VarArr[i] = new sw();
            }
            i++;
        }
    }

    public void d(long j) {
        this.a.c(p(j));
    }

    public final void e(xm1 xm1Var) {
        for (int i = 0; i < xm1Var.a; i++) {
            boolean c = xm1Var.c(i);
            com.google.android.exoplayer2.trackselection.c a = xm1Var.c.a(i);
            if (c && a != null) {
                a.g();
            }
        }
    }

    public final void f(d81[] d81VarArr) {
        int i = 0;
        while (true) {
            b41[] b41VarArr = this.l;
            if (i >= b41VarArr.length) {
                return;
            }
            if (b41VarArr[i].i() == 5) {
                d81VarArr[i] = null;
            }
            i++;
        }
    }

    public final void g(xm1 xm1Var) {
        for (int i = 0; i < xm1Var.a; i++) {
            boolean c = xm1Var.c(i);
            com.google.android.exoplayer2.trackselection.c a = xm1Var.c.a(i);
            if (c && a != null) {
                a.e();
            }
        }
    }

    public long h(boolean z) {
        if (this.f) {
            long f = this.a.f();
            return (f == Long.MIN_VALUE && z) ? this.h.e : f;
        }
        return this.h.b;
    }

    public long i() {
        if (this.f) {
            return this.a.b();
        }
        return 0L;
    }

    public long j() {
        return this.e;
    }

    public void k(float f) {
        this.f = true;
        this.j = this.a.s();
        o(f);
        long a = a(this.h.b, false);
        long j = this.e;
        so0 so0Var = this.h;
        this.e = j + (so0Var.b - a);
        this.h = so0Var.b(a);
    }

    public boolean l() {
        return this.f && (!this.g || this.a.f() == Long.MIN_VALUE);
    }

    public void m(long j) {
        if (this.f) {
            this.a.g(p(j));
        }
    }

    public void n() {
        bp0 bp0Var;
        qo0 qo0Var;
        r(null);
        try {
            if (this.h.c != Long.MIN_VALUE) {
                bp0Var = this.n;
                qo0Var = ((yf) this.a).p;
            } else {
                bp0Var = this.n;
                qo0Var = this.a;
            }
            bp0Var.a(qo0Var);
        } catch (RuntimeException unused) {
        }
    }

    public boolean o(float f) {
        com.google.android.exoplayer2.trackselection.c[] b;
        xm1 c = this.m.c(this.l, this.j);
        if (c.a(this.o)) {
            return false;
        }
        this.k = c;
        for (com.google.android.exoplayer2.trackselection.c cVar : c.c.b()) {
            if (cVar != null) {
                cVar.m(f);
            }
        }
        return true;
    }

    public long p(long j) {
        return j - j();
    }

    public long q(long j) {
        return j + j();
    }

    public final void r(xm1 xm1Var) {
        xm1 xm1Var2 = this.o;
        if (xm1Var2 != null) {
            e(xm1Var2);
        }
        this.o = xm1Var;
        if (xm1Var != null) {
            g(xm1Var);
        }
    }
}
