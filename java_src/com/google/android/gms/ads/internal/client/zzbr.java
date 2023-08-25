package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class zzbr extends bp2 {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
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
