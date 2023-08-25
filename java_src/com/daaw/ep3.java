package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class ep3 extends bp2 implements gp3 {
    public ep3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.daaw.gp3
    /* renamed from: Z */
    public final void mo5731Z(zze zzeVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzeVar);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.gp3
    /* renamed from: a */
    public final void mo5730a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.gp3
    /* renamed from: f */
    public final void mo5729f(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(2, m25952D);
    }
}
