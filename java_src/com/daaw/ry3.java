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
    public final void T(String str, String str2, Bundle bundle, long j) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.e(D, bundle);
        D.writeLong(j);
        M(1, D);
    }

    @Override // com.daaw.v04
    public final int zzd() {
        Parcel I = I(2, D());
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }
}
