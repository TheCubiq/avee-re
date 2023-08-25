package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ir3 extends bp2 implements kr3 {
    public ir3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.daaw.kr3
    public final IBinder zze(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        I.recycle();
        return readStrongBinder;
    }
}
