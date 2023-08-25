package com.daaw;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public abstract class gb2 {
    public m42 b;
    public m09 c;
    public bb2 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final za2 a = new za2();
    public db2 j = new db2();

    public abstract long a(ik5 ik5Var);

    public void b(boolean z) {
        int i;
        if (z) {
            this.j = new db2();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(ik5 ik5Var, long j, db2 db2Var);

    public final int d(k09 k09Var, f42 f42Var) {
        uo4.b(this.b);
        int i = it5.a;
        int i2 = this.h;
        if (i2 == 0) {
            while (this.a.e(k09Var)) {
                long zzf = k09Var.zzf();
                long j = this.f;
                this.k = zzf - j;
                if (!c(this.a.a(), j, this.j)) {
                    f92 f92Var = this.j.a;
                    this.i = f92Var.z;
                    if (!this.m) {
                        this.b.f(f92Var);
                        this.m = true;
                    }
                    bb2 bb2Var = this.j.b;
                    if (bb2Var != null) {
                        this.d = bb2Var;
                    } else if (k09Var.zzd() == -1) {
                        this.d = new fb2(null);
                    } else {
                        ab2 b = this.a.b();
                        this.d = new ua2(this, this.f, k09Var.zzd(), b.d + b.e, b.b, (b.a & 4) != 0);
                    }
                    this.h = 2;
                    this.a.d();
                    return 0;
                }
                this.f = k09Var.zzf();
            }
            this.h = 3;
            return -1;
        } else if (i2 == 1) {
            ((rz8) k09Var).l((int) this.f, false);
            this.h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long a = this.d.a(k09Var);
            if (a >= 0) {
                f42Var.a = a;
                return 1;
            }
            if (a < -1) {
                h(-(a + 2));
            }
            if (!this.l) {
                i42 zze = this.d.zze();
                uo4.b(zze);
                this.c.i(zze);
                this.l = true;
            }
            if (this.k <= 0 && !this.a.e(k09Var)) {
                this.h = 3;
                return -1;
            }
            this.k = 0L;
            ik5 a2 = this.a.a();
            long a3 = a(a2);
            if (a3 >= 0) {
                long j2 = this.g;
                if (j2 + a3 >= this.e) {
                    long e = e(j2);
                    k42.b(this.b, a2, a2.l());
                    this.b.b(e, 1, a2.l(), 0, null);
                    this.e = -1L;
                }
            }
            this.g += a3;
            return 0;
        }
    }

    public final long e(long j) {
        return (j * 1000000) / this.i;
    }

    public final long f(long j) {
        return (this.i * j) / 1000000;
    }

    public final void g(m09 m09Var, m42 m42Var) {
        this.c = m09Var;
        this.b = m42Var;
        b(true);
    }

    public void h(long j) {
        this.g = j;
    }

    public final void i(long j, long j2) {
        this.a.c();
        if (j == 0) {
            b(!this.l);
        } else if (this.h != 0) {
            long f = f(j2);
            this.e = f;
            bb2 bb2Var = this.d;
            int i = it5.a;
            bb2Var.b(f);
            this.h = 2;
        }
    }
}
