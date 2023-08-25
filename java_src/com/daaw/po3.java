package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class po3 extends bp2 implements ro3 {
    public po3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.daaw.ro3
    public final void P2(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(1, D);
    }

    @Override // com.daaw.ro3
    public final void U2(mn3 mn3Var) {
        Parcel D = D();
        dp2.g(D, mn3Var);
        M(4, D);
    }

    @Override // com.daaw.ro3
    public final void a(String str) {
        Parcel D = D();
        D.writeString("Adapter returned null.");
        M(2, D);
    }

    @Override // com.daaw.ro3
    public final void zzf(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }
}
