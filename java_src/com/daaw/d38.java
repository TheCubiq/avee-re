package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class d38 implements Runnable {
    public final /* synthetic */ ox3 p;
    public final /* synthetic */ AppMeasurementDynamiteService q;

    public d38(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var) {
        this.q = appMeasurementDynamiteService;
        this.p = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.p.L().R(this.p);
    }
}
