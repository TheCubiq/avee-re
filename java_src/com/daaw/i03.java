package com.daaw;

import android.view.Surface;
/* loaded from: classes.dex */
public final class i03 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ Surface f13136p;

    /* renamed from: q */
    public final /* synthetic */ k03 f13137q;

    public i03(k03 k03Var, Surface surface) {
        this.f13137q = k03Var;
        this.f13136p = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.f13137q.f15576b;
        l03Var.mo17155C(this.f13136p);
    }
}
