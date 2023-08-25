package com.daaw;
/* loaded from: classes.dex */
public final class j78 {
    public final nr8 a;
    public final Object b;
    public final mt8[] c;
    public boolean d;
    public boolean e;
    public m78 f;
    public boolean g;
    public final boolean[] h;
    public final l98[] i;
    public final zv8 j;
    public final n88 k;
    public j78 l;
    public au8 m;
    public fw8 n;
    public long o;

    public j78(l98[] l98VarArr, long j, zv8 zv8Var, nw8 nw8Var, n88 n88Var, m78 m78Var, fw8 fw8Var, byte[] bArr) {
        this.i = l98VarArr;
        this.o = j;
        this.j = zv8Var;
        this.k = n88Var;
        pr8 pr8Var = m78Var.a;
        this.b = pr8Var.a;
        this.f = m78Var;
        this.m = au8.d;
        this.n = fw8Var;
        this.c = new mt8[2];
        this.h = new boolean[2];
        long j2 = m78Var.b;
        long j3 = m78Var.d;
        nr8 o = n88Var.o(pr8Var, nw8Var, j2);
        this.a = j3 != -9223372036854775807L ? new oq8(o, true, 0L, j3) : o;
    }

    public final long a(fw8 fw8Var, long j, boolean z) {
        return b(fw8Var, j, false, new boolean[2]);
    }

    public final long b(fw8 fw8Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= fw8Var.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !fw8Var.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            l98[] l98VarArr = this.i;
            if (i2 >= 2) {
                break;
            }
            l98VarArr[i2].zzb();
            i2++;
        }
        s();
        this.n = fw8Var;
        t();
        long k = this.a.k(fw8Var.c, this.h, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            l98[] l98VarArr2 = this.i;
            if (i3 >= 2) {
                break;
            }
            l98VarArr2[i3].zzb();
            i3++;
        }
        this.e = false;
        int i4 = 0;
        while (true) {
            mt8[] mt8VarArr = this.c;
            if (i4 >= 2) {
                return k;
            }
            if (mt8VarArr[i4] != null) {
                uo4.f(fw8Var.b(i4));
                this.i[i4].zzb();
                this.e = true;
            } else {
                uo4.f(fw8Var.c[i4] == null);
            }
            i4++;
        }
    }

    public final long c() {
        if (this.d) {
            long zzb = this.e ? this.a.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.f.e : zzb;
        }
        return this.f.b;
    }

    public final long d() {
        if (this.d) {
            return this.a.zzc();
        }
        return 0L;
    }

    public final long e() {
        return this.o;
    }

    public final long f() {
        return this.f.b + this.o;
    }

    public final j78 g() {
        return this.l;
    }

    public final au8 h() {
        return this.m;
    }

    public final fw8 i() {
        return this.n;
    }

    public final fw8 j(float f, l64 l64Var) {
        tv8[] tv8VarArr;
        fw8 d = this.j.d(this.i, this.m, this.f.a, l64Var);
        for (tv8 tv8Var : d.c) {
        }
        return d;
    }

    public final void k(long j) {
        uo4.f(u());
        this.a.c(j - this.o);
    }

    public final void l(float f, l64 l64Var) {
        this.d = true;
        this.m = this.a.zzh();
        fw8 j = j(f, l64Var);
        m78 m78Var = this.f;
        long j2 = m78Var.b;
        long j3 = m78Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false);
        long j4 = this.o;
        m78 m78Var2 = this.f;
        this.o = j4 + (m78Var2.b - a);
        this.f = m78Var2.b(a);
    }

    public final void m(long j) {
        uo4.f(u());
        if (this.d) {
            this.a.j(j - this.o);
        }
    }

    public final void n() {
        s();
        n88 n88Var = this.k;
        nr8 nr8Var = this.a;
        try {
            if (nr8Var instanceof oq8) {
                n88Var.h(((oq8) nr8Var).p);
            } else {
                n88Var.h(nr8Var);
            }
        } catch (RuntimeException e) {
            s95.c("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void o(j78 j78Var) {
        if (j78Var == this.l) {
            return;
        }
        s();
        this.l = j78Var;
        t();
    }

    public final void p(long j) {
        this.o = 1000000000000L;
    }

    public final void q() {
        nr8 nr8Var = this.a;
        if (nr8Var instanceof oq8) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((oq8) nr8Var).f(0L, j);
        }
    }

    public final boolean r() {
        return this.d && (!this.e || this.a.zzb() == Long.MIN_VALUE);
    }

    public final void s() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            fw8 fw8Var = this.n;
            if (i >= fw8Var.a) {
                return;
            }
            fw8Var.b(i);
            tv8 tv8Var = this.n.c[i];
            i++;
        }
    }

    public final void t() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            fw8 fw8Var = this.n;
            if (i >= fw8Var.a) {
                return;
            }
            fw8Var.b(i);
            tv8 tv8Var = this.n.c[i];
            i++;
        }
    }

    public final boolean u() {
        return this.l == null;
    }
}
