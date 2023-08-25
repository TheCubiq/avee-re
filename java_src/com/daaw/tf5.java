package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class tf5 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Activity f27602t;

    /* renamed from: u */
    public final /* synthetic */ dj5 f27603u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf5(dj5 dj5Var, Activity activity) {
        super(dj5Var.f7199p, true);
        this.f27603u = dj5Var;
        this.f27602t = activity;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        ju3Var = this.f27603u.f7199p.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).onActivityStopped(nt0.m14830g3(this.f27602t), this.f17104q);
    }
}
