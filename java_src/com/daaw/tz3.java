package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes2.dex */
public abstract class tz3 extends kd3 implements v04 {
    public tz3() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.daaw.kd3
    public final boolean D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            ne3.c(parcel);
            T(parcel.readString(), parcel.readString(), (Bundle) ne3.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        }
        return true;
    }
}
