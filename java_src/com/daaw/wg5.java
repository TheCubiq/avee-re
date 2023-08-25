package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class wg5 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Activity f31232t;

    /* renamed from: u */
    public final /* synthetic */ oq3 f31233u;

    /* renamed from: v */
    public final /* synthetic */ dj5 f31234v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg5(dj5 dj5Var, Activity activity, oq3 oq3Var) {
        super(dj5Var.f7199p, true);
        this.f31234v = dj5Var;
        this.f31232t = activity;
        this.f31233u = oq3Var;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        ju3Var = this.f31234v.f7199p.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).onActivitySaveInstanceState(nt0.m14830g3(this.f31232t), this.f31233u, this.f17104q);
    }
}
