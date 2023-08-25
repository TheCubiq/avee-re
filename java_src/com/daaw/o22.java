package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class o22 extends t70<a22> {

    /* renamed from: H */
    public final hk1 f20964H;

    public o22(Context context, Looper looper, C3536xf c3536xf, hk1 hk1Var, InterfaceC1192ej interfaceC1192ej, du0 du0Var) {
        super(context, looper, 270, c3536xf, interfaceC1192ej, du0Var);
        this.f20964H = hk1Var;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a22 ? (a22) queryLocalInterface : new a22(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    public final Feature[] getApiFeatures() {
        return j12.f14171b;
    }

    @Override // com.daaw.AbstractC2527pa
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: h */
    public final Bundle mo6176h() {
        return this.f20964H.m20656d();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: n */
    public final boolean mo13553n() {
        return true;
    }
}
