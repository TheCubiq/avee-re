package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class uy3 extends bp2 implements wy3 {
    public uy3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.daaw.wy3
    /* renamed from: B0 */
    public final void mo5712B0(String str, String str2, Bundle bundle) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25952D.writeString(str2);
        dp2.m24103e(m25952D, bundle);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.wy3
    public final void zzb(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(2, m25952D);
    }
}
