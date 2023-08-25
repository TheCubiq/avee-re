package com.daaw;

import com.daaw.da1;
/* loaded from: classes.dex */
public final class t20 implements InterfaceC3919zz {

    /* renamed from: p */
    public static final e00 f26906p = new C3009a();

    /* renamed from: q */
    public static final int f26907q = sq1.m9994v("FLV");

    /* renamed from: f */
    public d00 f26913f;

    /* renamed from: i */
    public int f26916i;

    /* renamed from: j */
    public int f26917j;

    /* renamed from: k */
    public int f26918k;

    /* renamed from: l */
    public long f26919l;

    /* renamed from: m */
    public boolean f26920m;

    /* renamed from: n */
    public C2519p7 f26921n;

    /* renamed from: o */
    public ss1 f26922o;

    /* renamed from: a */
    public final rv0 f26908a = new rv0(4);

    /* renamed from: b */
    public final rv0 f26909b = new rv0(9);

    /* renamed from: c */
    public final rv0 f26910c = new rv0(11);

    /* renamed from: d */
    public final rv0 f26911d = new rv0();

    /* renamed from: e */
    public final j91 f26912e = new j91();

    /* renamed from: g */
    public int f26914g = 1;

    /* renamed from: h */
    public long f26915h = -9223372036854775807L;

    /* renamed from: com.daaw.t20$a */
    /* loaded from: classes.dex */
    public static class C3009a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new t20()};
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* renamed from: b */
    public final void m9648b() {
        if (!this.f26920m) {
            this.f26913f.mo11475d(new da1.C1069b(-9223372036854775807L));
            this.f26920m = true;
        }
        if (this.f26915h == -9223372036854775807L) {
            this.f26915h = this.f26912e.m18724d() == -9223372036854775807L ? -this.f26919l : 0L;
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        a00Var.mo5856k(this.f26908a.f25637a, 0, 3);
        this.f26908a.m10921J(0);
        if (this.f26908a.m10930A() != f26907q) {
            return false;
        }
        a00Var.mo5856k(this.f26908a.f25637a, 0, 2);
        this.f26908a.m10921J(0);
        if ((this.f26908a.m10927D() & 250) != 0) {
            return false;
        }
        a00Var.mo5856k(this.f26908a.f25637a, 0, 4);
        this.f26908a.m10921J(0);
        int m10911i = this.f26908a.m10911i();
        a00Var.mo5858i();
        a00Var.mo5860g(m10911i);
        a00Var.mo5856k(this.f26908a.f25637a, 0, 4);
        this.f26908a.m10921J(0);
        return this.f26908a.m10911i() == 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.f26914g;
            if (i != 1) {
                if (i == 2) {
                    m9643k(a00Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (m9645h(a00Var)) {
                        return 0;
                    }
                } else if (!m9644j(a00Var)) {
                    return -1;
                }
            } else if (!m9646g(a00Var)) {
                return -1;
            }
        }
    }

    /* renamed from: e */
    public final rv0 m9647e(a00 a00Var) {
        if (this.f26918k > this.f26911d.m10918b()) {
            rv0 rv0Var = this.f26911d;
            rv0Var.m10923H(new byte[Math.max(rv0Var.m10918b() * 2, this.f26918k)], 0);
        } else {
            this.f26911d.m10921J(0);
        }
        this.f26911d.m10922I(this.f26918k);
        a00Var.mo5861f(this.f26911d.f25637a, 0, this.f26918k);
        return this.f26911d;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f26914g = 1;
        this.f26915h = -9223372036854775807L;
        this.f26916i = 0;
    }

    /* renamed from: g */
    public final boolean m9646g(a00 a00Var) {
        if (a00Var.mo5864c(this.f26909b.f25637a, 0, 9, true)) {
            this.f26909b.m10921J(0);
            this.f26909b.m10920K(4);
            int m10896x = this.f26909b.m10896x();
            boolean z = (m10896x & 4) != 0;
            boolean z2 = (m10896x & 1) != 0;
            if (z && this.f26921n == null) {
                this.f26921n = new C2519p7(this.f26913f.mo11478a(8, 1));
            }
            if (z2 && this.f26922o == null) {
                this.f26922o = new ss1(this.f26913f.mo11478a(9, 2));
            }
            this.f26913f.mo11470n();
            this.f26916i = (this.f26909b.m10911i() - 9) + 4;
            this.f26914g = 2;
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m9645h(a00 a00Var) {
        nj1 nj1Var;
        int i = this.f26917j;
        boolean z = true;
        if (i == 8 && this.f26921n != null) {
            m9648b();
            nj1Var = this.f26921n;
        } else if (i != 9 || this.f26922o == null) {
            if (i != 18 || this.f26920m) {
                a00Var.mo5857j(this.f26918k);
                z = false;
            } else {
                this.f26912e.m15150a(m9647e(a00Var), this.f26919l);
                long m18724d = this.f26912e.m18724d();
                if (m18724d != -9223372036854775807L) {
                    this.f26913f.mo11475d(new da1.C1069b(m18724d));
                    this.f26920m = true;
                }
            }
            this.f26916i = 4;
            this.f26914g = 2;
            return z;
        } else {
            m9648b();
            nj1Var = this.f26922o;
        }
        nj1Var.m15150a(m9647e(a00Var), this.f26915h + this.f26919l);
        this.f26916i = 4;
        this.f26914g = 2;
        return z;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f26913f = d00Var;
    }

    /* renamed from: j */
    public final boolean m9644j(a00 a00Var) {
        if (a00Var.mo5864c(this.f26910c.f25637a, 0, 11, true)) {
            this.f26910c.m10921J(0);
            this.f26917j = this.f26910c.m10896x();
            this.f26918k = this.f26910c.m10930A();
            this.f26919l = this.f26910c.m10930A();
            this.f26919l = ((this.f26910c.m10896x() << 24) | this.f26919l) * 1000;
            this.f26910c.m10920K(3);
            this.f26914g = 4;
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m9643k(a00 a00Var) {
        a00Var.mo5857j(this.f26916i);
        this.f26916i = 0;
        this.f26914g = 3;
    }
}
