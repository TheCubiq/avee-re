package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class s98 implements Runnable {
    public final /* synthetic */ ox3 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ AppMeasurementDynamiteService t;

    public s98(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var, String str, String str2, boolean z) {
        this.t = appMeasurementDynamiteService;
        this.p = ox3Var;
        this.q = str;
        this.r = str2;
        this.s = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.p.L().V(this.p, this.q, this.r, this.s);
    }
}
