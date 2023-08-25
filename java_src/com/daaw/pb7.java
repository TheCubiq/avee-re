package com.daaw;

import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class pb7 extends l64 {

    /* renamed from: c */
    public final int f22809c;

    /* renamed from: d */
    public final wt8 f22810d;

    public pb7(boolean z, wt8 wt8Var, byte[] bArr) {
        this.f22810d = wt8Var;
        this.f22809c = wt8Var.m5800c();
    }

    @Override // com.daaw.l64
    /* renamed from: a */
    public final int mo4511a(Object obj) {
        int mo4511a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int mo13466p = mo13466p(obj2);
            if (mo13466p == -1 || (mo4511a = mo13461u(mo13466p).mo4511a(obj3)) == -1) {
                return -1;
            }
            return mo13463s(mo13466p) + mo4511a;
        }
        return -1;
    }

    @Override // com.daaw.l64
    /* renamed from: d */
    public final d34 mo1924d(int i, d34 d34Var, boolean z) {
        int mo13465q = mo13465q(i);
        int mo13462t = mo13462t(mo13465q);
        mo13461u(mo13465q).mo1924d(i - mo13463s(mo13465q), d34Var, z);
        d34Var.f6450c += mo13462t;
        if (z) {
            Object mo13460v = mo13460v(mo13465q);
            Object obj = d34Var.f6449b;
            Objects.requireNonNull(obj);
            d34Var.f6449b = Pair.create(mo13460v, obj);
        }
        return d34Var;
    }

    @Override // com.daaw.l64
    /* renamed from: e */
    public final i54 mo1923e(int i, i54 i54Var, long j) {
        int mo13464r = mo13464r(i);
        int mo13462t = mo13462t(mo13464r);
        int mo13463s = mo13463s(mo13464r);
        mo13461u(mo13464r).mo1923e(i - mo13462t, i54Var, j);
        Object mo13460v = mo13460v(mo13464r);
        if (!i54.f13263o.equals(i54Var.f13267a)) {
            mo13460v = Pair.create(mo13460v, i54Var.f13267a);
        }
        i54Var.f13267a = mo13460v;
        i54Var.f13279m += mo13463s;
        i54Var.f13280n += mo13463s;
        return i54Var;
    }

    @Override // com.daaw.l64
    /* renamed from: f */
    public final Object mo4508f(int i) {
        int mo13465q = mo13465q(i);
        return Pair.create(mo13460v(mo13465q), mo13461u(mo13465q).mo4508f(i - mo13463s(mo13465q)));
    }

    @Override // com.daaw.l64
    /* renamed from: g */
    public final int mo4800g(boolean z) {
        if (this.f22809c == 0) {
            return -1;
        }
        int m5802a = z ? this.f22810d.m5802a() : 0;
        while (mo13461u(m5802a).m17121o()) {
            m5802a = m13459w(m5802a, z);
            if (m5802a == -1) {
                return -1;
            }
        }
        return mo13462t(m5802a) + mo13461u(m5802a).mo4800g(z);
    }

    @Override // com.daaw.l64
    /* renamed from: h */
    public final int mo4799h(boolean z) {
        int i = this.f22809c;
        if (i == 0) {
            return -1;
        }
        int m5801b = z ? this.f22810d.m5801b() : i - 1;
        while (mo13461u(m5801b).m17121o()) {
            m5801b = m13458x(m5801b, z);
            if (m5801b == -1) {
                return -1;
            }
        }
        return mo13462t(m5801b) + mo13461u(m5801b).mo4799h(z);
    }

    @Override // com.daaw.l64
    /* renamed from: j */
    public final int mo4798j(int i, int i2, boolean z) {
        int mo13464r = mo13464r(i);
        int mo13462t = mo13462t(mo13464r);
        int mo4798j = mo13461u(mo13464r).mo4798j(i - mo13462t, i2 == 2 ? 0 : i2, z);
        if (mo4798j != -1) {
            return mo13462t + mo4798j;
        }
        int m13459w = m13459w(mo13464r, z);
        while (m13459w != -1 && mo13461u(m13459w).m17121o()) {
            m13459w = m13459w(m13459w, z);
        }
        if (m13459w != -1) {
            return mo13462t(m13459w) + mo13461u(m13459w).mo4800g(z);
        }
        if (i2 == 2) {
            return mo4800g(z);
        }
        return -1;
    }

    @Override // com.daaw.l64
    /* renamed from: k */
    public final int mo4797k(int i, int i2, boolean z) {
        int mo13464r = mo13464r(i);
        int mo13462t = mo13462t(mo13464r);
        int mo4797k = mo13461u(mo13464r).mo4797k(i - mo13462t, 0, false);
        if (mo4797k != -1) {
            return mo13462t + mo4797k;
        }
        int m13458x = m13458x(mo13464r, false);
        while (m13458x != -1 && mo13461u(m13458x).m17121o()) {
            m13458x = m13458x(m13458x, false);
        }
        if (m13458x != -1) {
            return mo13462t(m13458x) + mo13461u(m13458x).mo4799h(false);
        }
        return -1;
    }

    @Override // com.daaw.l64
    /* renamed from: n */
    public final d34 mo13467n(Object obj, d34 d34Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo13466p = mo13466p(obj2);
        int mo13462t = mo13462t(mo13466p);
        mo13461u(mo13466p).mo13467n(obj3, d34Var);
        d34Var.f6450c += mo13462t;
        d34Var.f6449b = obj;
        return d34Var;
    }

    /* renamed from: p */
    public abstract int mo13466p(Object obj);

    /* renamed from: q */
    public abstract int mo13465q(int i);

    /* renamed from: r */
    public abstract int mo13464r(int i);

    /* renamed from: s */
    public abstract int mo13463s(int i);

    /* renamed from: t */
    public abstract int mo13462t(int i);

    /* renamed from: u */
    public abstract l64 mo13461u(int i);

    /* renamed from: v */
    public abstract Object mo13460v(int i);

    /* renamed from: w */
    public final int m13459w(int i, boolean z) {
        if (z) {
            return this.f22810d.m5799d(i);
        }
        if (i >= this.f22809c - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: x */
    public final int m13458x(int i, boolean z) {
        if (z) {
            return this.f22810d.m5798e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }
}
