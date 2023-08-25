package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcdy;
/* loaded from: classes.dex */
public final class uv3 extends bp2 implements wv3 {
    public uv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.daaw.wv3
    public final Bundle zzb() {
        Parcel I = I(9, D());
        Bundle bundle = (Bundle) dp2.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    @Override // com.daaw.wv3
    public final zzdn zzc() {
        Parcel I = I(12, D());
        zzdn zzb = zzdm.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.wv3
    public final tv3 zzd() {
        tv3 rv3Var;
        Parcel I = I(11, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            rv3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            rv3Var = queryLocalInterface instanceof tv3 ? (tv3) queryLocalInterface : new rv3(readStrongBinder);
        }
        I.recycle();
        return rv3Var;
    }

    @Override // com.daaw.wv3
    public final void zzf(zzl zzlVar, dw3 dw3Var) {
        Parcel D = D();
        dp2.e(D, zzlVar);
        dp2.g(D, dw3Var);
        M(1, D);
    }

    @Override // com.daaw.wv3
    public final void zzg(zzl zzlVar, dw3 dw3Var) {
        Parcel D = D();
        dp2.e(D, zzlVar);
        dp2.g(D, dw3Var);
        M(14, D);
    }

    @Override // com.daaw.wv3
    public final void zzh(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(15, D);
    }

    @Override // com.daaw.wv3
    public final void zzi(zzdd zzddVar) {
        Parcel D = D();
        dp2.g(D, zzddVar);
        M(8, D);
    }

    @Override // com.daaw.wv3
    public final void zzj(zzdg zzdgVar) {
        Parcel D = D();
        dp2.g(D, zzdgVar);
        M(13, D);
    }

    @Override // com.daaw.wv3
    public final void zzk(zv3 zv3Var) {
        Parcel D = D();
        dp2.g(D, zv3Var);
        M(2, D);
    }

    @Override // com.daaw.wv3
    public final void zzl(zzcdy zzcdyVar) {
        Parcel D = D();
        dp2.e(D, zzcdyVar);
        M(7, D);
    }

    @Override // com.daaw.wv3
    public final void zzm(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(5, D);
    }
}
