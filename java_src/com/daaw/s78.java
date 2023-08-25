package com.daaw;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public final class s78 {
    public final d34 a = new d34();
    public final i54 b = new i54();
    public final fb8 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public j78 h;
    public j78 i;
    public j78 j;
    public int k;
    public Object l;
    public long m;

    public s78(fb8 fb8Var, Handler handler) {
        this.c = fb8Var;
        this.d = handler;
    }

    public static pr8 A(l64 l64Var, Object obj, long j, long j2, i54 i54Var, d34 d34Var) {
        l64Var.n(obj, d34Var);
        l64Var.e(d34Var.c, i54Var, 0L);
        l64Var.a(obj);
        if (d34Var.d == 0) {
            d34Var.b();
        }
        l64Var.n(obj, d34Var);
        int d = d34Var.d(j);
        return d == -1 ? new pr8(obj, j2, d34Var.c(j)) : new pr8(obj, d, d34Var.e(d), j2);
    }

    public static final boolean c(pr8 pr8Var) {
        return !pr8Var.b() && pr8Var.e == -1;
    }

    public final void B() {
        final v17 o = y17.o();
        for (j78 j78Var = this.h; j78Var != null; j78Var = j78Var.g()) {
            o.f(j78Var.f.a);
        }
        j78 j78Var2 = this.i;
        final pr8 pr8Var = j78Var2 == null ? null : j78Var2.f.a;
        this.d.post(new Runnable() { // from class: com.daaw.p78
            @Override // java.lang.Runnable
            public final void run() {
                s78.this.m(o, pr8Var);
            }
        });
    }

    public final boolean C(l64 l64Var, pr8 pr8Var, boolean z) {
        int a = l64Var.a(pr8Var.a);
        return !l64Var.e(l64Var.d(a, this.a, false).c, this.b, 0L).g && l64Var.i(a, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean a(l64 l64Var, pr8 pr8Var) {
        if (c(pr8Var)) {
            return l64Var.e(l64Var.n(pr8Var.a, this.a).c, this.b, 0L).n == l64Var.a(pr8Var.a);
        }
        return false;
    }

    public final boolean b(l64 l64Var) {
        j78 j78Var = this.h;
        if (j78Var == null) {
            return true;
        }
        int a = l64Var.a(j78Var.b);
        while (true) {
            a = l64Var.i(a, this.a, this.b, this.f, this.g);
            while (j78Var.g() != null && !j78Var.f.g) {
                j78Var = j78Var.g();
            }
            j78 g = j78Var.g();
            if (a == -1 || g == null || l64Var.a(g.b) != a) {
                break;
            }
            j78Var = g;
        }
        boolean p = p(j78Var);
        j78Var.f = j(l64Var, j78Var.f);
        return !p;
    }

    public final j78 d() {
        j78 j78Var = this.h;
        if (j78Var == null) {
            return null;
        }
        if (j78Var == this.i) {
            this.i = j78Var.g();
        }
        j78Var.n();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            j78 j78Var2 = this.h;
            this.l = j78Var2.b;
            this.m = j78Var2.f.a.d;
        }
        this.h = this.h.g();
        B();
        return this.h;
    }

    public final j78 e() {
        j78 j78Var = this.i;
        boolean z = false;
        if (j78Var != null && j78Var.g() != null) {
            z = true;
        }
        uo4.f(z);
        this.i = this.i.g();
        B();
        return this.i;
    }

    public final j78 f() {
        return this.j;
    }

    public final j78 g() {
        return this.h;
    }

    public final j78 h() {
        return this.i;
    }

    public final m78 i(long j, q88 q88Var) {
        j78 j78Var = this.j;
        return j78Var == null ? x(q88Var.a, q88Var.b, q88Var.c, q88Var.r) : w(q88Var.a, j78Var, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.m78 j(com.daaw.l64 r19, com.daaw.m78 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.daaw.pr8 r3 = r2.a
            boolean r12 = c(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.C(r1, r3, r12)
            com.daaw.pr8 r4 = r2.a
            java.lang.Object r4 = r4.a
            com.daaw.d34 r5 = r0.a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.e
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.daaw.d34 r9 = r0.a
            r9.h(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.b()
            if (r1 == 0) goto L4b
            com.daaw.d34 r1 = r0.a
            int r5 = r3.b
            int r6 = r3.c
            long r5 = r1.g(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.daaw.d34 r1 = r0.a
            long r5 = r1.d
            goto L48
        L57:
            boolean r1 = r3.b()
            if (r1 == 0) goto L65
            com.daaw.d34 r1 = r0.a
            int r4 = r3.b
            r1.l(r4)
            goto L6e
        L65:
            int r1 = r3.e
            if (r1 == r4) goto L6e
            com.daaw.d34 r4 = r0.a
            r4.l(r1)
        L6e:
            com.daaw.m78 r15 = new com.daaw.m78
            long r4 = r2.b
            long r1 = r2.c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s78.j(com.daaw.l64, com.daaw.m78):com.daaw.m78");
    }

    public final pr8 k(l64 l64Var, Object obj, long j) {
        long j2;
        int a;
        int i = l64Var.n(obj, this.a).c;
        Object obj2 = this.l;
        if (obj2 == null || (a = l64Var.a(obj2)) == -1 || l64Var.d(a, this.a, false).c != i) {
            j78 j78Var = this.h;
            while (true) {
                if (j78Var == null) {
                    j78Var = this.h;
                    while (j78Var != null) {
                        int a2 = l64Var.a(j78Var.b);
                        if (a2 == -1 || l64Var.d(a2, this.a, false).c != i) {
                            j78Var = j78Var.g();
                        }
                    }
                    j2 = this.e;
                    this.e = 1 + j2;
                    if (this.h == null) {
                        this.l = obj;
                        this.m = j2;
                    }
                } else if (j78Var.b.equals(obj)) {
                    break;
                } else {
                    j78Var = j78Var.g();
                }
            }
            j2 = j78Var.f.a.d;
        } else {
            j2 = this.m;
        }
        long j3 = j2;
        l64Var.n(obj, this.a);
        l64Var.e(this.a.c, this.b, 0L);
        int a3 = l64Var.a(obj);
        Object obj3 = obj;
        while (true) {
            i54 i54Var = this.b;
            if (a3 < i54Var.m) {
                return A(l64Var, obj3, j, j3, i54Var, this.a);
            }
            l64Var.d(a3, this.a, true);
            this.a.b();
            d34 d34Var = this.a;
            if (d34Var.d(d34Var.d) != -1) {
                obj3 = this.a.b;
                Objects.requireNonNull(obj3);
            }
            a3--;
        }
    }

    public final void l() {
        if (this.k == 0) {
            return;
        }
        j78 j78Var = this.h;
        uo4.b(j78Var);
        this.l = j78Var.b;
        this.m = j78Var.f.a.d;
        while (j78Var != null) {
            j78Var.n();
            j78Var = j78Var.g();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        B();
    }

    public final /* synthetic */ void m(v17 v17Var, pr8 pr8Var) {
        this.c.i(v17Var.h(), pr8Var);
    }

    public final void n(long j) {
        j78 j78Var = this.j;
        if (j78Var != null) {
            j78Var.m(j);
        }
    }

    public final boolean o(nr8 nr8Var) {
        j78 j78Var = this.j;
        return j78Var != null && j78Var.a == nr8Var;
    }

    public final boolean p(j78 j78Var) {
        boolean z = false;
        uo4.f(j78Var != null);
        if (j78Var.equals(this.j)) {
            return false;
        }
        this.j = j78Var;
        while (j78Var.g() != null) {
            j78Var = j78Var.g();
            if (j78Var == this.i) {
                this.i = this.h;
                z = true;
            }
            j78Var.n();
            this.k--;
        }
        this.j.o(null);
        B();
        return z;
    }

    public final boolean q() {
        j78 j78Var = this.j;
        if (j78Var != null) {
            return !j78Var.f.i && j78Var.r() && this.j.f.e != -9223372036854775807L && this.k < 100;
        }
        return true;
    }

    public final boolean r(l64 l64Var, long j, long j2) {
        m78 m78Var;
        boolean z;
        j78 j78Var = null;
        for (j78 j78Var2 = this.h; j78Var2 != null; j78Var2 = j78Var2.g()) {
            m78 m78Var2 = j78Var2.f;
            if (j78Var == null) {
                m78Var = j(l64Var, m78Var2);
            } else {
                m78 w = w(l64Var, j78Var, j);
                if (w == null) {
                    return !p(j78Var);
                } else if (m78Var2.b != w.b || !m78Var2.a.equals(w.a)) {
                    return !p(j78Var);
                } else {
                    m78Var = w;
                }
            }
            j78Var2.f = m78Var.a(m78Var2.c);
            long j3 = m78Var2.e;
            long j4 = m78Var.e;
            if (j3 != -9223372036854775807L && j3 != j4) {
                j78Var2.q();
                long j5 = m78Var.e;
                long e = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + j78Var2.e();
                if (j78Var2 == this.i) {
                    boolean z2 = j78Var2.f.f;
                    if (j2 == Long.MIN_VALUE || j2 >= e) {
                        z = true;
                        return p(j78Var2) && !z;
                    }
                }
                z = false;
                if (p(j78Var2)) {
                }
            }
            j78Var = j78Var2;
        }
        return true;
    }

    public final boolean s(l64 l64Var, int i) {
        this.f = i;
        return b(l64Var);
    }

    public final boolean t(l64 l64Var, boolean z) {
        this.g = z;
        return b(l64Var);
    }

    public final j78 u(l98[] l98VarArr, zv8 zv8Var, nw8 nw8Var, n88 n88Var, m78 m78Var, fw8 fw8Var) {
        j78 j78Var = this.j;
        j78 j78Var2 = new j78(l98VarArr, j78Var == null ? 1000000000000L : (j78Var.e() + j78Var.f.e) - m78Var.b, zv8Var, nw8Var, n88Var, m78Var, fw8Var, null);
        j78 j78Var3 = this.j;
        if (j78Var3 != null) {
            j78Var3.o(j78Var2);
        } else {
            this.h = j78Var2;
            this.i = j78Var2;
        }
        this.l = null;
        this.j = j78Var2;
        this.k++;
        B();
        return j78Var2;
    }

    public final long v(l64 l64Var, Object obj, int i) {
        l64Var.n(obj, this.a);
        this.a.h(i);
        this.a.j(i);
        return 0L;
    }

    public final m78 w(l64 l64Var, j78 j78Var, long j) {
        long j2;
        m78 m78Var = j78Var.f;
        long e = (j78Var.e() + m78Var.e) - j;
        if (!m78Var.g) {
            pr8 pr8Var = m78Var.a;
            l64Var.n(pr8Var.a, this.a);
            if (!pr8Var.b()) {
                int e2 = this.a.e(pr8Var.e);
                this.a.l(pr8Var.e);
                if (e2 != this.a.a(pr8Var.e)) {
                    return y(l64Var, pr8Var.a, pr8Var.e, e2, m78Var.e, pr8Var.d);
                }
                v(l64Var, pr8Var.a, pr8Var.e);
                return z(l64Var, pr8Var.a, 0L, m78Var.e, pr8Var.d);
            }
            int i = pr8Var.b;
            if (this.a.a(i) == -1) {
                return null;
            }
            int f = this.a.f(i, pr8Var.c);
            if (f < 0) {
                return y(l64Var, pr8Var.a, i, f, m78Var.c, pr8Var.d);
            }
            long j3 = m78Var.c;
            if (j3 == -9223372036854775807L) {
                i54 i54Var = this.b;
                d34 d34Var = this.a;
                Pair m = l64Var.m(i54Var, d34Var, d34Var.c, -9223372036854775807L, Math.max(0L, e));
                if (m == null) {
                    return null;
                }
                j3 = ((Long) m.second).longValue();
            }
            v(l64Var, pr8Var.a, pr8Var.b);
            return z(l64Var, pr8Var.a, Math.max(0L, j3), m78Var.c, pr8Var.d);
        }
        long j4 = 0;
        int i2 = l64Var.i(l64Var.a(m78Var.a.a), this.a, this.b, this.f, this.g);
        if (i2 == -1) {
            return null;
        }
        int i3 = l64Var.d(i2, this.a, true).c;
        Object obj = this.a.b;
        Objects.requireNonNull(obj);
        long j5 = m78Var.a.d;
        if (l64Var.e(i3, this.b, 0L).m == i2) {
            Pair m2 = l64Var.m(this.b, this.a, i3, -9223372036854775807L, Math.max(0L, e));
            if (m2 == null) {
                return null;
            }
            obj = m2.first;
            long longValue = ((Long) m2.second).longValue();
            j78 g = j78Var.g();
            if (g == null || !g.b.equals(obj)) {
                j5 = this.e;
                this.e = 1 + j5;
            } else {
                j5 = g.f.a.d;
            }
            j2 = longValue;
            j4 = -9223372036854775807L;
        } else {
            j2 = 0;
        }
        pr8 A = A(l64Var, obj, j2, j5, this.b, this.a);
        if (j4 != -9223372036854775807L && m78Var.c != -9223372036854775807L) {
            l64Var.n(m78Var.a.a, this.a).b();
        }
        return x(l64Var, A, j4, j2);
    }

    public final m78 x(l64 l64Var, pr8 pr8Var, long j, long j2) {
        l64Var.n(pr8Var.a, this.a);
        boolean b = pr8Var.b();
        Object obj = pr8Var.a;
        return b ? y(l64Var, obj, pr8Var.b, pr8Var.c, j, pr8Var.d) : z(l64Var, obj, j2, j, pr8Var.d);
    }

    public final m78 y(l64 l64Var, Object obj, int i, int i2, long j, long j2) {
        pr8 pr8Var = new pr8(obj, i, i2, j2);
        long g = l64Var.n(pr8Var.a, this.a).g(pr8Var.b, pr8Var.c);
        if (i2 == this.a.e(i)) {
            this.a.i();
        }
        this.a.l(pr8Var.b);
        long j3 = 0;
        if (g != -9223372036854775807L && g <= 0) {
            j3 = Math.max(0L, (-1) + g);
        }
        return new m78(pr8Var, j3, j, -9223372036854775807L, g, false, false, false, false);
    }

    public final m78 z(l64 l64Var, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        l64Var.n(obj, this.a);
        int c = this.a.c(j7);
        d34 d34Var = this.a;
        if (c == -1) {
            d34Var.b();
        } else {
            d34Var.l(c);
        }
        pr8 pr8Var = new pr8(obj, j3, c);
        boolean c2 = c(pr8Var);
        boolean a = a(l64Var, pr8Var);
        boolean C = C(l64Var, pr8Var, c2);
        if (c != -1) {
            this.a.l(c);
        }
        if (c != -1) {
            this.a.h(c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.a.d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new m78(pr8Var, j7, j2, j6, j5, false, c2, a, C);
    }
}
