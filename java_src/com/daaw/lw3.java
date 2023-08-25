package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes2.dex */
public abstract class lw3 extends kd3 implements ox3 {
    public lw3() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.daaw.kd3
    public final boolean D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ne3.c(parcel);
            T0((Bundle) ne3.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
