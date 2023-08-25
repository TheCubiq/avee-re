package com.daaw;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes2.dex */
public final class o78 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ u78 f21116p;

    public o78(u78 u78Var) {
        this.f21116p = u78Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x78 x78Var = this.f21116p.f28773c;
        Context mo3905d = x78Var.f25143a.mo3905d();
        this.f21116p.f28773c.f25143a.mo3911a();
        x78.m5471M(x78Var, new ComponentName(mo3905d, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
