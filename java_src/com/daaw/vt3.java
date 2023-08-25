package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class vt3 extends bp2 implements xt3 {
    public vt3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.daaw.xt3
    public final void A1(zzccb zzccbVar, hu3 hu3Var) {
        Parcel D = D();
        dp2.e(D, zzccbVar);
        dp2.g(D, hu3Var);
        M(5, D);
    }

    @Override // com.daaw.xt3
    public final void L2(zzccb zzccbVar, hu3 hu3Var) {
        Parcel D = D();
        dp2.e(D, zzccbVar);
        dp2.g(D, hu3Var);
        M(4, D);
    }

    @Override // com.daaw.xt3
    public final void b2(zzccb zzccbVar, hu3 hu3Var) {
        Parcel D = D();
        dp2.e(D, zzccbVar);
        dp2.g(D, hu3Var);
        M(6, D);
    }

    @Override // com.daaw.xt3
    public final void j1(String str, hu3 hu3Var) {
        Parcel D = D();
        D.writeString(str);
        dp2.g(D, hu3Var);
        M(7, D);
    }
}
