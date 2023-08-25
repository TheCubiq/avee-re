package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class zh5 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Activity f35103t;

    /* renamed from: u */
    public final /* synthetic */ dj5 f35104u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh5(dj5 dj5Var, Activity activity) {
        super(dj5Var.f7199p, true);
        this.f35104u = dj5Var;
        this.f35103t = activity;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        ju3Var = this.f35104u.f7199p.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).onActivityDestroyed(nt0.m14830g3(this.f35103t), this.f17104q);
    }
}
