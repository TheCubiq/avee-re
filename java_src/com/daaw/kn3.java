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
        Parcel m25951I = m25951I(1, m25952D());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.mn3
    public final boolean zzf() {
        Parcel m25951I = m25951I(2, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }
}
