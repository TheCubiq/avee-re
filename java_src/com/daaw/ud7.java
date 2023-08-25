package com.daaw;
/* loaded from: classes2.dex */
public abstract class ud7 extends rc7 {

    /* renamed from: b */
    public boolean f28990b;

    public ud7(dr6 dr6Var) {
        super(dr6Var);
        this.f25143a.m24037g();
    }

    /* renamed from: g */
    public void mo8311g() {
    }

    /* renamed from: h */
    public abstract boolean mo6990h();

    /* renamed from: j */
    public final void m8310j() {
        if (!m8307m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: k */
    public final void m8309k() {
        if (this.f28990b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo6990h()) {
            return;
        }
        this.f25143a.m24039e();
        this.f28990b = true;
    }

    /* renamed from: l */
    public final void m8308l() {
        if (this.f28990b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo8311g();
        this.f25143a.m24039e();
        this.f28990b = true;
    }

    /* renamed from: m */
    public final boolean m8307m() {
        return this.f28990b;
    }
}
