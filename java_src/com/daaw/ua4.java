package com.daaw;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class ua4 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Activity f28853t;

    /* renamed from: u */
    public final /* synthetic */ String f28854u;

    /* renamed from: v */
    public final /* synthetic */ String f28855v;

    /* renamed from: w */
    public final /* synthetic */ gk5 f28856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua4(gk5 gk5Var, Activity activity, String str, String str2) {
        super(gk5Var, true);
        this.f28856w = gk5Var;
        this.f28853t = activity;
        this.f28854u = str;
        this.f28855v = str2;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        ju3 ju3Var;
        ju3Var = this.f28856w.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).setCurrentScreen(nt0.m14830g3(this.f28853t), this.f28854u, this.f28855v, this.f17103p);
    }
}
