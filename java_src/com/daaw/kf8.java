package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class kf8 implements Runnable {
    public final /* synthetic */ ox3 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ AppMeasurementDynamiteService s;

    public kf8(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var, String str, String str2) {
        this.s = appMeasurementDynamiteService;
        this.p = ox3Var;
        this.q = str;
        this.r = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.p.L().T(this.p, this.q, this.r);
    }
}
