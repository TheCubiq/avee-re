package com.daaw;
/* loaded from: classes.dex */
public final class z52 extends y52 {

    /* renamed from: b */
    public final ik5 f34467b;

    /* renamed from: c */
    public final ik5 f34468c;

    /* renamed from: d */
    public int f34469d;

    /* renamed from: e */
    public boolean f34470e;

    /* renamed from: f */
    public boolean f34471f;

    /* renamed from: g */
    public int f34472g;

    public z52(m42 m42Var) {
        super(m42Var);
        this.f34467b = new ik5(c42.f5462a);
        this.f34468c = new ik5(4);
    }

    @Override // com.daaw.y52
    /* renamed from: a */
    public final boolean mo2810a(ik5 ik5Var) {
        int m19703s = ik5Var.m19703s();
        int i = m19703s >> 4;
        int i2 = m19703s & 15;
        if (i2 == 7) {
            this.f34472g = i;
            return i != 5;
        }
        throw new x52("Video format not supported: " + i2);
    }

    @Override // com.daaw.y52
    /* renamed from: b */
    public final boolean mo2809b(ik5 ik5Var, long j) {
        int m19703s = ik5Var.m19703s();
        long m19708n = j + (ik5Var.m19708n() * 1000);
        if (m19703s == 0) {
            if (!this.f34470e) {
                ik5 ik5Var2 = new ik5(new byte[ik5Var.m19713i()]);
                ik5Var.m19720b(ik5Var2.m19714h(), 0, ik5Var.m19713i());
                gz8 m21127a = gz8.m21127a(ik5Var2);
                this.f34469d = m21127a.f11900b;
                b72 b72Var = new b72();
                b72Var.m26372s("video/avc");
                b72Var.m26387f0(m21127a.f11904f);
                b72Var.m26367x(m21127a.f11901c);
                b72Var.m26388f(m21127a.f11902d);
                b72Var.m26375p(m21127a.f11903e);
                b72Var.m26382i(m21127a.f11899a);
                this.f33371a.mo16218f(b72Var.m26366y());
                this.f34470e = true;
                return false;
            }
        } else if (m19703s == 1 && this.f34470e) {
            int i = this.f34472g == 1 ? 1 : 0;
            if (this.f34471f || i != 0) {
                byte[] m19714h = this.f34468c.m19714h();
                m19714h[0] = 0;
                m19714h[1] = 0;
                m19714h[2] = 0;
                int i2 = 4 - this.f34469d;
                int i3 = 0;
                while (ik5Var.m19713i() > 0) {
                    ik5Var.m19720b(this.f34468c.m19714h(), i2, this.f34469d);
                    this.f34468c.m19716f(0);
                    int m19700v = this.f34468c.m19700v();
                    this.f34467b.m19716f(0);
                    this.f33371a.mo16221c(this.f34467b, 4);
                    this.f33371a.mo16221c(ik5Var, m19700v);
                    i3 = i3 + 4 + m19700v;
                }
                this.f33371a.mo16222b(m19708n, i, i3, 0, null);
                this.f34471f = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
