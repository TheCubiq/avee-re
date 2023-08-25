package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class zzdk extends bp2 {
    public zzdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdj zze(yd0 yd0Var, an3 an3Var, int i) {
        zzdj zzdhVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        I.recycle();
        return zzdhVar;
    }
}
