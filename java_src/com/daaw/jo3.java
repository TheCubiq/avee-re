package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class jo3 extends bp2 implements oo3 {
    public jo3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.daaw.oo3
    /* renamed from: a */
    public final void mo11047a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString("Adapter returned null.");
        m25950M(3, m25952D);
    }

    @Override // com.daaw.oo3
    public final void zzf(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.oo3
    public final void zzg() {
        m25950M(2, m25952D());
    }
}
