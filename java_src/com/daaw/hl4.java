package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* loaded from: classes2.dex */
public final class hl4 extends t70<v07> {
    public hl4(Context context, Looper looper, xf xfVar, ej ejVar, du0 du0Var) {
        super(context, looper, 300, xfVar, ejVar, du0Var);
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof v07 ? (v07) queryLocalInterface : new v07(iBinder);
    }

    @Override // com.daaw.pa
    public final Feature[] getApiFeatures() {
        return he5.b;
    }

    @Override // com.daaw.pa
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.daaw.pa
    public final boolean n() {
        return true;
    }

    @Override // com.daaw.pa
    public final boolean usesClientTelemetry() {
        return true;
    }
}
