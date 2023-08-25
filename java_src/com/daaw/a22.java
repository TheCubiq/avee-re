package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
/* loaded from: classes.dex */
public final class a22 extends mz1 {
    public a22(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: g3 */
    public final void m27750g3(TelemetryData telemetryData) {
        Parcel m15654D = m15654D();
        s02.m10802b(m15654D, telemetryData);
        m15652M(1, m15654D);
    }
}
