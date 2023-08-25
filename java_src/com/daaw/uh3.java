package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class uh3 extends bp2 implements zh3 {
    public uh3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.daaw.zh3
    public final void zzb(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(1, m25952D);
    }
}
