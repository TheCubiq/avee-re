package com.daaw;
/* loaded from: classes.dex */
public final class qc2 implements gd2 {

    /* renamed from: a */
    public f92 f23855a;

    /* renamed from: b */
    public cr5 f23856b;

    /* renamed from: c */
    public m42 f23857c;

    public qc2(String str) {
        b72 b72Var = new b72();
        b72Var.m26372s(str);
        this.f23855a = b72Var.m26366y();
    }

    @Override // com.daaw.gd2
    /* renamed from: a */
    public final void mo12624a(ik5 ik5Var) {
        uo4.m7876b(this.f23856b);
        int i = it5.f13991a;
        long m25054d = this.f23856b.m25054d();
        long m25053e = this.f23856b.m25053e();
        if (m25054d == -9223372036854775807L || m25053e == -9223372036854775807L) {
            return;
        }
        f92 f92Var = this.f23855a;
        if (m25053e != f92Var.f9279p) {
            b72 m22830b = f92Var.m22830b();
            m22830b.m26368w(m25053e);
            f92 m26366y = m22830b.m26366y();
            this.f23855a = m26366y;
            this.f23857c.mo16218f(m26366y);
        }
        int m19713i = ik5Var.m19713i();
        this.f23857c.mo16221c(ik5Var, m19713i);
        this.f23857c.mo16222b(m25054d, 1, m19713i, 0, null);
    }

    @Override // com.daaw.gd2
    /* renamed from: b */
    public final void mo12623b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
        this.f23856b = cr5Var;
        td2Var.m9282c();
        m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 5);
        this.f23857c = mo3292n;
        mo3292n.mo16218f(this.f23855a);
    }
}
