package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class y84 extends bp2 implements a94 {
    public y84(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.daaw.a94
    public final void K0(yd0 yd0Var, x84 x84Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, x84Var);
        M(2, D);
    }
}
