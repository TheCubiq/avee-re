package com.daaw;

import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class l64 {
    public static final l64 a = new x04();
    public static final th8 b = new th8() { // from class: com.daaw.vz3
    };

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract d34 d(int i, d34 d34Var, boolean z);

    public abstract i54 e(int i, i54 i54Var, long j);

    public final boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l64) {
            l64 l64Var = (l64) obj;
            if (l64Var.c() == c() && l64Var.b() == b()) {
                i54 i54Var = new i54();
                d34 d34Var = new d34();
                i54 i54Var2 = new i54();
                d34 d34Var2 = new d34();
                for (int i = 0; i < c(); i++) {
                    if (!e(i, i54Var, 0L).equals(l64Var.e(i, i54Var2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < b(); i2++) {
                    if (!d(i2, d34Var, true).equals(l64Var.d(i2, d34Var2, true))) {
                        return false;
                    }
                }
                int g = g(true);
                if (g == l64Var.g(true) && (h = h(true)) == l64Var.h(true)) {
                    while (g != h) {
                        int j = j(g, 0, true);
                        if (j != l64Var.j(g, 0, true)) {
                            return false;
                        }
                        g = j;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return o() ? -1 : 0;
    }

    public int h(boolean z) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        i54 i54Var = new i54();
        d34 d34Var = new d34();
        int c = c() + 217;
        int i2 = 0;
        while (true) {
            i = c * 31;
            if (i2 >= c()) {
                break;
            }
            c = i + e(i2, i54Var, 0L).hashCode();
            i2++;
        }
        int b2 = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            b2 = (b2 * 31) + d(i3, d34Var, true).hashCode();
        }
        int g = g(true);
        while (g != -1) {
            b2 = (b2 * 31) + g;
            g = j(g, 0, true);
        }
        return b2;
    }

    public final int i(int i, d34 d34Var, i54 i54Var, int i2, boolean z) {
        int i3 = d(i, d34Var, false).c;
        if (e(i3, i54Var, 0L).n == i) {
            int j = j(i3, i2, z);
            if (j == -1) {
                return -1;
            }
            return e(j, i54Var, 0L).m;
        }
        return i + 1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == h(z) ? g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public int k(int i, int i2, boolean z) {
        if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(i54 i54Var, d34 d34Var, int i, long j) {
        Pair m = m(i54Var, d34Var, i, j, 0L);
        Objects.requireNonNull(m);
        return m;
    }

    public final Pair m(i54 i54Var, d34 d34Var, int i, long j, long j2) {
        uo4.a(i, 0, c());
        e(i, i54Var, j2);
        if (j == -9223372036854775807L) {
            long j3 = i54Var.k;
            j = 0;
        }
        int i2 = i54Var.m;
        d(i2, d34Var, false);
        while (i2 < i54Var.n) {
            long j4 = d34Var.e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = d(i3, d34Var, false).e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, d34Var, true);
        long j6 = d34Var.e;
        long j7 = d34Var.d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = d34Var.b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public d34 n(Object obj, d34 d34Var) {
        return d(a(obj), d34Var, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
