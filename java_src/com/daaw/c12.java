package com.daaw;

import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class c12 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ f12 f5370p;

    public c12(f12 f12Var) {
        this.f5370p = f12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e12 e12Var;
        e12Var = this.f5370p.f9002v;
        e12Var.mo16312b(new ConnectionResult(4));
    }
}
