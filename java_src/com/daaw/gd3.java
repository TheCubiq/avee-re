package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class gd3 extends bp2 implements InterfaceC1684id3 {
    public gd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.daaw.InterfaceC1684id3
    /* renamed from: d0 */
    public final IBinder mo19913d0(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        dp2.m24101g(m25952D, yd0Var3);
        Parcel m25951I = m25951I(1, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        m25951I.recycle();
        return readStrongBinder;
    }
}
