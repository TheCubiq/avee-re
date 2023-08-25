package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
/* loaded from: classes.dex */
public final class l33 extends bp2 {
    public l33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long h3(zzbei zzbeiVar) {
        Parcel D = D();
        dp2.e(D, zzbeiVar);
        Parcel I = I(3, D);
        long readLong = I.readLong();
        I.recycle();
        return readLong;
    }

    public final zzbef i3(zzbei zzbeiVar) {
        Parcel D = D();
        dp2.e(D, zzbeiVar);
        Parcel I = I(1, D);
        zzbef zzbefVar = (zzbef) dp2.a(I, zzbef.CREATOR);
        I.recycle();
        return zzbefVar;
    }

    public final zzbef j3(zzbei zzbeiVar) {
        Parcel D = D();
        dp2.e(D, zzbeiVar);
        Parcel I = I(2, D);
        zzbef zzbefVar = (zzbef) dp2.a(I, zzbef.CREATOR);
        I.recycle();
        return zzbefVar;
    }
}
