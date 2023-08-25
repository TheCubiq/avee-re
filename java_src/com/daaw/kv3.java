package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class kv3 extends hc3 implements ox3 {
    public kv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.daaw.ox3
    public final void T0(Bundle bundle) {
        Parcel D = D();
        ne3.e(D, bundle);
        M(1, D);
    }
}
