package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class d38 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ox3 f6459p;

    /* renamed from: q */
    public final /* synthetic */ AppMeasurementDynamiteService f6460q;

    public d38(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var) {
        this.f6460q = appMeasurementDynamiteService;
        this.f6459p = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6460q.f37054p.m24047L().m5466R(this.f6459p);
    }
}
