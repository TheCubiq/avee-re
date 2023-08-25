package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class zzbv extends bp2 {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i, int i2) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        D.writeInt(i2);
        Parcel I = I(2, D);
        IBinder readStrongBinder = I.readStrongBinder();
        I.recycle();
        return readStrongBinder;
    }
}
