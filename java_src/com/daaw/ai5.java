package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.pa;
/* loaded from: classes2.dex */
public final class ai5 extends pa {
    public ai5(Context context, Looper looper, pa.a aVar, pa.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof ua5 ? (ua5) queryLocalInterface : new o85(iBinder);
    }

    @Override // com.daaw.pa
    public final int getMinApkVersion() {
        return c80.a;
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.measurement.START";
    }
}
