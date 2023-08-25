package com.daaw;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public final class s78 {

    /* renamed from: a */
    public final d34 f25970a = new d34();

    /* renamed from: b */
    public final i54 f25971b = new i54();

    /* renamed from: c */
    public final fb8 f25972c;

    /* renamed from: d */
    public final Handler f25973d;

    /* renamed from: e */
    public long f25974e;

    /* renamed from: f */
    public int f25975f;

    /* renamed from: g */
    public boolean f25976g;

    /* renamed from: h */
    public j78 f25977h;

    /* renamed from: i */
    public j78 f25978i;

    /* renamed from: j */
    public j78 f25979j;

    /* renamed from: k */
    public int f25980k;

    /* renamed from: l */
    public Object f25981l;

    /* renamed from: m */
    public long f25982m;

    public s78(fb8 fb8Var, Handler handler) {
        this.f25972c = fb8Var;
        this.f25973d = handler;
    }

    /* renamed from: A */
    public static pr8 m10589A(l64 l64Var, Object obj, long j, long j2, i54 i54Var, d34 d34Var) {
        l64Var.mo13467n(obj, d34Var);
        l64Var.mo1923e(d34Var.f6450c, i54Var, 0L);
        l64Var.mo4511a(obj);
        if (d34Var.f6451d == 0) {
            d34Var.m24727b();
        }
        l64Var.mo13467n(obj, d34Var);
        int m24725d = d34Var.m24725d(j);
        return m24725d == -1 ? new pr8(obj, j2, d34Var.m24726c(j)) : new pr8(obj, m24725d, d34Var.m24724e(m24725d), j2);
    }

    /* renamed from: c */
    public static final boolean m10584c(pr8 pr8Var) {
        return !pr8Var.m16079b() && pr8Var.f18809e == -1;
    }

    /* renamed from: B */
    public final void m10588B() {
        final v17 m4266o = y17.m4266o();
        for (j78 j78Var = this.f25977h; j78Var != null; j78Var = j78Var.m18753g()) {
            m4266o.m7548f(j78Var.f14507f.f18573a);
        }
        j78 j78Var2 = this.f25978i;
        final pr8 pr8Var = j78Var2 == null ? null : j78Var2.f14507f.f18573a;
        this.f25973d.post(new Runnable() { // from class: com.daaw.p78
            @Override // java.lang.Runnable
            public final void run() {
                s78.this.m10574m(m4266o, pr8Var);
            }
        });
    }

    /* renamed from: C */
    public final boolean m10587C(l64 l64Var, pr8 pr8Var, boolean z) {
        int mo4511a = l64Var.mo4511a(pr8Var.f18805a);
        return !l64Var.mo1923e(l64Var.mo1924d(mo4511a, this.f25970a, false).f6450c, this.f25971b, 0L).f13273g && l64Var.m17124i(mo4511a, this.f25970a, this.f25971b, this.f25975f, this.f25976g) == -1 && z;
    }

    /* renamed from: a */
    public final boolean m10586a(l64 l64Var, pr8 pr8Var) {
        if (m10584c(pr8Var)) {
            return l64Var.mo1923e(l64Var.mo13467n(pr8Var.f18805a, this.f25970a).f6450c, this.f25971b, 0L).f13280n == l64Var.mo4511a(pr8Var.f18805a);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m10585b(l64 l64Var) {
        j78 j78Var = this.f25977h;
        if (j78Var == null) {
            return true;
        }
        int mo4511a = l64Var.mo4511a(j78Var.f14503b);
        while (true) {
            mo4511a = l64Var.m17124i(mo4511a, this.f25970a, this.f25971b, this.f25975f, this.f25976g);
            while (j78Var.m18753g() != null && !j78Var.f14507f.f18579g) {
                j78Var = j78Var.m18753g();
            }
            j78 m18753g = j78Var.m18753g();
            if (mo4511a == -1 || m18753g == null || l64Var.mo4511a(m18753g.f14503b) != mo4511a) {
                break;
            }
            j78Var = m18753g;
        }
        boolean m10571p = m10571p(j78Var);
        j78Var.f14507f = m10577j(l64Var, j78Var.f14507f);
        return !m10571p;
    }

    /* renamed from: d */
    public final j78 m10583d() {
        j78 j78Var = this.f25977h;
        if (j78Var == null) {
            return null;
        }
        if (j78Var == this.f25978i) {
            this.f25978i = j78Var.m18753g();
        }
        j78Var.m18746n();
        int i = this.f25980k - 1;
        this.f25980k = i;
        if (i == 0) {
            this.f25979j = null;
            j78 j78Var2 = this.f25977h;
            this.f25981l = j78Var2.f14503b;
            this.f25982m = j78Var2.f14507f.f18573a.f18808d;
        }
        this.f25977h = this.f25977h.m18753g();
        m10588B();
        return this.f25977h;
    }

    /* renamed from: e */
    public final j78 m10582e() {
        j78 j78Var = this.f25978i;
        boolean z = false;
        if (j78Var != null && j78Var.m18753g() != null) {
            z = true;
        }
        uo4.m7872f(z);
        this.f25978i = this.f25978i.m18753g();
        m10588B();
        return this.f25978i;
    }

    /* renamed from: f */
    public final j78 m10581f() {
        return this.f25979j;
    }

    /* renamed from: g */
    public final j78 m10580g() {
        return this.f25977h;
    }

    /* renamed from: h */
    public final j78 m10579h() {
        return this.f25978i;
    }

    /* renamed from: i */
    public final m78 m10578i(long j, q88 q88Var) {
        j78 j78Var = this.f25979j;
        return j78Var == null ? m10563x(q88Var.f23759a, q88Var.f23760b, q88Var.f23761c, q88Var.f23776r) : m10564w(q88Var.f23759a, j78Var, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m78 m10577j(l64 l64Var, m78 m78Var) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        pr8 pr8Var = m78Var.f18573a;
        boolean m10584c = m10584c(pr8Var);
        boolean m10586a = m10586a(l64Var, pr8Var);
        boolean m10587C = m10587C(l64Var, pr8Var, m10584c);
        l64Var.mo13467n(m78Var.f18573a.f18805a, this.f25970a);
        if (pr8Var.m16079b() || (i = pr8Var.f18809e) == -1) {
            j = -9223372036854775807L;
        } else {
            this.f25970a.m24721h(i);
            j = 0;
        }
        if (pr8Var.m16079b()) {
            j2 = this.f25970a.m24722g(pr8Var.f18806b, pr8Var.f18807c);
        } else if (j != -9223372036854775807L) {
            j3 = 0;
            j4 = 0;
            if (pr8Var.m16079b()) {
                int i2 = pr8Var.f18809e;
                if (i2 != -1) {
                    this.f25970a.m24717l(i2);
                }
            } else {
                this.f25970a.m24717l(pr8Var.f18806b);
            }
            return new m78(pr8Var, m78Var.f18574b, m78Var.f18575c, j3, j4, false, m10584c, m10586a, m10587C);
        } else {
            j2 = this.f25970a.f6451d;
        }
        j3 = j;
        j4 = j2;
        if (pr8Var.m16079b()) {
        }
        return new m78(pr8Var, m78Var.f18574b, m78Var.f18575c, j3, j4, false, m10584c, m10586a, m10587C);
    }

    /* renamed from: k */
    public final pr8 m10576k(l64 l64Var, Object obj, long j) {
        long j2;
        int mo4511a;
        int i = l64Var.mo13467n(obj, this.f25970a).f6450c;
        Object obj2 = this.f25981l;
        if (obj2 == null || (mo4511a = l64Var.mo4511a(obj2)) == -1 || l64Var.mo1924d(mo4511a, this.f25970a, false).f6450c != i) {
            j78 j78Var = this.f25977h;
            while (true) {
                if (j78Var == null) {
                    j78Var = this.f25977h;
                    while (j78Var != null) {
                        int mo4511a2 = l64Var.mo4511a(j78Var.f14503b);
                        if (mo4511a2 == -1 || l64Var.mo1924d(mo4511a2, this.f25970a, false).f6450c != i) {
                            j78Var = j78Var.m18753g();
                        }
                    }
                    j2 = this.f25974e;
                    this.f25974e = 1 + j2;
                    if (this.f25977h == null) {
                        this.f25981l = obj;
                        this.f25982m = j2;
                    }
                } else if (j78Var.f14503b.equals(obj)) {
                    break;
                } else {
                    j78Var = j78Var.m18753g();
                }
            }
            j2 = j78Var.f14507f.f18573a.f18808d;
        } else {
            j2 = this.f25982m;
        }
        long j3 = j2;
        l64Var.mo13467n(obj, this.f25970a);
        l64Var.mo1923e(this.f25970a.f6450c, this.f25971b, 0L);
        int mo4511a3 = l64Var.mo4511a(obj);
        Object obj3 = obj;
        while (true) {
            i54 i54Var = this.f25971b;
            if (mo4511a3 < i54Var.f13279m) {
                return m10589A(l64Var, obj3, j, j3, i54Var, this.f25970a);
            }
            l64Var.mo1924d(mo4511a3, this.f25970a, true);
            this.f25970a.m24727b();
            d34 d34Var = this.f25970a;
            if (d34Var.m24725d(d34Var.f6451d) != -1) {
                obj3 = this.f25970a.f6449b;
                Objects.requireNonNull(obj3);
            }
            mo4511a3--;
        }
    }

    /* renamed from: l */
    public final void m10575l() {
        if (this.f25980k == 0) {
            return;
        }
        j78 j78Var = this.f25977h;
        uo4.m7876b(j78Var);
        this.f25981l = j78Var.f14503b;
        this.f25982m = j78Var.f14507f.f18573a.f18808d;
        while (j78Var != null) {
            j78Var.m18746n();
            j78Var = j78Var.m18753g();
        }
        this.f25977h = null;
        this.f25979j = null;
        this.f25978i = null;
        this.f25980k = 0;
        m10588B();
    }

    /* renamed from: m */
    public final /* synthetic */ void m10574m(v17 v17Var, pr8 pr8Var) {
        this.f25972c.mo9133i(v17Var.m7546h(), pr8Var);
    }

    /* renamed from: n */
    public final void m10573n(long j) {
        j78 j78Var = this.f25979j;
        if (j78Var != null) {
            j78Var.m18747m(j);
        }
    }

    /* renamed from: o */
    public final boolean m10572o(nr8 nr8Var) {
        j78 j78Var = this.f25979j;
        return j78Var != null && j78Var.f14502a == nr8Var;
    }

    /* renamed from: p */
    public final boolean m10571p(j78 j78Var) {
        boolean z = false;
        uo4.m7872f(j78Var != null);
        if (j78Var.equals(this.f25979j)) {
            return false;
        }
        this.f25979j = j78Var;
        while (j78Var.m18753g() != null) {
            j78Var = j78Var.m18753g();
            if (j78Var == this.f25978i) {
                this.f25978i = this.f25977h;
                z = true;
            }
            j78Var.m18746n();
            this.f25980k--;
        }
        this.f25979j.m18745o(null);
        m10588B();
        return z;
    }

    /* renamed from: q */
    public final boolean m10570q() {
        j78 j78Var = this.f25979j;
        if (j78Var != null) {
            return !j78Var.f14507f.f18581i && j78Var.m18742r() && this.f25979j.f14507f.f18577e != -9223372036854775807L && this.f25980k < 100;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m10569r(l64 l64Var, long j, long j2) {
        m78 m78Var;
        boolean z;
        j78 j78Var = null;
        for (j78 j78Var2 = this.f25977h; j78Var2 != null; j78Var2 = j78Var2.m18753g()) {
            m78 m78Var2 = j78Var2.f14507f;
            if (j78Var == null) {
                m78Var = m10577j(l64Var, m78Var2);
            } else {
                m78 m10564w = m10564w(l64Var, j78Var, j);
                if (m10564w == null) {
                    return !m10571p(j78Var);
                } else if (m78Var2.f18574b != m10564w.f18574b || !m78Var2.f18573a.equals(m10564w.f18573a)) {
                    return !m10571p(j78Var);
                } else {
                    m78Var = m10564w;
                }
            }
            j78Var2.f14507f = m78Var.m16185a(m78Var2.f18575c);
            long j3 = m78Var2.f18577e;
            long j4 = m78Var.f18577e;
            if (j3 != -9223372036854775807L && j3 != j4) {
                j78Var2.m18743q();
                long j5 = m78Var.f18577e;
                long m18755e = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + j78Var2.m18755e();
                if (j78Var2 == this.f25978i) {
                    boolean z2 = j78Var2.f14507f.f18578f;
                    if (j2 == Long.MIN_VALUE || j2 >= m18755e) {
                        z = true;
                        return m10571p(j78Var2) && !z;
                    }
                }
                z = false;
                if (m10571p(j78Var2)) {
                }
            }
            j78Var = j78Var2;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m10568s(l64 l64Var, int i) {
        this.f25975f = i;
        return m10585b(l64Var);
    }

    /* renamed from: t */
    public final boolean m10567t(l64 l64Var, boolean z) {
        this.f25976g = z;
        return m10585b(l64Var);
    }

    /* renamed from: u */
    public final j78 m10566u(l98[] l98VarArr, zv8 zv8Var, nw8 nw8Var, n88 n88Var, m78 m78Var, fw8 fw8Var) {
        j78 j78Var = this.f25979j;
        j78 j78Var2 = new j78(l98VarArr, j78Var == null ? 1000000000000L : (j78Var.m18755e() + j78Var.f14507f.f18577e) - m78Var.f18574b, zv8Var, nw8Var, n88Var, m78Var, fw8Var, null);
        j78 j78Var3 = this.f25979j;
        if (j78Var3 != null) {
            j78Var3.m18745o(j78Var2);
        } else {
            this.f25977h = j78Var2;
            this.f25978i = j78Var2;
        }
        this.f25981l = null;
        this.f25979j = j78Var2;
        this.f25980k++;
        m10588B();
        return j78Var2;
    }

    /* renamed from: v */
    public final long m10565v(l64 l64Var, Object obj, int i) {
        l64Var.mo13467n(obj, this.f25970a);
        this.f25970a.m24721h(i);
        this.f25970a.m24719j(i);
        return 0L;
    }

    /* renamed from: w */
    public final m78 m10564w(l64 l64Var, j78 j78Var, long j) {
        long j2;
        m78 m78Var = j78Var.f14507f;
        long m18755e = (j78Var.m18755e() + m78Var.f18577e) - j;
        if (!m78Var.f18579g) {
            pr8 pr8Var = m78Var.f18573a;
            l64Var.mo13467n(pr8Var.f18805a, this.f25970a);
            if (!pr8Var.m16079b()) {
                int m24724e = this.f25970a.m24724e(pr8Var.f18809e);
                this.f25970a.m24717l(pr8Var.f18809e);
                if (m24724e != this.f25970a.m24728a(pr8Var.f18809e)) {
                    return m10562y(l64Var, pr8Var.f18805a, pr8Var.f18809e, m24724e, m78Var.f18577e, pr8Var.f18808d);
                }
                m10565v(l64Var, pr8Var.f18805a, pr8Var.f18809e);
                return m10561z(l64Var, pr8Var.f18805a, 0L, m78Var.f18577e, pr8Var.f18808d);
            }
            int i = pr8Var.f18806b;
            if (this.f25970a.m24728a(i) == -1) {
                return null;
            }
            int m24723f = this.f25970a.m24723f(i, pr8Var.f18807c);
            if (m24723f < 0) {
                return m10562y(l64Var, pr8Var.f18805a, i, m24723f, m78Var.f18575c, pr8Var.f18808d);
            }
            long j3 = m78Var.f18575c;
            if (j3 == -9223372036854775807L) {
                i54 i54Var = this.f25971b;
                d34 d34Var = this.f25970a;
                Pair m17122m = l64Var.m17122m(i54Var, d34Var, d34Var.f6450c, -9223372036854775807L, Math.max(0L, m18755e));
                if (m17122m == null) {
                    return null;
                }
                j3 = ((Long) m17122m.second).longValue();
            }
            m10565v(l64Var, pr8Var.f18805a, pr8Var.f18806b);
            return m10561z(l64Var, pr8Var.f18805a, Math.max(0L, j3), m78Var.f18575c, pr8Var.f18808d);
        }
        long j4 = 0;
        int m17124i = l64Var.m17124i(l64Var.mo4511a(m78Var.f18573a.f18805a), this.f25970a, this.f25971b, this.f25975f, this.f25976g);
        if (m17124i == -1) {
            return null;
        }
        int i2 = l64Var.mo1924d(m17124i, this.f25970a, true).f6450c;
        Object obj = this.f25970a.f6449b;
        Objects.requireNonNull(obj);
        long j5 = m78Var.f18573a.f18808d;
        if (l64Var.mo1923e(i2, this.f25971b, 0L).f13279m == m17124i) {
            Pair m17122m2 = l64Var.m17122m(this.f25971b, this.f25970a, i2, -9223372036854775807L, Math.max(0L, m18755e));
            if (m17122m2 == null) {
                return null;
            }
            obj = m17122m2.first;
            long longValue = ((Long) m17122m2.second).longValue();
            j78 m18753g = j78Var.m18753g();
            if (m18753g == null || !m18753g.f14503b.equals(obj)) {
                j5 = this.f25974e;
                this.f25974e = 1 + j5;
            } else {
                j5 = m18753g.f14507f.f18573a.f18808d;
            }
            j2 = longValue;
            j4 = -9223372036854775807L;
        } else {
            j2 = 0;
        }
        pr8 m10589A = m10589A(l64Var, obj, j2, j5, this.f25971b, this.f25970a);
        if (j4 != -9223372036854775807L && m78Var.f18575c != -9223372036854775807L) {
            l64Var.mo13467n(m78Var.f18573a.f18805a, this.f25970a).m24727b();
        }
        return m10563x(l64Var, m10589A, j4, j2);
    }

    /* renamed from: x */
    public final m78 m10563x(l64 l64Var, pr8 pr8Var, long j, long j2) {
        l64Var.mo13467n(pr8Var.f18805a, this.f25970a);
        boolean m16079b = pr8Var.m16079b();
        Object obj = pr8Var.f18805a;
        return m16079b ? m10562y(l64Var, obj, pr8Var.f18806b, pr8Var.f18807c, j, pr8Var.f18808d) : m10561z(l64Var, obj, j2, j, pr8Var.f18808d);
    }

    /* renamed from: y */
    public final m78 m10562y(l64 l64Var, Object obj, int i, int i2, long j, long j2) {
        pr8 pr8Var = new pr8(obj, i, i2, j2);
        long m24722g = l64Var.mo13467n(pr8Var.f18805a, this.f25970a).m24722g(pr8Var.f18806b, pr8Var.f18807c);
        if (i2 == this.f25970a.m24724e(i)) {
            this.f25970a.m24720i();
        }
        this.f25970a.m24717l(pr8Var.f18806b);
        long j3 = 0;
        if (m24722g != -9223372036854775807L && m24722g <= 0) {
            j3 = Math.max(0L, (-1) + m24722g);
        }
        return new m78(pr8Var, j3, j, -9223372036854775807L, m24722g, false, false, false, false);
    }

    /* renamed from: z */
    public final m78 m10561z(l64 l64Var, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        l64Var.mo13467n(obj, this.f25970a);
        int m24726c = this.f25970a.m24726c(j7);
        d34 d34Var = this.f25970a;
        if (m24726c == -1) {
            d34Var.m24727b();
        } else {
            d34Var.m24717l(m24726c);
        }
        pr8 pr8Var = new pr8(obj, j3, m24726c);
        boolean m10584c = m10584c(pr8Var);
        boolean m10586a = m10586a(l64Var, pr8Var);
        boolean m10587C = m10587C(l64Var, pr8Var, m10584c);
        if (m24726c != -1) {
            this.f25970a.m24717l(m24726c);
        }
        if (m24726c != -1) {
            this.f25970a.m24721h(m24726c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.f25970a.f6451d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new m78(pr8Var, j7, j2, j6, j5, false, m10584c, m10586a, m10587C);
    }
}
