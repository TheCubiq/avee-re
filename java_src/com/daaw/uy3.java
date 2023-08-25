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
    public final void B0(String str, String str2, Bundle bundle) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, bundle);
        M(3, D);
    }

    @Override // com.daaw.wy3
    public final void zzb(String str) {
        Parcel D = D();
        D.writeString(str);
        M(2, D);
    }
}
