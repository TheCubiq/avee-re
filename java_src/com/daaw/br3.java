package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class br3 extends bp2 implements dr3 {
    public br3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.daaw.dr3
    public final ar3 J(yd0 yd0Var, an3 an3Var, int i) {
        ar3 yq3Var;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            yq3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            yq3Var = queryLocalInterface instanceof ar3 ? (ar3) queryLocalInterface : new yq3(readStrongBinder);
        }
        I.recycle();
        return yq3Var;
    }
}
