package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
/* loaded from: classes.dex */
public final class n23 extends bp2 implements p23 {
    public n23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.daaw.p23
    public final void V2(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(6, D);
    }

    @Override // com.daaw.p23
    public final void Y0(zzdg zzdgVar) {
        Parcel D = D();
        dp2.g(D, zzdgVar);
        M(7, D);
    }

    @Override // com.daaw.p23
    public final void t1(yd0 yd0Var, w23 w23Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, w23Var);
        M(4, D);
    }

    @Override // com.daaw.p23
    public final zzdn zzf() {
        Parcel I = I(5, D());
        zzdn zzb = zzdm.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }
}
