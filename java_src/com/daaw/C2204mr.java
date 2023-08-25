package com.daaw;
/* renamed from: com.daaw.mr */
/* loaded from: classes.dex */
public final class C2204mr implements ao0 {

    /* renamed from: p */
    public final gf1 f19086p;

    /* renamed from: q */
    public final InterfaceC2205a f19087q;

    /* renamed from: r */
    public a41 f19088r;

    /* renamed from: s */
    public ao0 f19089s;

    /* renamed from: com.daaw.mr$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2205a {
        /* renamed from: c */
        void mo7615c(zw0 zw0Var);
    }

    public C2204mr(InterfaceC2205a interfaceC2205a, InterfaceC3836zf interfaceC3836zf) {
        this.f19087q = interfaceC2205a;
        this.f19086p = new gf1(interfaceC3836zf);
    }

    /* renamed from: a */
    public final void m15834a() {
        this.f19086p.m21729a(this.f19089s.mo15824o());
        zw0 mo15827h = this.f19089s.mo15827h();
        if (mo15827h.equals(this.f19086p.mo15827h())) {
            return;
        }
        this.f19086p.mo15829f(mo15827h);
        this.f19087q.mo7615c(mo15827h);
    }

    /* renamed from: b */
    public final boolean m15833b() {
        a41 a41Var = this.f19088r;
        return (a41Var == null || a41Var.mo3459c() || (!this.f19088r.mo3458d() && this.f19088r.mo5360j())) ? false : true;
    }

    /* renamed from: c */
    public void m15832c(a41 a41Var) {
        if (a41Var == this.f19088r) {
            this.f19089s = null;
            this.f19088r = null;
        }
    }

    /* renamed from: d */
    public void m15831d(a41 a41Var) {
        ao0 ao0Var;
        ao0 mo5350v = a41Var.mo5350v();
        if (mo5350v == null || mo5350v == (ao0Var = this.f19089s)) {
            return;
        }
        if (ao0Var != null) {
            throw C2802qz.m11925c(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f19089s = mo5350v;
        this.f19088r = a41Var;
        mo5350v.mo15829f(this.f19086p.mo15827h());
        m15834a();
    }

    /* renamed from: e */
    public void m15830e(long j) {
        this.f19086p.m21729a(j);
    }

    @Override // com.daaw.ao0
    /* renamed from: f */
    public zw0 mo15829f(zw0 zw0Var) {
        ao0 ao0Var = this.f19089s;
        if (ao0Var != null) {
            zw0Var = ao0Var.mo15829f(zw0Var);
        }
        this.f19086p.mo15829f(zw0Var);
        this.f19087q.mo7615c(zw0Var);
        return zw0Var;
    }

    /* renamed from: g */
    public void m15828g() {
        this.f19086p.m21728b();
    }

    @Override // com.daaw.ao0
    /* renamed from: h */
    public zw0 mo15827h() {
        ao0 ao0Var = this.f19089s;
        return ao0Var != null ? ao0Var.mo15827h() : this.f19086p.mo15827h();
    }

    /* renamed from: i */
    public void m15826i() {
        this.f19086p.m21727c();
    }

    /* renamed from: j */
    public long m15825j() {
        if (m15833b()) {
            m15834a();
            return this.f19089s.mo15824o();
        }
        return this.f19086p.mo15824o();
    }

    @Override // com.daaw.ao0
    /* renamed from: o */
    public long mo15824o() {
        return m15833b() ? this.f19089s.mo15824o() : this.f19086p.mo15824o();
    }
}
