package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
/* loaded from: classes2.dex */
public final class ai5 extends AbstractC2527pa {
    public ai5(Context context, Looper looper, AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b) {
        super(context, looper, 93, interfaceC2528a, interfaceC2529b, null);
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof ua5 ? (ua5) queryLocalInterface : new o85(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    public final int getMinApkVersion() {
        return c80.f5613a;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.measurement.START";
    }
}
