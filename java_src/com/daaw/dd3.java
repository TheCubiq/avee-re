package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class dd3 extends bp2 implements fd3 {
    public dd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.daaw.fd3
    public final void zzb(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(3, D);
    }

    @Override // com.daaw.fd3
    public final void zzc(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(1, D);
    }

    @Override // com.daaw.fd3
    public final void zzd() {
        M(2, D());
    }
}
