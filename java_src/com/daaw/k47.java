package com.daaw;

import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class k47 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzaw f15679p;

    /* renamed from: q */
    public final /* synthetic */ String f15680q;

    /* renamed from: r */
    public final /* synthetic */ ob7 f15681r;

    public k47(ob7 ob7Var, zzaw zzawVar, String str) {
        this.f15681r = ob7Var;
        this.f15679p = zzawVar;
        this.f15680q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f15681r.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f15681r.f21251p;
        yb8Var2.m3893j(this.f15679p, this.f15680q);
    }
}
