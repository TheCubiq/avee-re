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
        Parcel m25951I = m25951I(9, m25952D());
        Bundle bundle = (Bundle) dp2.m24107a(m25951I, Bundle.CREATOR);
        m25951I.recycle();
        return bundle;
    }

    @Override // com.daaw.wv3
    public final zzdn zzc() {
        Parcel m25951I = m25951I(12, m25952D());
        zzdn zzb = zzdm.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }

    @Override // com.daaw.wv3
    public final tv3 zzd() {
        tv3 rv3Var;
        Parcel m25951I = m25951I(11, m25952D());
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            rv3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            rv3Var = queryLocalInterface instanceof tv3 ? (tv3) queryLocalInterface : new rv3(readStrongBinder);
        }
        m25951I.recycle();
        return rv3Var;
    }

    @Override // com.daaw.wv3
    public final void zzf(zzl zzlVar, dw3 dw3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzlVar);
        dp2.m24101g(m25952D, dw3Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzg(zzl zzlVar, dw3 dw3Var) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzlVar);
        dp2.m24101g(m25952D, dw3Var);
        m25950M(14, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzh(boolean z) {
        Parcel m25952D = m25952D();
        dp2.m24104d(m25952D, z);
        m25950M(15, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzi(zzdd zzddVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzddVar);
        m25950M(8, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzj(zzdg zzdgVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzdgVar);
        m25950M(13, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzk(zv3 zv3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zv3Var);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzl(zzcdy zzcdyVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzcdyVar);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.wv3
    public final void zzm(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(5, m25952D);
    }
}
