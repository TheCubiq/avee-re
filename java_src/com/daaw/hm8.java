package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes2.dex */
public final class hm8 implements pl7 {
    public final v04 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public hm8(AppMeasurementDynamiteService appMeasurementDynamiteService, v04 v04Var) {
        this.b = appMeasurementDynamiteService;
        this.a = v04Var;
    }

    @Override // com.daaw.pl7
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.T(str, str2, bundle, j);
        } catch (RemoteException e) {
            dr6 dr6Var = this.b.p;
            if (dr6Var != null) {
                dr6Var.i().w().b("Event listener threw exception", e);
            }
        }
    }
}
