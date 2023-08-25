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
        Parcel D = D();
        D.writeString(str);
        M(1, D);
    }
}
