package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class te3 extends bp2 implements ve3 {
    public te3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.daaw.ve3
    /* renamed from: f */
    public final void mo4816f(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.ve3
    public final void zze() {
        m25950M(2, m25952D());
    }
}
