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
        Parcel I = I(2, D());
        an3 g3 = zm3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() {
        Parcel I = I(1, D());
        zzen zzenVar = (zzen) dp2.a(I, zzen.CREATOR);
        I.recycle();
        return zzenVar;
    }
}
