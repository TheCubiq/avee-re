package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ym3 extends bp2 implements an3 {
    public ym3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.daaw.an3
    public final boolean a(String str) {
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(2, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.an3
    public final boolean l(String str) {
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(4, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.an3
    public final dp3 m(String str) {
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(3, D);
        dp3 g3 = cp3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    @Override // com.daaw.an3
    public final dn3 zzb(String str) {
        dn3 bn3Var;
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            bn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bn3Var = queryLocalInterface instanceof dn3 ? (dn3) queryLocalInterface : new bn3(readStrongBinder);
        }
        I.recycle();
        return bn3Var;
    }
}
