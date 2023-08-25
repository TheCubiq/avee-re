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
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(1, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        m25951I.recycle();
        return readStrongBinder;
    }
}
