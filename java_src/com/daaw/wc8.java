package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class wc8 implements Runnable {
    public final /* synthetic */ ek8 p;
    public final /* synthetic */ AppMeasurementDynamiteService q;

    public wc8(AppMeasurementDynamiteService appMeasurementDynamiteService, ek8 ek8Var) {
        this.q = appMeasurementDynamiteService;
        this.p = ek8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.p.I().H(this.p);
    }
}
