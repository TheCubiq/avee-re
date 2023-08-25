package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* loaded from: classes2.dex */
public final class hl4 extends t70<v07> {
    public hl4(Context context, Looper looper, C3536xf c3536xf, InterfaceC1192ej interfaceC1192ej, du0 du0Var) {
        super(context, looper, 300, c3536xf, interfaceC1192ej, du0Var);
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof v07 ? (v07) queryLocalInterface : new v07(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    public final Feature[] getApiFeatures() {
        return he5.f12477b;
    }

    @Override // com.daaw.AbstractC2527pa
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: n */
    public final boolean mo13553n() {
        return true;
    }

    @Override // com.daaw.AbstractC2527pa
    public final boolean usesClientTelemetry() {
        return true;
    }
}
