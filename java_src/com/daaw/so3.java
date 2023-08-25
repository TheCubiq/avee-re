package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class so3 extends bp2 implements uo3 {
    public so3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.daaw.uo3
    /* renamed from: a */
    public final void mo7878a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString("Adapter returned null.");
        m25950M(3, m25952D);
    }

    @Override // com.daaw.uo3
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.uo3
    public final void zzg() {
        m25950M(2, m25952D());
    }
}
