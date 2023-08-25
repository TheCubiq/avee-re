package com.daaw;
/* loaded from: classes2.dex */
public class t81 extends AbstractC0898bz {

    /* renamed from: r */
    public final int f27114r;

    /* renamed from: s */
    public final int f27115s;

    /* renamed from: t */
    public final long f27116t;

    /* renamed from: u */
    public final String f27117u;

    /* renamed from: v */
    public ExecutorC3090tl f27118v = m9456W();

    public t81(int i, int i2, long j, String str) {
        this.f27114r = i;
        this.f27115s = i2;
        this.f27116t = j;
        this.f27117u = str;
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: T */
    public void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        ExecutorC3090tl.m9044D(this.f27118v, runnable, null, false, 6, null);
    }

    /* renamed from: W */
    public final ExecutorC3090tl m9456W() {
        return new ExecutorC3090tl(this.f27114r, this.f27115s, this.f27116t, this.f27117u);
    }

    /* renamed from: X */
    public final void m9455X(Runnable runnable, uj1 uj1Var, boolean z) {
        this.f27118v.m9027w(runnable, uj1Var, z);
    }
}
