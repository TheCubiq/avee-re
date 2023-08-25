package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ad3 extends bp2 implements cd3 {
    public ad3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.daaw.cd3
    /* renamed from: g1 */
    public final IBinder mo25417g1(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3, int i) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        dp2.m24101g(m25952D, yd0Var3);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(1, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        m25951I.recycle();
        return readStrongBinder;
    }
}
