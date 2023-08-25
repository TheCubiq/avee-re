package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public final class f03 implements Runnable {
    public final /* synthetic */ zzatd p;
    public final /* synthetic */ k03 q;

    public f03(k03 k03Var, zzatd zzatdVar) {
        this.q = k03Var;
        this.p = zzatdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.q.b;
        l03Var.t(this.p);
    }
}
