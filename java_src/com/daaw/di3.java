package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class di3 extends bp2 implements fi3 {
    public di3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.daaw.fi3
    public final ci3 O2(yd0 yd0Var, an3 an3Var, int i, zh3 zh3Var) {
        ci3 ai3Var;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        dp2.g(D, zh3Var);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            ai3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            ai3Var = queryLocalInterface instanceof ci3 ? (ci3) queryLocalInterface : new ai3(readStrongBinder);
        }
        I.recycle();
        return ai3Var;
    }
}
