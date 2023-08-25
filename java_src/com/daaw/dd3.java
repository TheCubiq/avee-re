package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class dd3 extends bp2 implements fd3 {
    public dd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.daaw.fd3
    public final void zzb(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.fd3
    public final void zzc(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.fd3
    public final void zzd() {
        m25950M(2, m25952D());
    }
}
