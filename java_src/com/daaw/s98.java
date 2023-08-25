package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class s98 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ox3 f26034p;

    /* renamed from: q */
    public final /* synthetic */ String f26035q;

    /* renamed from: r */
    public final /* synthetic */ String f26036r;

    /* renamed from: s */
    public final /* synthetic */ boolean f26037s;

    /* renamed from: t */
    public final /* synthetic */ AppMeasurementDynamiteService f26038t;

    public s98(AppMeasurementDynamiteService appMeasurementDynamiteService, ox3 ox3Var, String str, String str2, boolean z) {
        this.f26038t = appMeasurementDynamiteService;
        this.f26034p = ox3Var;
        this.f26035q = str;
        this.f26036r = str2;
        this.f26037s = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26038t.f37054p.m24047L().m5462V(this.f26034p, this.f26035q, this.f26036r, this.f26037s);
    }
}
