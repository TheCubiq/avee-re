package com.daaw;

import com.daaw.da1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public abstract class rg1 {
    public final st0 a = new st0();
    public sm1 b;
    public d00 c;
    public ut0 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public b j;
    public long k;
    public boolean l;
    public boolean m;

    /* loaded from: classes.dex */
    public static class b {
        public Format a;
        public ut0 b;
    }

    /* loaded from: classes.dex */
    public static final class c implements ut0 {
        public c() {
        }

        @Override // com.daaw.ut0
        public long a(a00 a00Var) {
            return -1L;
        }

        @Override // com.daaw.ut0
        public da1 c() {
            return new da1.b(-9223372036854775807L);
        }

        @Override // com.daaw.ut0
        public long d(long j) {
            return 0L;
        }
    }

    public long a(long j) {
        return (j * 1000000) / this.i;
    }

    public long b(long j) {
        return (this.i * j) / 1000000;
    }

    public void c(d00 d00Var, sm1 sm1Var) {
        this.c = d00Var;
        this.b = sm1Var;
        j(true);
    }

    public void d(long j) {
        this.g = j;
    }

    public abstract long e(rv0 rv0Var);

    public final int f(a00 a00Var, iy0 iy0Var) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return i(a00Var, iy0Var);
                }
                throw new IllegalStateException();
            }
            a00Var.j((int) this.f);
            this.h = 2;
            return 0;
        }
        return g(a00Var);
    }

    public final int g(a00 a00Var) {
        boolean z = true;
        while (z) {
            if (!this.a.d(a00Var)) {
                this.h = 3;
                return -1;
            }
            this.k = a00Var.getPosition() - this.f;
            z = h(this.a.c(), this.f, this.j);
            if (z) {
                this.f = a00Var.getPosition();
            }
        }
        Format format = this.j.a;
        this.i = format.H;
        if (!this.m) {
            this.b.d(format);
            this.m = true;
        }
        ut0 ut0Var = this.j.b;
        if (ut0Var != null) {
            this.d = ut0Var;
        } else if (a00Var.h() == -1) {
            this.d = new c();
        } else {
            tt0 b2 = this.a.b();
            this.d = new nr(this.f, a00Var.h(), this, b2.h + b2.i, b2.c);
        }
        this.j = null;
        this.h = 2;
        this.a.f();
        return 0;
    }

    public abstract boolean h(rv0 rv0Var, long j, b bVar);

    public final int i(a00 a00Var, iy0 iy0Var) {
        long a2 = this.d.a(a00Var);
        if (a2 >= 0) {
            iy0Var.a = a2;
            return 1;
        }
        if (a2 < -1) {
            d(-(a2 + 2));
        }
        if (!this.l) {
            this.c.d(this.d.c());
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(a00Var)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        rv0 c2 = this.a.c();
        long e = e(c2);
        if (e >= 0) {
            long j = this.g;
            if (j + e >= this.e) {
                long a3 = a(j);
                this.b.c(c2, c2.d());
                this.b.a(a3, 1, c2.d(), 0, null);
                this.e = -1L;
            }
        }
        this.g += e;
        return 0;
    }

    public void j(boolean z) {
        int i;
        if (z) {
            this.j = new b();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    public final void k(long j, long j2) {
        this.a.e();
        if (j == 0) {
            j(!this.l);
        } else if (this.h != 0) {
            this.e = this.d.d(j2);
            this.h = 2;
        }
    }
}
