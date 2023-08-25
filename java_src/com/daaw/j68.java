package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class j68 implements Runnable {
    public final /* synthetic */ ox3 p;
    public final /* synthetic */ zzaw q;
    public final /* synthetic */ String r;
    public final /* synthetic */ AppMeasurementDynamiteService s;

    public j68(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var, zzaw zzawVar, String str) {
        this.s = appMeasurementDynamiteService;
        this.p = ox3Var;
        this.q = zzawVar;
        this.r = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.p.L().o(this.p, this.q, this.r);
    }
}
