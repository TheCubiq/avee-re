package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class ry3 extends hc3 implements v04 {
    public ry3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.daaw.v04
    /* renamed from: T */
    public final void mo7560T(String str, String str2, Bundle bundle, long j) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15205e(m20847D, bundle);
        m20847D.writeLong(j);
        m20845M(1, m20847D);
    }

    @Override // com.daaw.v04
    public final int zzd() {
        Parcel m20846I = m20846I(2, m20847D());
        int readInt = m20846I.readInt();
        m20846I.recycle();
        return readInt;
    }
}
