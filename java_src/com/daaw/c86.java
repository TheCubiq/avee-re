package com.daaw;
/* loaded from: classes2.dex */
public abstract class c86 extends de5 {

    /* renamed from: b */
    public boolean f5622b;

    public c86(dr6 dr6Var) {
        super(dr6Var);
        this.f25143a.m24037g();
    }

    /* renamed from: g */
    public final void m25515g() {
        if (!m25512l()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void m25514h() {
        if (this.f5622b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo5306m()) {
            return;
        }
        this.f25143a.m24039e();
        this.f5622b = true;
    }

    /* renamed from: j */
    public final void m25513j() {
        if (this.f5622b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo5307k();
        this.f25143a.m24039e();
        this.f5622b = true;
    }

    /* renamed from: k */
    public void mo5307k() {
    }

    /* renamed from: l */
    public final boolean m25512l() {
        return this.f5622b;
    }

    /* renamed from: m */
    public abstract boolean mo5306m();
}
