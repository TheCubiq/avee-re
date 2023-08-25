package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class gd3 extends bp2 implements id3 {
    public gd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.daaw.id3
    public final IBinder d0(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, yd0Var2);
        dp2.g(D, yd0Var3);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        I.recycle();
        return readStrongBinder;
    }
}
