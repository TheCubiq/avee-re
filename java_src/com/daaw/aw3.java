package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class aw3 extends bp2 {
    public aw3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(yd0 yd0Var, String str, an3 an3Var, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        I.recycle();
        return readStrongBinder;
    }
}
