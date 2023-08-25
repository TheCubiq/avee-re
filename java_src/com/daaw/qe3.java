package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class qe3 extends bp2 implements se3 {
    public qe3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.daaw.se3
    public final boolean zzb(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(2, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
