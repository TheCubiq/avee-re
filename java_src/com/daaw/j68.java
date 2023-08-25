package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class j68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ox3 f14463p;

    /* renamed from: q */
    public final /* synthetic */ zzaw f14464q;

    /* renamed from: r */
    public final /* synthetic */ String f14465r;

    /* renamed from: s */
    public final /* synthetic */ AppMeasurementDynamiteService f14466s;

    public j68(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var, zzaw zzawVar, String str) {
        this.f14466s = appMeasurementDynamiteService;
        this.f14463p = ox3Var;
        this.f14464q = zzawVar;
        this.f14465r = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14466s.f37054p.m24047L().m5459o(this.f14463p, this.f14464q, this.f14465r);
    }
}
