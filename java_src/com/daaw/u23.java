package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class u23 extends bp2 implements w23 {
    public u23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.daaw.w23
    public final void zzb() {
        M(5, D());
    }

    @Override // com.daaw.w23
    public final void zzc() {
        M(2, D());
    }

    @Override // com.daaw.w23
    public final void zzd(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }

    @Override // com.daaw.w23
    public final void zze() {
        M(4, D());
    }

    @Override // com.daaw.w23
    public final void zzf() {
        M(1, D());
    }
}
