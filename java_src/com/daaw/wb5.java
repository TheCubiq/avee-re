package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class wb5 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Activity f31148t;

    /* renamed from: u */
    public final /* synthetic */ dj5 f31149u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb5(dj5 dj5Var, Activity activity) {
        super(dj5Var.f7199p, true);
        this.f31149u = dj5Var;
        this.f31148t = activity;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        ju3Var = this.f31149u.f7199p.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).onActivityStarted(nt0.m14830g3(this.f31148t), this.f17104q);
    }
}
