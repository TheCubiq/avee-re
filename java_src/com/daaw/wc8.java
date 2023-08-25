package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class wc8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ek8 f31171p;

    /* renamed from: q */
    public final /* synthetic */ AppMeasurementDynamiteService f31172q;

    public wc8(AppMeasurementDynamiteService appMeasurementDynamiteService, ek8 ek8Var) {
        this.f31172q = appMeasurementDynamiteService;
        this.f31171p = ek8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31172q.f37054p.m24050I().m13714H(this.f31171p);
    }
}
