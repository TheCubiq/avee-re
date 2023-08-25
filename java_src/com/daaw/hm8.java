package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class hm8 implements pl7 {

    /* renamed from: a */
    public final v04 f12678a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f12679b;

    public hm8(AppMeasurementDynamiteService appMeasurementDynamiteService, v04 v04Var) {
        this.f12679b = appMeasurementDynamiteService;
        this.f12678a = v04Var;
    }

    @Override // com.daaw.pl7
    /* renamed from: a */
    public final void mo3611a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f12678a.mo7560T(str, str2, bundle, j);
        } catch (RemoteException e) {
            dr6 dr6Var = this.f12679b.f37054p;
            if (dr6Var != null) {
                dr6Var.mo3895i().m14155w().m20652b("Event listener threw exception", e);
            }
        }
    }
}
