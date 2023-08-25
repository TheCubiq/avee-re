package com.daaw;
/* loaded from: classes.dex */
public final class m78 {
    public final pr8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public m78(pr8 pr8Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        uo4.d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        uo4.d(z5);
        this.a = pr8Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final m78 a(long j) {
        return j == this.c ? this : new m78(this.a, this.b, j, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final m78 b(long j) {
        return j == this.b ? this : new m78(this.a, j, this.c, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m78.class == obj.getClass()) {
            m78 m78Var = (m78) obj;
            if (this.b == m78Var.b && this.c == m78Var.c && this.d == m78Var.d && this.e == m78Var.e && this.g == m78Var.g && this.h == m78Var.h && this.i == m78Var.i && it5.t(this.a, m78Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
