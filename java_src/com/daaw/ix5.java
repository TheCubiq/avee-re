package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
/* loaded from: classes.dex */
public final class ix5 implements zzf {
    public final /* synthetic */ pz4 a;

    public ix5(jx5 jx5Var, pz4 pz4Var) {
        this.a = pz4Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.a.a().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.a.b().zza();
        this.a.e().zza();
    }
}
