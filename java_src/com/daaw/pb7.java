package com.daaw;

import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class pb7 extends l64 {
    public final int c;
    public final wt8 d;

    public pb7(boolean z, wt8 wt8Var, byte[] bArr) {
        this.d = wt8Var;
        this.c = wt8Var.c();
    }

    @Override // com.daaw.l64
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int p = p(obj2);
            if (p == -1 || (a = u(p).a(obj3)) == -1) {
                return -1;
            }
            return s(p) + a;
        }
        return -1;
    }

    @Override // com.daaw.l64
    public final d34 d(int i, d34 d34Var, boolean z) {
        int q = q(i);
        int t = t(q);
        u(q).d(i - s(q), d34Var, z);
        d34Var.c += t;
        if (z) {
            Object v = v(q);
            Object obj = d34Var.b;
            Objects.requireNonNull(obj);
            d34Var.b = Pair.create(v, obj);
        }
        return d34Var;
    }

    @Override // com.daaw.l64
    public final i54 e(int i, i54 i54Var, long j) {
        int r = r(i);
        int t = t(r);
        int s = s(r);
        u(r).e(i - t, i54Var, j);
        Object v = v(r);
        if (!i54.o.equals(i54Var.a)) {
            v = Pair.create(v, i54Var.a);
        }
        i54Var.a = v;
        i54Var.m += s;
        i54Var.n += s;
        return i54Var;
    }

    @Override // com.daaw.l64
    public final Object f(int i) {
        int q = q(i);
        return Pair.create(v(q), u(q).f(i - s(q)));
    }

    @Override // com.daaw.l64
    public final int g(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        int a = z ? this.d.a() : 0;
        while (u(a).o()) {
            a = w(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return t(a) + u(a).g(z);
    }

    @Override // com.daaw.l64
    public final int h(boolean z) {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int b = z ? this.d.b() : i - 1;
        while (u(b).o()) {
            b = x(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return t(b) + u(b).h(z);
    }

    @Override // com.daaw.l64
    public final int j(int i, int i2, boolean z) {
        int r = r(i);
        int t = t(r);
        int j = u(r).j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = w(r, z);
        while (w != -1 && u(w).o()) {
            w = w(w, z);
        }
        if (w != -1) {
            return t(w) + u(w).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // com.daaw.l64
    public final int k(int i, int i2, boolean z) {
        int r = r(i);
        int t = t(r);
        int k = u(r).k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = x(r, false);
        while (x != -1 && u(x).o()) {
            x = x(x, false);
        }
        if (x != -1) {
            return t(x) + u(x).h(false);
        }
        return -1;
    }

    @Override // com.daaw.l64
    public final d34 n(Object obj, d34 d34Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = p(obj2);
        int t = t(p);
        u(p).n(obj3, d34Var);
        d34Var.c += t;
        d34Var.b = obj;
        return d34Var;
    }

    public abstract int p(Object obj);

    public abstract int q(int i);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract int t(int i);

    public abstract l64 u(int i);

    public abstract Object v(int i);

    public final int w(int i, boolean z) {
        if (z) {
            return this.d.d(i);
        }
        if (i >= this.c - 1) {
            return -1;
        }
        return i + 1;
    }

    public final int x(int i, boolean z) {
        if (z) {
            return this.d.e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }
}
