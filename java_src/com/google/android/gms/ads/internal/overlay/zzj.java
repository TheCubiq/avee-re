package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakk;
@zzadh
/* loaded from: classes.dex */
final class zzj extends zzajx {
    final /* synthetic */ zzd zzbyg;

    private zzj(zzd zzdVar) {
        this.zzbyg = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzj(zzd zzdVar, zzf zzfVar) {
        this(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        Bitmap zza = zzbv.zzfe().zza(Integer.valueOf(this.zzbyg.zzbxn.zzbyw.zzzj));
        if (zza != null) {
            zzakk.zzcrm.post(new zzk(this, zzbv.zzem().zza(this.zzbyg.mActivity, zza, this.zzbyg.zzbxn.zzbyw.zzzh, this.zzbyg.zzbxn.zzbyw.zzzi)));
        }
    }
}
