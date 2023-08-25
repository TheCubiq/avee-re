package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class ek8 implements mk7 {

    /* renamed from: a */
    public final v04 f8543a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f8544b;

    public ek8(AppMeasurementDynamiteService appMeasurementDynamiteService, v04 v04Var) {
        this.f8544b = appMeasurementDynamiteService;
        this.f8543a = v04Var;
    }

    @Override // com.daaw.mk7
    /* renamed from: a */
    public final void mo15984a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f8543a.mo7560T(str, str2, bundle, j);
        } catch (RemoteException e) {
            dr6 dr6Var = this.f8544b.f37054p;
            if (dr6Var != null) {
                dr6Var.mo3895i().m14155w().m20652b("Event interceptor threw exception", e);
            }
        }
    }
}
