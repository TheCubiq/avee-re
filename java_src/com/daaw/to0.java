package com.daaw;

import android.util.Pair;
import com.daaw.bp0;
import com.daaw.nl1;
/* loaded from: classes.dex */
public final class to0 {
    public final nl1.b a = new nl1.b();
    public final nl1.c b = new nl1.c();
    public long c;
    public nl1 d;
    public int e;
    public boolean f;
    public ro0 g;
    public ro0 h;
    public ro0 i;
    public int j;
    public Object k;
    public long l;

    public void A(nl1 nl1Var) {
        this.d = nl1Var;
    }

    public boolean B() {
        ro0 ro0Var = this.i;
        return ro0Var == null || (!ro0Var.h.g && ro0Var.l() && this.i.h.e != -9223372036854775807L && this.j < 100);
    }

    public final boolean C() {
        ro0 ro0Var;
        ro0 h = h();
        if (h == null) {
            return true;
        }
        while (true) {
            int d = this.d.d(h.h.a.a, this.a, this.b, this.e, this.f);
            while (true) {
                ro0Var = h.i;
                if (ro0Var == null || h.h.f) {
                    break;
                }
                h = ro0Var;
            }
            if (d == -1 || ro0Var == null || ro0Var.h.a.a != d) {
                break;
            }
            h = ro0Var;
        }
        boolean w = w(h);
        so0 so0Var = h.h;
        h.h = q(so0Var, so0Var.a);
        return (w && r()) ? false : true;
    }

    public boolean D(bp0.a aVar, long j) {
        int i = aVar.a;
        ro0 ro0Var = null;
        int i2 = i;
        for (ro0 h = h(); h != null; h = h.i) {
            if (ro0Var == null) {
                h.h = p(h.h, i2);
            } else if (i2 == -1 || !h.b.equals(this.d.g(i2, this.a, true).b)) {
                return true ^ w(ro0Var);
            } else {
                so0 g = g(ro0Var, j);
                if (g == null) {
                    return true ^ w(ro0Var);
                }
                h.h = p(h.h, i2);
                if (!c(h, g)) {
                    return true ^ w(ro0Var);
                }
            }
            if (h.h.f) {
                i2 = this.d.d(i2, this.a, this.b, this.e, this.f);
            }
            ro0Var = h;
        }
        return true;
    }

    public boolean E(int i) {
        this.e = i;
        return C();
    }

    public boolean F(boolean z) {
        this.f = z;
        return C();
    }

    public ro0 a() {
        ro0 ro0Var = this.g;
        if (ro0Var != null) {
            if (ro0Var == this.h) {
                this.h = ro0Var.i;
            }
            ro0Var.n();
            this.g = this.g.i;
            int i = this.j - 1;
            this.j = i;
            if (i == 0) {
                this.i = null;
            }
        } else {
            ro0 ro0Var2 = this.i;
            this.g = ro0Var2;
            this.h = ro0Var2;
        }
        return this.g;
    }

    public ro0 b() {
        ro0 ro0Var = this.h;
        s6.f((ro0Var == null || ro0Var.i == null) ? false : true);
        ro0 ro0Var2 = this.h.i;
        this.h = ro0Var2;
        return ro0Var2;
    }

    public final boolean c(ro0 ro0Var, so0 so0Var) {
        so0 so0Var2 = ro0Var.h;
        return so0Var2.b == so0Var.b && so0Var2.c == so0Var.c && so0Var2.a.equals(so0Var.a);
    }

    public void d(boolean z) {
        ro0 h = h();
        if (h != null) {
            this.k = z ? h.b : null;
            this.l = h.h.a.d;
            h.n();
            w(h);
        } else if (!z) {
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    public qo0 e(b41[] b41VarArr, wm1 wm1Var, l2 l2Var, bp0 bp0Var, Object obj, so0 so0Var) {
        ro0 ro0Var = this.i;
        ro0 ro0Var2 = new ro0(b41VarArr, ro0Var == null ? so0Var.b : ro0Var.j() + this.i.h.e, wm1Var, l2Var, bp0Var, obj, so0Var);
        if (this.i != null) {
            s6.f(r());
            this.i.i = ro0Var2;
        }
        this.k = null;
        this.i = ro0Var2;
        this.j++;
        return ro0Var2.a;
    }

    public final so0 f(yw0 yw0Var) {
        return j(yw0Var.c, yw0Var.e, yw0Var.d);
    }

    public final so0 g(ro0 ro0Var, long j) {
        int i;
        long j2;
        long j3;
        so0 so0Var = ro0Var.h;
        if (so0Var.f) {
            int d = this.d.d(so0Var.a.a, this.a, this.b, this.e, this.f);
            if (d == -1) {
                return null;
            }
            int i2 = this.d.g(d, this.a, true).c;
            Object obj = this.a.b;
            long j4 = so0Var.a.d;
            long j5 = 0;
            if (this.d.k(i2, this.b).f == d) {
                Pair<Integer, Long> j6 = this.d.j(this.b, this.a, i2, -9223372036854775807L, Math.max(0L, (ro0Var.j() + so0Var.e) - j));
                if (j6 == null) {
                    return null;
                }
                int intValue = ((Integer) j6.first).intValue();
                long longValue = ((Long) j6.second).longValue();
                ro0 ro0Var2 = ro0Var.i;
                if (ro0Var2 == null || !ro0Var2.b.equals(obj)) {
                    j3 = this.c;
                    this.c = 1 + j3;
                } else {
                    j3 = ro0Var.i.h.a.d;
                }
                j5 = longValue;
                j2 = j3;
                i = intValue;
            } else {
                i = d;
                j2 = j4;
            }
            long j7 = j5;
            return j(y(i, j7, j2), j7, j5);
        }
        bp0.a aVar = so0Var.a;
        this.d.f(aVar.a, this.a);
        if (aVar.b()) {
            int i3 = aVar.b;
            int a = this.a.a(i3);
            if (a == -1) {
                return null;
            }
            int k = this.a.k(i3, aVar.c);
            if (k < a) {
                if (this.a.n(i3, k)) {
                    return k(aVar.a, i3, k, so0Var.d, aVar.d);
                }
                return null;
            }
            return l(aVar.a, so0Var.d, aVar.d);
        }
        long j8 = so0Var.c;
        if (j8 != Long.MIN_VALUE) {
            int e = this.a.e(j8);
            if (e == -1) {
                return l(aVar.a, so0Var.c, aVar.d);
            }
            int j9 = this.a.j(e);
            if (this.a.n(e, j9)) {
                return k(aVar.a, e, j9, so0Var.c, aVar.d);
            }
            return null;
        }
        int c = this.a.c();
        if (c == 0) {
            return null;
        }
        int i4 = c - 1;
        if (this.a.f(i4) != Long.MIN_VALUE || this.a.m(i4)) {
            return null;
        }
        int j10 = this.a.j(i4);
        if (this.a.n(i4, j10)) {
            return k(aVar.a, i4, j10, this.a.i(), aVar.d);
        }
        return null;
    }

    public ro0 h() {
        return r() ? this.g : this.i;
    }

    public ro0 i() {
        return this.i;
    }

    public final so0 j(bp0.a aVar, long j, long j2) {
        this.d.f(aVar.a, this.a);
        if (aVar.b()) {
            if (this.a.n(aVar.b, aVar.c)) {
                return k(aVar.a, aVar.b, aVar.c, j, aVar.d);
            }
            return null;
        }
        return l(aVar.a, j2, aVar.d);
    }

    public final so0 k(int i, int i2, int i3, long j, long j2) {
        bp0.a aVar = new bp0.a(i, i2, i3, j2);
        boolean s = s(aVar, Long.MIN_VALUE);
        boolean t = t(aVar, s);
        return new so0(aVar, i3 == this.a.j(i2) ? this.a.g() : 0L, Long.MIN_VALUE, j, this.d.f(aVar.a, this.a).b(aVar.b, aVar.c), s, t);
    }

    public final so0 l(int i, long j, long j2) {
        bp0.a aVar = new bp0.a(i, j2);
        this.d.f(aVar.a, this.a);
        int d = this.a.d(j);
        long f = d == -1 ? Long.MIN_VALUE : this.a.f(d);
        boolean s = s(aVar, f);
        return new so0(aVar, j, f, -9223372036854775807L, f == Long.MIN_VALUE ? this.a.i() : f, s, t(aVar, s));
    }

    public so0 m(long j, yw0 yw0Var) {
        ro0 ro0Var = this.i;
        return ro0Var == null ? f(yw0Var) : g(ro0Var, j);
    }

    public ro0 n() {
        return this.g;
    }

    public ro0 o() {
        return this.h;
    }

    public so0 p(so0 so0Var, int i) {
        return q(so0Var, so0Var.a.a(i));
    }

    public final so0 q(so0 so0Var, bp0.a aVar) {
        long j;
        long i;
        long j2 = so0Var.b;
        long j3 = so0Var.c;
        boolean s = s(aVar, j3);
        boolean t = t(aVar, s);
        this.d.f(aVar.a, this.a);
        if (aVar.b()) {
            i = this.a.b(aVar.b, aVar.c);
        } else if (j3 != Long.MIN_VALUE) {
            j = j3;
            return new so0(aVar, j2, j3, so0Var.d, j, s, t);
        } else {
            i = this.a.i();
        }
        j = i;
        return new so0(aVar, j2, j3, so0Var.d, j, s, t);
    }

    public boolean r() {
        return this.g != null;
    }

    public final boolean s(bp0.a aVar, long j) {
        int c = this.d.f(aVar.a, this.a).c();
        if (c == 0) {
            return true;
        }
        int i = c - 1;
        boolean b = aVar.b();
        if (this.a.f(i) != Long.MIN_VALUE) {
            return !b && j == Long.MIN_VALUE;
        }
        int a = this.a.a(i);
        if (a == -1) {
            return false;
        }
        if (b && aVar.b == i && aVar.c == a + (-1)) {
            return true;
        }
        return !b && this.a.j(i) == a;
    }

    public final boolean t(bp0.a aVar, boolean z) {
        return !this.d.k(this.d.f(aVar.a, this.a).c, this.b).e && this.d.p(aVar.a, this.a, this.b, this.e, this.f) && z;
    }

    public boolean u(qo0 qo0Var) {
        ro0 ro0Var = this.i;
        return ro0Var != null && ro0Var.a == qo0Var;
    }

    public void v(long j) {
        ro0 ro0Var = this.i;
        if (ro0Var != null) {
            ro0Var.m(j);
        }
    }

    public boolean w(ro0 ro0Var) {
        boolean z = false;
        s6.f(ro0Var != null);
        this.i = ro0Var;
        while (true) {
            ro0Var = ro0Var.i;
            if (ro0Var == null) {
                this.i.i = null;
                return z;
            }
            if (ro0Var == this.h) {
                this.h = this.g;
                z = true;
            }
            ro0Var.n();
            this.j--;
        }
    }

    public bp0.a x(int i, long j) {
        return y(i, j, z(i));
    }

    public final bp0.a y(int i, long j, long j2) {
        this.d.f(i, this.a);
        int e = this.a.e(j);
        return e == -1 ? new bp0.a(i, j2) : new bp0.a(i, e, this.a.j(e), j2);
    }

    public final long z(int i) {
        int b;
        Object obj = this.d.g(i, this.a, true).b;
        int i2 = this.a.c;
        Object obj2 = this.k;
        if (obj2 == null || (b = this.d.b(obj2)) == -1 || this.d.f(b, this.a).c != i2) {
            for (ro0 h = h(); h != null; h = h.i) {
                if (h.b.equals(obj)) {
                    return h.h.a.d;
                }
            }
            for (ro0 h2 = h(); h2 != null; h2 = h2.i) {
                int b2 = this.d.b(h2.b);
                if (b2 != -1 && this.d.f(b2, this.a).c == i2) {
                    return h2.h.a.d;
                }
            }
            long j = this.c;
            this.c = 1 + j;
            return j;
        }
        return this.l;
    }
}
