package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class kn3 extends bp2 implements mn3 {
    public kn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.daaw.mn3
    public final yd0 zze() {
        Parcel I = I(1, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.mn3
    public final boolean zzf() {
        Parcel I = I(2, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
