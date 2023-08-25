package com.daaw;

import android.util.Pair;
import com.daaw.bp0;
import com.daaw.nl1;
/* loaded from: classes.dex */
public final class to0 {

    /* renamed from: a */
    public final nl1.C2314b f27901a = new nl1.C2314b();

    /* renamed from: b */
    public final nl1.C2315c f27902b = new nl1.C2315c();

    /* renamed from: c */
    public long f27903c;

    /* renamed from: d */
    public nl1 f27904d;

    /* renamed from: e */
    public int f27905e;

    /* renamed from: f */
    public boolean f27906f;

    /* renamed from: g */
    public ro0 f27907g;

    /* renamed from: h */
    public ro0 f27908h;

    /* renamed from: i */
    public ro0 f27909i;

    /* renamed from: j */
    public int f27910j;

    /* renamed from: k */
    public Object f27911k;

    /* renamed from: l */
    public long f27912l;

    /* renamed from: A */
    public void m8948A(nl1 nl1Var) {
        this.f27904d = nl1Var;
    }

    /* renamed from: B */
    public boolean m8947B() {
        ro0 ro0Var = this.f27909i;
        return ro0Var == null || (!ro0Var.f25441h.f26447g && ro0Var.m11114l() && this.f27909i.f25441h.f26445e != -9223372036854775807L && this.f27910j < 100);
    }

    /* renamed from: C */
    public final boolean m8946C() {
        ro0 ro0Var;
        ro0 m8935h = m8935h();
        if (m8935h == null) {
            return true;
        }
        while (true) {
            int m15080d = this.f27904d.m15080d(m8935h.f25441h.f26441a.f5022a, this.f27901a, this.f27902b, this.f27905e, this.f27906f);
            while (true) {
                ro0Var = m8935h.f25442i;
                if (ro0Var == null || m8935h.f25441h.f26446f) {
                    break;
                }
                m8935h = ro0Var;
            }
            if (m15080d == -1 || ro0Var == null || ro0Var.f25441h.f26441a.f5022a != m15080d) {
                break;
            }
            m8935h = ro0Var;
        }
        boolean m8920w = m8920w(m8935h);
        so0 so0Var = m8935h.f25441h;
        m8935h.f25441h = m8926q(so0Var, so0Var.f26441a);
        return (m8920w && m8925r()) ? false : true;
    }

    /* renamed from: D */
    public boolean m8945D(bp0.C0880a c0880a, long j) {
        int i = c0880a.f5022a;
        ro0 ro0Var = null;
        int i2 = i;
        for (ro0 m8935h = m8935h(); m8935h != null; m8935h = m8935h.f25442i) {
            if (ro0Var == null) {
                m8935h.f25441h = m8927p(m8935h.f25441h, i2);
            } else if (i2 == -1 || !m8935h.f25435b.equals(this.f27904d.mo14378g(i2, this.f27901a, true).f20217b)) {
                return true ^ m8920w(ro0Var);
            } else {
                so0 m8936g = m8936g(ro0Var, j);
                if (m8936g == null) {
                    return true ^ m8920w(ro0Var);
                }
                m8935h.f25441h = m8927p(m8935h.f25441h, i2);
                if (!m8940c(m8935h, m8936g)) {
                    return true ^ m8920w(ro0Var);
                }
            }
            if (m8935h.f25441h.f26446f) {
                i2 = this.f27904d.m15080d(i2, this.f27901a, this.f27902b, this.f27905e, this.f27906f);
            }
            ro0Var = m8935h;
        }
        return true;
    }

    /* renamed from: E */
    public boolean m8944E(int i) {
        this.f27905e = i;
        return m8946C();
    }

    /* renamed from: F */
    public boolean m8943F(boolean z) {
        this.f27906f = z;
        return m8946C();
    }

    /* renamed from: a */
    public ro0 m8942a() {
        ro0 ro0Var = this.f27907g;
        if (ro0Var != null) {
            if (ro0Var == this.f27908h) {
                this.f27908h = ro0Var.f25442i;
            }
            ro0Var.m11112n();
            this.f27907g = this.f27907g.f25442i;
            int i = this.f27910j - 1;
            this.f27910j = i;
            if (i == 0) {
                this.f27909i = null;
            }
        } else {
            ro0 ro0Var2 = this.f27909i;
            this.f27907g = ro0Var2;
            this.f27908h = ro0Var2;
        }
        return this.f27907g;
    }

    /* renamed from: b */
    public ro0 m8941b() {
        ro0 ro0Var = this.f27908h;
        C2914s6.m10685f((ro0Var == null || ro0Var.f25442i == null) ? false : true);
        ro0 ro0Var2 = this.f27908h.f25442i;
        this.f27908h = ro0Var2;
        return ro0Var2;
    }

    /* renamed from: c */
    public final boolean m8940c(ro0 ro0Var, so0 so0Var) {
        so0 so0Var2 = ro0Var.f25441h;
        return so0Var2.f26442b == so0Var.f26442b && so0Var2.f26443c == so0Var.f26443c && so0Var2.f26441a.equals(so0Var.f26441a);
    }

    /* renamed from: d */
    public void m8939d(boolean z) {
        ro0 m8935h = m8935h();
        if (m8935h != null) {
            this.f27911k = z ? m8935h.f25435b : null;
            this.f27912l = m8935h.f25441h.f26441a.f5025d;
            m8935h.m11112n();
            m8920w(m8935h);
        } else if (!z) {
            this.f27911k = null;
        }
        this.f27907g = null;
        this.f27909i = null;
        this.f27908h = null;
        this.f27910j = 0;
    }

    /* renamed from: e */
    public qo0 m8938e(b41[] b41VarArr, wm1 wm1Var, InterfaceC2006l2 interfaceC2006l2, bp0 bp0Var, Object obj, so0 so0Var) {
        ro0 ro0Var = this.f27909i;
        ro0 ro0Var2 = new ro0(b41VarArr, ro0Var == null ? so0Var.f26442b : ro0Var.m11116j() + this.f27909i.f25441h.f26445e, wm1Var, interfaceC2006l2, bp0Var, obj, so0Var);
        if (this.f27909i != null) {
            C2914s6.m10685f(m8925r());
            this.f27909i.f25442i = ro0Var2;
        }
        this.f27911k = null;
        this.f27909i = ro0Var2;
        this.f27910j++;
        return ro0Var2.f25434a;
    }

    /* renamed from: f */
    public final so0 m8937f(yw0 yw0Var) {
        return m8933j(yw0Var.f34181c, yw0Var.f34183e, yw0Var.f34182d);
    }

    /* renamed from: g */
    public final so0 m8936g(ro0 ro0Var, long j) {
        int i;
        long j2;
        long j3;
        so0 so0Var = ro0Var.f25441h;
        if (so0Var.f26446f) {
            int m15080d = this.f27904d.m15080d(so0Var.f26441a.f5022a, this.f27901a, this.f27902b, this.f27905e, this.f27906f);
            if (m15080d == -1) {
                return null;
            }
            int i2 = this.f27904d.mo14378g(m15080d, this.f27901a, true).f20218c;
            Object obj = this.f27901a.f20217b;
            long j4 = so0Var.f26441a.f5025d;
            long j5 = 0;
            if (this.f27904d.m15075k(i2, this.f27902b).f20227f == m15080d) {
                Pair<Integer, Long> m15076j = this.f27904d.m15076j(this.f27902b, this.f27901a, i2, -9223372036854775807L, Math.max(0L, (ro0Var.m11116j() + so0Var.f26445e) - j));
                if (m15076j == null) {
                    return null;
                }
                int intValue = ((Integer) m15076j.first).intValue();
                long longValue = ((Long) m15076j.second).longValue();
                ro0 ro0Var2 = ro0Var.f25442i;
                if (ro0Var2 == null || !ro0Var2.f25435b.equals(obj)) {
                    j3 = this.f27903c;
                    this.f27903c = 1 + j3;
                } else {
                    j3 = ro0Var.f25442i.f25441h.f26441a.f5025d;
                }
                j5 = longValue;
                j2 = j3;
                i = intValue;
            } else {
                i = m15080d;
                j2 = j4;
            }
            long j6 = j5;
            return m8933j(m8918y(i, j6, j2), j6, j5);
        }
        bp0.C0880a c0880a = so0Var.f26441a;
        this.f27904d.m15078f(c0880a.f5022a, this.f27901a);
        if (c0880a.m25954b()) {
            int i3 = c0880a.f5023b;
            int m15071a = this.f27901a.m15071a(i3);
            if (m15071a == -1) {
                return null;
            }
            int m15061k = this.f27901a.m15061k(i3, c0880a.f5024c);
            if (m15061k < m15071a) {
                if (this.f27901a.m15058n(i3, m15061k)) {
                    return m8932k(c0880a.f5022a, i3, m15061k, so0Var.f26444d, c0880a.f5025d);
                }
                return null;
            }
            return m8931l(c0880a.f5022a, so0Var.f26444d, c0880a.f5025d);
        }
        long j7 = so0Var.f26443c;
        if (j7 != Long.MIN_VALUE) {
            int m15067e = this.f27901a.m15067e(j7);
            if (m15067e == -1) {
                return m8931l(c0880a.f5022a, so0Var.f26443c, c0880a.f5025d);
            }
            int m15062j = this.f27901a.m15062j(m15067e);
            if (this.f27901a.m15058n(m15067e, m15062j)) {
                return m8932k(c0880a.f5022a, m15067e, m15062j, so0Var.f26443c, c0880a.f5025d);
            }
            return null;
        }
        int m15069c = this.f27901a.m15069c();
        if (m15069c == 0) {
            return null;
        }
        int i4 = m15069c - 1;
        if (this.f27901a.m15066f(i4) != Long.MIN_VALUE || this.f27901a.m15059m(i4)) {
            return null;
        }
        int m15062j2 = this.f27901a.m15062j(i4);
        if (this.f27901a.m15058n(i4, m15062j2)) {
            return m8932k(c0880a.f5022a, i4, m15062j2, this.f27901a.m15063i(), c0880a.f5025d);
        }
        return null;
    }

    /* renamed from: h */
    public ro0 m8935h() {
        return m8925r() ? this.f27907g : this.f27909i;
    }

    /* renamed from: i */
    public ro0 m8934i() {
        return this.f27909i;
    }

    /* renamed from: j */
    public final so0 m8933j(bp0.C0880a c0880a, long j, long j2) {
        this.f27904d.m15078f(c0880a.f5022a, this.f27901a);
        if (c0880a.m25954b()) {
            if (this.f27901a.m15058n(c0880a.f5023b, c0880a.f5024c)) {
                return m8932k(c0880a.f5022a, c0880a.f5023b, c0880a.f5024c, j, c0880a.f5025d);
            }
            return null;
        }
        return m8931l(c0880a.f5022a, j2, c0880a.f5025d);
    }

    /* renamed from: k */
    public final so0 m8932k(int i, int i2, int i3, long j, long j2) {
        bp0.C0880a c0880a = new bp0.C0880a(i, i2, i3, j2);
        boolean m8924s = m8924s(c0880a, Long.MIN_VALUE);
        boolean m8923t = m8923t(c0880a, m8924s);
        return new so0(c0880a, i3 == this.f27901a.m15062j(i2) ? this.f27901a.m15065g() : 0L, Long.MIN_VALUE, j, this.f27904d.m15078f(c0880a.f5022a, this.f27901a).m15070b(c0880a.f5023b, c0880a.f5024c), m8924s, m8923t);
    }

    /* renamed from: l */
    public final so0 m8931l(int i, long j, long j2) {
        bp0.C0880a c0880a = new bp0.C0880a(i, j2);
        this.f27904d.m15078f(c0880a.f5022a, this.f27901a);
        int m15068d = this.f27901a.m15068d(j);
        long m15066f = m15068d == -1 ? Long.MIN_VALUE : this.f27901a.m15066f(m15068d);
        boolean m8924s = m8924s(c0880a, m15066f);
        return new so0(c0880a, j, m15066f, -9223372036854775807L, m15066f == Long.MIN_VALUE ? this.f27901a.m15063i() : m15066f, m8924s, m8923t(c0880a, m8924s));
    }

    /* renamed from: m */
    public so0 m8930m(long j, yw0 yw0Var) {
        ro0 ro0Var = this.f27909i;
        return ro0Var == null ? m8937f(yw0Var) : m8936g(ro0Var, j);
    }

    /* renamed from: n */
    public ro0 m8929n() {
        return this.f27907g;
    }

    /* renamed from: o */
    public ro0 m8928o() {
        return this.f27908h;
    }

    /* renamed from: p */
    public so0 m8927p(so0 so0Var, int i) {
        return m8926q(so0Var, so0Var.f26441a.m25955a(i));
    }

    /* renamed from: q */
    public final so0 m8926q(so0 so0Var, bp0.C0880a c0880a) {
        long j;
        long m15063i;
        long j2 = so0Var.f26442b;
        long j3 = so0Var.f26443c;
        boolean m8924s = m8924s(c0880a, j3);
        boolean m8923t = m8923t(c0880a, m8924s);
        this.f27904d.m15078f(c0880a.f5022a, this.f27901a);
        if (c0880a.m25954b()) {
            m15063i = this.f27901a.m15070b(c0880a.f5023b, c0880a.f5024c);
        } else if (j3 != Long.MIN_VALUE) {
            j = j3;
            return new so0(c0880a, j2, j3, so0Var.f26444d, j, m8924s, m8923t);
        } else {
            m15063i = this.f27901a.m15063i();
        }
        j = m15063i;
        return new so0(c0880a, j2, j3, so0Var.f26444d, j, m8924s, m8923t);
    }

    /* renamed from: r */
    public boolean m8925r() {
        return this.f27907g != null;
    }

    /* renamed from: s */
    public final boolean m8924s(bp0.C0880a c0880a, long j) {
        int m15069c = this.f27904d.m15078f(c0880a.f5022a, this.f27901a).m15069c();
        if (m15069c == 0) {
            return true;
        }
        int i = m15069c - 1;
        boolean m25954b = c0880a.m25954b();
        if (this.f27901a.m15066f(i) != Long.MIN_VALUE) {
            return !m25954b && j == Long.MIN_VALUE;
        }
        int m15071a = this.f27901a.m15071a(i);
        if (m15071a == -1) {
            return false;
        }
        if (m25954b && c0880a.f5023b == i && c0880a.f5024c == m15071a + (-1)) {
            return true;
        }
        return !m25954b && this.f27901a.m15062j(i) == m15071a;
    }

    /* renamed from: t */
    public final boolean m8923t(bp0.C0880a c0880a, boolean z) {
        return !this.f27904d.m15075k(this.f27904d.m15078f(c0880a.f5022a, this.f27901a).f20218c, this.f27902b).f20226e && this.f27904d.m15072p(c0880a.f5022a, this.f27901a, this.f27902b, this.f27905e, this.f27906f) && z;
    }

    /* renamed from: u */
    public boolean m8922u(qo0 qo0Var) {
        ro0 ro0Var = this.f27909i;
        return ro0Var != null && ro0Var.f25434a == qo0Var;
    }

    /* renamed from: v */
    public void m8921v(long j) {
        ro0 ro0Var = this.f27909i;
        if (ro0Var != null) {
            ro0Var.m11113m(j);
        }
    }

    /* renamed from: w */
    public boolean m8920w(ro0 ro0Var) {
        boolean z = false;
        C2914s6.m10685f(ro0Var != null);
        this.f27909i = ro0Var;
        while (true) {
            ro0Var = ro0Var.f25442i;
            if (ro0Var == null) {
                this.f27909i.f25442i = null;
                return z;
            }
            if (ro0Var == this.f27908h) {
                this.f27908h = this.f27907g;
                z = true;
            }
            ro0Var.m11112n();
            this.f27910j--;
        }
    }

    /* renamed from: x */
    public bp0.C0880a m8919x(int i, long j) {
        return m8918y(i, j, m8917z(i));
    }

    /* renamed from: y */
    public final bp0.C0880a m8918y(int i, long j, long j2) {
        this.f27904d.m15078f(i, this.f27901a);
        int m15067e = this.f27901a.m15067e(j);
        return m15067e == -1 ? new bp0.C0880a(i, j2) : new bp0.C0880a(i, m15067e, this.f27901a.m15062j(m15067e), j2);
    }

    /* renamed from: z */
    public final long m8917z(int i) {
        int mo14379b;
        Object obj = this.f27904d.mo14378g(i, this.f27901a, true).f20217b;
        int i2 = this.f27901a.f20218c;
        Object obj2 = this.f27911k;
        if (obj2 == null || (mo14379b = this.f27904d.mo14379b(obj2)) == -1 || this.f27904d.m15078f(mo14379b, this.f27901a).f20218c != i2) {
            for (ro0 m8935h = m8935h(); m8935h != null; m8935h = m8935h.f25442i) {
                if (m8935h.f25435b.equals(obj)) {
                    return m8935h.f25441h.f26441a.f5025d;
                }
            }
            for (ro0 m8935h2 = m8935h(); m8935h2 != null; m8935h2 = m8935h2.f25442i) {
                int mo14379b2 = this.f27904d.mo14379b(m8935h2.f25435b);
                if (mo14379b2 != -1 && this.f27904d.m15078f(mo14379b2, this.f27901a).f20218c == i2) {
                    return m8935h2.f25441h.f26441a.f5025d;
                }
            }
            long j = this.f27903c;
            this.f27903c = 1 + j;
            return j;
        }
        return this.f27912l;
    }
}
