package com.daaw;
/* loaded from: classes.dex */
public class hl1 implements m41, l41 {

    /* renamed from: a */
    public l41 f12636a;

    /* renamed from: b */
    public l41 f12637b;

    /* renamed from: c */
    public m41 f12638c;

    public hl1(m41 m41Var) {
        this.f12638c = m41Var;
    }

    @Override // com.daaw.m41
    /* renamed from: a */
    public boolean mo16227a() {
        return m20641l() || mo17161e();
    }

    @Override // com.daaw.l41
    /* renamed from: b */
    public void mo17163b() {
        this.f12636a.mo17163b();
        this.f12637b.mo17163b();
    }

    @Override // com.daaw.l41
    /* renamed from: c */
    public void mo17162c() {
        this.f12636a.mo17162c();
        this.f12637b.mo17162c();
    }

    @Override // com.daaw.l41
    public void clear() {
        this.f12637b.clear();
        this.f12636a.clear();
    }

    @Override // com.daaw.m41
    /* renamed from: d */
    public boolean mo16226d(l41 l41Var) {
        return m20643j() && l41Var.equals(this.f12636a) && !mo16227a();
    }

    @Override // com.daaw.l41
    /* renamed from: e */
    public boolean mo17161e() {
        return this.f12636a.mo17161e() || this.f12637b.mo17161e();
    }

    @Override // com.daaw.m41
    /* renamed from: f */
    public void mo16225f(l41 l41Var) {
        if (l41Var.equals(this.f12637b)) {
            return;
        }
        m41 m41Var = this.f12638c;
        if (m41Var != null) {
            m41Var.mo16225f(this);
        }
        if (this.f12637b.mo17159i()) {
            return;
        }
        this.f12637b.clear();
    }

    @Override // com.daaw.l41
    /* renamed from: g */
    public void mo17160g() {
        if (!this.f12637b.isRunning()) {
            this.f12637b.mo17160g();
        }
        if (this.f12636a.isRunning()) {
            return;
        }
        this.f12636a.mo17160g();
    }

    @Override // com.daaw.m41
    /* renamed from: h */
    public boolean mo16224h(l41 l41Var) {
        return m20642k() && (l41Var.equals(this.f12636a) || !this.f12636a.mo17161e());
    }

    @Override // com.daaw.l41
    /* renamed from: i */
    public boolean mo17159i() {
        return this.f12636a.mo17159i() || this.f12637b.mo17159i();
    }

    @Override // com.daaw.l41
    public boolean isCancelled() {
        return this.f12636a.isCancelled();
    }

    @Override // com.daaw.l41
    public boolean isRunning() {
        return this.f12636a.isRunning();
    }

    /* renamed from: j */
    public final boolean m20643j() {
        m41 m41Var = this.f12638c;
        return m41Var == null || m41Var.mo16226d(this);
    }

    /* renamed from: k */
    public final boolean m20642k() {
        m41 m41Var = this.f12638c;
        return m41Var == null || m41Var.mo16224h(this);
    }

    /* renamed from: l */
    public final boolean m20641l() {
        m41 m41Var = this.f12638c;
        return m41Var != null && m41Var.mo16227a();
    }

    /* renamed from: m */
    public void m20640m(l41 l41Var, l41 l41Var2) {
        this.f12636a = l41Var;
        this.f12637b = l41Var2;
    }
}
