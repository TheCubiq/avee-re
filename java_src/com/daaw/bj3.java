package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class bj3 extends bp2 implements dj3 {
    public bj3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.daaw.dj3
    public final void a(String str) {
        Parcel D = D();
        D.writeString(str);
        M(3, D);
    }

    @Override // com.daaw.dj3
    public final void zzf() {
        M(2, D());
    }
}
