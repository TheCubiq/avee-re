package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public final class tq2 implements Runnable {
    public final /* synthetic */ zzatd p;
    public final /* synthetic */ xq2 q;

    public tq2(xq2 xq2Var, zzatd zzatdVar) {
        this.q = xq2Var;
        this.p = zzatdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr2 dr2Var;
        dr2Var = this.q.b;
        dr2Var.d(this.p);
    }
}
