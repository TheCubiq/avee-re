package com.daaw;

import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class l64 {

    /* renamed from: a */
    public static final l64 f17090a = new x04();

    /* renamed from: b */
    public static final th8 f17091b = new th8() { // from class: com.daaw.vz3
    };

    /* renamed from: a */
    public abstract int mo4511a(Object obj);

    /* renamed from: b */
    public abstract int mo4510b();

    /* renamed from: c */
    public abstract int mo4509c();

    /* renamed from: d */
    public abstract d34 mo1924d(int i, d34 d34Var, boolean z);

    /* renamed from: e */
    public abstract i54 mo1923e(int i, i54 i54Var, long j);

    public final boolean equals(Object obj) {
        int mo4799h;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l64) {
            l64 l64Var = (l64) obj;
            if (l64Var.mo4509c() == mo4509c() && l64Var.mo4510b() == mo4510b()) {
                i54 i54Var = new i54();
                d34 d34Var = new d34();
                i54 i54Var2 = new i54();
                d34 d34Var2 = new d34();
                for (int i = 0; i < mo4509c(); i++) {
                    if (!mo1923e(i, i54Var, 0L).equals(l64Var.mo1923e(i, i54Var2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo4510b(); i2++) {
                    if (!mo1924d(i2, d34Var, true).equals(l64Var.mo1924d(i2, d34Var2, true))) {
                        return false;
                    }
                }
                int mo4800g = mo4800g(true);
                if (mo4800g == l64Var.mo4800g(true) && (mo4799h = mo4799h(true)) == l64Var.mo4799h(true)) {
                    while (mo4800g != mo4799h) {
                        int mo4798j = mo4798j(mo4800g, 0, true);
                        if (mo4798j != l64Var.mo4798j(mo4800g, 0, true)) {
                            return false;
                        }
                        mo4800g = mo4798j;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public abstract Object mo4508f(int i);

    /* renamed from: g */
    public int mo4800g(boolean z) {
        return m17121o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo4799h(boolean z) {
        if (m17121o()) {
            return -1;
        }
        return mo4509c() - 1;
    }

    public final int hashCode() {
        int i;
        i54 i54Var = new i54();
        d34 d34Var = new d34();
        int mo4509c = mo4509c() + 217;
        int i2 = 0;
        while (true) {
            i = mo4509c * 31;
            if (i2 >= mo4509c()) {
                break;
            }
            mo4509c = i + mo1923e(i2, i54Var, 0L).hashCode();
            i2++;
        }
        int mo4510b = i + mo4510b();
        for (int i3 = 0; i3 < mo4510b(); i3++) {
            mo4510b = (mo4510b * 31) + mo1924d(i3, d34Var, true).hashCode();
        }
        int mo4800g = mo4800g(true);
        while (mo4800g != -1) {
            mo4510b = (mo4510b * 31) + mo4800g;
            mo4800g = mo4798j(mo4800g, 0, true);
        }
        return mo4510b;
    }

    /* renamed from: i */
    public final int m17124i(int i, d34 d34Var, i54 i54Var, int i2, boolean z) {
        int i3 = mo1924d(i, d34Var, false).f6450c;
        if (mo1923e(i3, i54Var, 0L).f13280n == i) {
            int mo4798j = mo4798j(i3, i2, z);
            if (mo4798j == -1) {
                return -1;
            }
            return mo1923e(mo4798j, i54Var, 0L).f13279m;
        }
        return i + 1;
    }

    /* renamed from: j */
    public int mo4798j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo4799h(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo4799h(z) ? mo4800g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: k */
    public int mo4797k(int i, int i2, boolean z) {
        if (i == mo4800g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: l */
    public final Pair m17123l(i54 i54Var, d34 d34Var, int i, long j) {
        Pair m17122m = m17122m(i54Var, d34Var, i, j, 0L);
        Objects.requireNonNull(m17122m);
        return m17122m;
    }

    /* renamed from: m */
    public final Pair m17122m(i54 i54Var, d34 d34Var, int i, long j, long j2) {
        uo4.m7877a(i, 0, mo4509c());
        mo1923e(i, i54Var, j2);
        if (j == -9223372036854775807L) {
            long j3 = i54Var.f13277k;
            j = 0;
        }
        int i2 = i54Var.f13279m;
        mo1924d(i2, d34Var, false);
        while (i2 < i54Var.f13280n) {
            long j4 = d34Var.f6452e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = mo1924d(i3, d34Var, false).f6452e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        mo1924d(i2, d34Var, true);
        long j6 = d34Var.f6452e;
        long j7 = d34Var.f6451d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = d34Var.f6449b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public d34 mo13467n(Object obj, d34 d34Var) {
        return mo1924d(mo4511a(obj), d34Var, true);
    }

    /* renamed from: o */
    public final boolean m17121o() {
        return mo4509c() == 0;
    }
}
