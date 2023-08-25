package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class kf8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ox3 f16350p;

    /* renamed from: q */
    public final /* synthetic */ String f16351q;

    /* renamed from: r */
    public final /* synthetic */ String f16352r;

    /* renamed from: s */
    public final /* synthetic */ AppMeasurementDynamiteService f16353s;

    public kf8(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var, String str, String str2) {
        this.f16353s = appMeasurementDynamiteService;
        this.f16350p = ox3Var;
        this.f16351q = str;
        this.f16352r = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16353s.f37054p.m24047L().m5464T(this.f16350p, this.f16351q, this.f16352r);
    }
}
