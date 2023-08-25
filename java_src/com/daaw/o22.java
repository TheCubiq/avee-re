package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class o22 extends t70<a22> {
    public final hk1 H;

    public o22(Context context, Looper looper, xf xfVar, hk1 hk1Var, ej ejVar, du0 du0Var) {
        super(context, looper, 270, xfVar, ejVar, du0Var);
        this.H = hk1Var;
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a22 ? (a22) queryLocalInterface : new a22(iBinder);
    }

    @Override // com.daaw.pa
    public final Feature[] getApiFeatures() {
        return j12.b;
    }

    @Override // com.daaw.pa
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.daaw.pa
    public final Bundle h() {
        return this.H.d();
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.daaw.pa
    public final boolean n() {
        return true;
    }
}
