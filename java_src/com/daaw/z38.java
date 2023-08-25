package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class z38 implements Runnable {
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ t38 q;
    public final /* synthetic */ t38 r;
    public final /* synthetic */ long s;
    public final /* synthetic */ r48 t;

    public z38(r48 r48Var, Bundle bundle, t38 t38Var, t38 t38Var2, long j) {
        this.t = r48Var;
        this.p = bundle;
        this.q = t38Var;
        this.r = t38Var2;
        this.s = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r48.w(this.t, this.p, this.q, this.r, this.s);
    }
}
