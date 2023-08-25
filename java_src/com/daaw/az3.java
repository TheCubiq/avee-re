package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class az3 extends bp2 implements cz3 {
    public az3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.daaw.cz3
    public final zy3 J(yd0 yd0Var, an3 an3Var, int i) {
        zy3 xy3Var;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(2, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            xy3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            xy3Var = queryLocalInterface instanceof zy3 ? (zy3) queryLocalInterface : new xy3(readStrongBinder);
        }
        I.recycle();
        return xy3Var;
    }
}
