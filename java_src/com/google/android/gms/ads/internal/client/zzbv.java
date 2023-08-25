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
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        m25952D.writeInt(i2);
        Parcel m25951I = m25951I(2, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        m25951I.recycle();
        return readStrongBinder;
    }
}
