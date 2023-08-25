package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
/* loaded from: classes.dex */
public final class a22 extends mz1 {
    public a22(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void g3(TelemetryData telemetryData) {
        Parcel D = D();
        s02.b(D, telemetryData);
        M(1, D);
    }
}
