package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzfth;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfts;
/* loaded from: classes.dex */
public final class tt6 extends bp2 {
    public tt6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzftj h3(zzfth zzfthVar) {
        Parcel D = D();
        dp2.e(D, zzfthVar);
        Parcel I = I(1, D);
        zzftj zzftjVar = (zzftj) dp2.a(I, zzftj.CREATOR);
        I.recycle();
        return zzftjVar;
    }

    public final zzfts i3(zzftq zzftqVar) {
        Parcel D = D();
        dp2.e(D, zzftqVar);
        Parcel I = I(3, D);
        zzfts zzftsVar = (zzfts) dp2.a(I, zzfts.CREATOR);
        I.recycle();
        return zzftsVar;
    }

    public final void j3(zzfte zzfteVar) {
        Parcel D = D();
        dp2.e(D, zzfteVar);
        M(2, D);
    }
}
