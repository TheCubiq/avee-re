package com.daaw;

import android.view.Surface;
/* loaded from: classes.dex */
public final class i03 implements Runnable {
    public final /* synthetic */ Surface p;
    public final /* synthetic */ k03 q;

    public i03(k03 k03Var, Surface surface) {
        this.q = k03Var;
        this.p = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.q.b;
        l03Var.C(this.p);
    }
}
