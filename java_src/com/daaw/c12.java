package com.daaw;

import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class c12 implements Runnable {
    public final /* synthetic */ f12 p;

    public c12(f12 f12Var) {
        this.p = f12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e12 e12Var;
        e12Var = this.p.v;
        e12Var.b(new ConnectionResult(4));
    }
}
