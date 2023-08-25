package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class mh8 implements Runnable {
    public final /* synthetic */ ox3 p;
    public final /* synthetic */ AppMeasurementDynamiteService q;

    public mh8(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var) {
        this.q = appMeasurementDynamiteService;
        this.p = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.p.N().D(this.p, this.q.p.m());
    }
}
