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
    /* renamed from: V2 */
    public final void mo7136V2(boolean z) {
        Parcel m25952D = m25952D();
        dp2.m24104d(m25952D, z);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.p23
    /* renamed from: Y0 */
    public final void mo7134Y0(zzdg zzdgVar) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzdgVar);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.p23
    /* renamed from: t1 */
    public final void mo7133t1(yd0 yd0Var, w23 w23Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, w23Var);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.p23
    public final zzdn zzf() {
        Parcel m25951I = m25951I(5, m25952D());
        zzdn zzb = zzdm.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }
}
