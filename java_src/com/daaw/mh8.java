package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class mh8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ox3 f18881p;

    /* renamed from: q */
    public final /* synthetic */ AppMeasurementDynamiteService f18882q;

    public mh8(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var) {
        this.f18882q = appMeasurementDynamiteService;
        this.f18881p = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18882q.f37054p.m24045N().m24511D(this.f18881p, this.f18882q.f37054p.m24032m());
    }
}
