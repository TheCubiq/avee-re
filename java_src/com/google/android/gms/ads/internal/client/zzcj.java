package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.bp2;
import com.daaw.dp2;
import com.daaw.zm3;
/* loaded from: classes.dex */
public final class zzcj extends bp2 implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final an3 getAdapterCreator() {
        Parcel m25951I = m25951I(2, m25952D());
        an3 m2113g3 = zm3.m2113g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m2113g3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() {
        Parcel m25951I = m25951I(1, m25952D());
        zzen zzenVar = (zzen) dp2.m24107a(m25951I, zzen.CREATOR);
        m25951I.recycle();
        return zzenVar;
    }
}
