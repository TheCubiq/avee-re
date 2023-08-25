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
    /* renamed from: J */
    public final ar3 mo24059J(yd0 yd0Var, an3 an3Var, int i) {
        ar3 yq3Var;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(1, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            yq3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            yq3Var = queryLocalInterface instanceof ar3 ? (ar3) queryLocalInterface : new yq3(readStrongBinder);
        }
        m25951I.recycle();
        return yq3Var;
    }
}
