package com.daaw;

import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class k47 implements Runnable {
    public final /* synthetic */ zzaw p;
    public final /* synthetic */ String q;
    public final /* synthetic */ ob7 r;

    public k47(ob7 ob7Var, zzaw zzawVar, String str) {
        this.r = ob7Var;
        this.p = zzawVar;
        this.q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.r.p;
        yb8Var.c();
        yb8Var2 = this.r.p;
        yb8Var2.j(this.p, this.q);
    }
}
