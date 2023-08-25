package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class bj3 extends bp2 implements dj3 {
    public bj3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.daaw.dj3
    /* renamed from: a */
    public final void mo23476a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.dj3
    public final void zzf() {
        m25950M(2, m25952D());
    }
}
