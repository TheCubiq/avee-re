package com.daaw;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes2.dex */
public final class o78 implements Runnable {
    public final /* synthetic */ u78 p;

    public o78(u78 u78Var) {
        this.p = u78Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x78 x78Var = this.p.c;
        Context d = x78Var.a.d();
        this.p.c.a.a();
        x78.M(x78Var, new ComponentName(d, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
