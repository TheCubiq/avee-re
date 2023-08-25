package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ad3 extends bp2 implements cd3 {
    public ad3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.daaw.cd3
    public final IBinder g1(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, yd0Var2);
        dp2.g(D, yd0Var3);
        D.writeInt(224400000);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        I.recycle();
        return readStrongBinder;
    }
}
