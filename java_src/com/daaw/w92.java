package com.daaw;
/* loaded from: classes.dex */
public final class w92 {

    /* renamed from: a */
    public final m42 f31060a;

    /* renamed from: d */
    public ka2 f31063d;

    /* renamed from: e */
    public s92 f31064e;

    /* renamed from: f */
    public int f31065f;

    /* renamed from: g */
    public int f31066g;

    /* renamed from: h */
    public int f31067h;

    /* renamed from: i */
    public int f31068i;

    /* renamed from: l */
    public boolean f31071l;

    /* renamed from: b */
    public final ja2 f31061b = new ja2();

    /* renamed from: c */
    public final ik5 f31062c = new ik5();

    /* renamed from: j */
    public final ik5 f31069j = new ik5(1);

    /* renamed from: k */
    public final ik5 f31070k = new ik5();

    public w92(m42 m42Var, ka2 ka2Var, s92 s92Var) {
        this.f31060a = m42Var;
        this.f31063d = ka2Var;
        this.f31064e = s92Var;
        m6303h(ka2Var, s92Var);
    }

    /* renamed from: a */
    public final int m6310a() {
        int i = !this.f31071l ? this.f31063d.f15850g[this.f31065f] : this.f31061b.f14599j[this.f31065f] ? 1 : 0;
        return m6305f() != null ? i | 1073741824 : i;
    }

    /* renamed from: b */
    public final int m6309b() {
        return !this.f31071l ? this.f31063d.f15847d[this.f31065f] : this.f31061b.f14597h[this.f31065f];
    }

    /* renamed from: c */
    public final int m6308c(int i, int i2) {
        ik5 ik5Var;
        ia2 m6305f = m6305f();
        if (m6305f == null) {
            return 0;
        }
        int i3 = m6305f.f13395d;
        if (i3 != 0) {
            ik5Var = this.f31061b.f14603n;
        } else {
            byte[] bArr = (byte[]) it5.m19391h(m6305f.f13396e);
            ik5 ik5Var2 = this.f31070k;
            int length = bArr.length;
            ik5Var2.m19718d(bArr, length);
            ik5Var = this.f31070k;
            i3 = length;
        }
        boolean m18678b = this.f31061b.m18678b(this.f31065f);
        boolean z = m18678b || i2 != 0;
        ik5 ik5Var3 = this.f31069j;
        ik5Var3.m19714h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        ik5Var3.m19716f(0);
        this.f31060a.mo16223a(this.f31069j, 1, 1);
        this.f31060a.mo16223a(ik5Var, i3, 1);
        if (z) {
            if (!m18678b) {
                this.f31062c.m19719c(8);
                ik5 ik5Var4 = this.f31062c;
                byte[] m19714h = ik5Var4.m19714h();
                m19714h[0] = 0;
                m19714h[1] = 1;
                m19714h[2] = 0;
                m19714h[3] = (byte) i2;
                m19714h[4] = (byte) ((i >> 24) & 255);
                m19714h[5] = (byte) ((i >> 16) & 255);
                m19714h[6] = (byte) ((i >> 8) & 255);
                m19714h[7] = (byte) (i & 255);
                this.f31060a.mo16223a(ik5Var4, 8, 1);
                return i3 + 9;
            }
            ik5 ik5Var5 = this.f31061b.f14603n;
            int m19699w = ik5Var5.m19699w();
            ik5Var5.m19715g(-2);
            int i4 = (m19699w * 6) + 2;
            if (i2 != 0) {
                this.f31062c.m19719c(i4);
                byte[] m19714h2 = this.f31062c.m19714h();
                ik5Var5.m19720b(m19714h2, 0, i4);
                int i5 = (((m19714h2[2] & 255) << 8) | (m19714h2[3] & 255)) + i2;
                m19714h2[2] = (byte) ((i5 >> 8) & 255);
                m19714h2[3] = (byte) (i5 & 255);
                ik5Var5 = this.f31062c;
            }
            this.f31060a.mo16223a(ik5Var5, i4, 1);
            return i3 + 1 + i4;
        }
        return i3 + 1;
    }

    /* renamed from: d */
    public final long m6307d() {
        return !this.f31071l ? this.f31063d.f15846c[this.f31065f] : this.f31061b.f14595f[this.f31067h];
    }

    /* renamed from: e */
    public final long m6306e() {
        if (this.f31071l) {
            ja2 ja2Var = this.f31061b;
            return ja2Var.f14598i[this.f31065f];
        }
        return this.f31063d.f15849f[this.f31065f];
    }

    /* renamed from: f */
    public final ia2 m6305f() {
        if (this.f31071l) {
            ja2 ja2Var = this.f31061b;
            s92 s92Var = ja2Var.f14590a;
            int i = it5.f13991a;
            int i2 = s92Var.f26019a;
            ia2 ia2Var = ja2Var.f14602m;
            if (ia2Var == null) {
                ia2Var = this.f31063d.f15844a.m20888a(i2);
            }
            if (ia2Var == null || !ia2Var.f13392a) {
                return null;
            }
            return ia2Var;
        }
        return null;
    }

    /* renamed from: h */
    public final void m6303h(ka2 ka2Var, s92 s92Var) {
        this.f31063d = ka2Var;
        this.f31064e = s92Var;
        this.f31060a.mo16218f(ka2Var.f15844a.f12292f);
        m6302i();
    }

    /* renamed from: i */
    public final void m6302i() {
        ja2 ja2Var = this.f31061b;
        ja2Var.f14593d = 0;
        ja2Var.f14605p = 0L;
        ja2Var.f14606q = false;
        ja2Var.f14600k = false;
        ja2Var.f14604o = false;
        ja2Var.f14602m = null;
        this.f31065f = 0;
        this.f31067h = 0;
        this.f31066g = 0;
        this.f31068i = 0;
        this.f31071l = false;
    }

    /* renamed from: k */
    public final boolean m6300k() {
        this.f31065f++;
        if (this.f31071l) {
            int i = this.f31066g + 1;
            this.f31066g = i;
            int[] iArr = this.f31061b.f14596g;
            int i2 = this.f31067h;
            if (i == iArr[i2]) {
                this.f31067h = i2 + 1;
                this.f31066g = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
