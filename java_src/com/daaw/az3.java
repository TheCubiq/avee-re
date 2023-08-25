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
    /* renamed from: J */
    public final zy3 mo24857J(yd0 yd0Var, an3 an3Var, int i) {
        zy3 xy3Var;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(2, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            xy3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            xy3Var = queryLocalInterface instanceof zy3 ? (zy3) queryLocalInterface : new xy3(readStrongBinder);
        }
        m25951I.recycle();
        return xy3Var;
    }
}
