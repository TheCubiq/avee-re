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
    public final void a(String str) {
        Parcel D = D();
        D.writeString("Adapter returned null.");
        M(3, D);
    }

    @Override // com.daaw.oo3
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(4, D);
    }

    @Override // com.daaw.oo3
    public final void zzg() {
        M(2, D());
    }
}
