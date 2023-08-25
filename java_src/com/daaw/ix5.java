package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
/* loaded from: classes.dex */
public final class ix5 implements zzf {

    /* renamed from: a */
    public final /* synthetic */ pz4 f14108a;

    public ix5(jx5 jx5Var, pz4 pz4Var) {
        this.f14108a = pz4Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.f14108a.mo9319a().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.f14108a.mo9318b().zza();
        this.f14108a.mo9317e().zza();
    }
}
